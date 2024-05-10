#include <iostream>
#include <thread>
#include <mutex>
#include <condition_variable>
#include <stdexcept>
#include <vector>

//  Declared Constants
const int THREADS = 3;      //Number of Threads
const int MAX_COUNT = 5;    //Maximum counter      

// Declared Global variables
std::mutex mtx;    		 //Synchronising shared Data 
std::condition_variable cv;     // Condition variable for threadsynchronization.    
int counter = 0;          	 // shared Counter
bool done = false;        	  //flag for indicate thread execution ended

void increment_counter(int id) {
    for (int i = 0; i < MAX_COUNT; ++i) {
        std::unique_lock<std::mutex> lock(mtx);     //Thread Lock the mtx 
        cv.wait(lock, [] { return counter < MAX_COUNT; });		//// Wait until counter < MAX_COUNT

	// increment counter
        if (counter < MAX_COUNT) {
            ++counter;
            std::cout << "Thread " << id << " incremented counter to: " << counter << std::endl;
        }
	
        lock.unlock();
        cv.notify_one();
    }
}

void decrement_counter(int id) {
    for (int i = 0; i < MAX_COUNT; ++i) {
        std::unique_lock<std::mutex> lock(mtx);
        cv.wait(lock, [] { return counter > 0; });   // Wait until counter > 0

	// Decrement counter 
        if (counter > 0) {
            --counter;
            std::cout << "Thread " << id << " decremented counter to: " << counter << std::endl;
        }

        lock.unlock();
        cv.notify_one();			//// Notify one waiting thread
    }
}

int main() {
    std::vector<std::thread> threads;   // A vector threads to store thread objects.

	
    for (int i = 0; i < THREADS; ++i) {				// Create threads for incrementing and decrementing the counter
        if (i % 2 == 0) {
            threads.push_back(std::thread(increment_counter, i));   //Even Thread Increment Counter
        } else {
            threads.push_back(std::thread(decrement_counter, i));   //Odd Thread Decrement Counter
        }
    }

    for (auto& thread : threads) {		// Join all threads
    
        if (thread.joinable()) {
            thread.join();
        }
    }

	 // Notify all threads that they can exit
    done = true;
    cv.notify_all();

	// Check if counter value is correct

    if (counter != 0) {
        throw std::runtime_error("Counter value != 0 after all threads finished");
    }

	// Print final counter value
    std::cout << "Counter value is correct: " << counter << std::endl;

    return 0;
}