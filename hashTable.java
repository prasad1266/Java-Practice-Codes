import java.util.Arrays;
import java.util.List;

public class hashTable extends Thread {
    hashTable(String name){
        super(name);
    }
    public void run(){    
        for(int i=1;i<=5;i++){    
         try{    
          Thread.sleep(500);    
         }catch(Exception e){System.out.println(e);}    
        System.out.println(Thread.currentThread().getName()+" "+i);    
        }
    } 
    
    public static int max(List<Integer> list){
        Integer max = 0;    //Integer.MIN_VALUE;
        for(Integer val: list){
            if(val>max){
                max = val;
            }
        }
        return max;
    }
   
    public static void main(String[] args) throws InterruptedException {
//         hashTable t1 = new hashTable("t1");
//     t1.start();
// hashTable t2 = new hashTable("t2");
//     t1.join();
//     t2.start();

        List<Integer> list  = Arrays.asList(-5,-10,-15,-55,-25,-30);

        System.out.println("Maximum of List is : "+ max(list));
       
 

    // int n = 10; // Change n to generate Fibonacci sequence up to desired number
    //     System.out.println("Fibonacci Series:");
    //     for (int i = 0; i < n; i++) {
    //         System.out.print(fibonacci(i) + " ");
    //     }
    // }
   


    // public static int fibonacci(int n) {
    //     if (n <= 1) {
    //         return n;
    //     } else {
    //         return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

