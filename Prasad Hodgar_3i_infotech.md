# Multithreaded Application

## Instructions

1. Compile the code:
   
         g++ -std=c++11 -pthread main.cpp -o multithreaded_app

2. Run the App:

            ./multithreaded_app

## Explanation of Design Choices

1. **Threading Model**: The application uses C++11 threads (`<thread>` header) for multithreading .

2. **Synchronization Mechanisms**: Mutexes and condition variables are used for synchronization and shared resources. 

3. **Thread Functions**: Two thread functions are implemented: `increment_counter` and `decrement_counter`, each Working for incrementing and decrementing the shared counter, respectively.

## Performance Considerations

1. **Efficient Synchronization**: By using mutexes and condition variables, threads wait only when necessary.

2. **Optimized Thread Functions**: The thread functions are designed to perform minimum work while having the mutex, reducing the time threads spend waiting for access to shared resources.

3. **Avoidance of Busy Waiting**: Condition variables are used to allow threads to wait efficiently .


# Multithreaded Application Report

## Design Choices

1. **Threading Model**: The application utilizes C++11 threads for multithreading .

2. **Synchronization Mechanisms**: Mutexes and condition variables are chosen for synchronization to ensure thread safety.

## Synchronization Mechanisms Used

1. **Mutexes**: Mutexes are used to provide exclusive access to shared resources(i.e.only one thread can modify the counter at a time.)

2. **Condition Variables**: Condition variables are used to coordinate the execution of threads.

## Performance Considerations

1. **Efficient Synchronization**: By using mutexes and condition variables, the application minimizes contention and overhead associated with thread synchronization.

2. **Optimized Thread Functions**: The thread functions are designed to perform minimal work while holding the mutex, reducing the time threads spend waiting for access to shared resources.

3. **Avoidance of Busy Waiting**: Condition variables are used to allow threads to wait efficiently
