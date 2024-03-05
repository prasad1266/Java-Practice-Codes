
class abc{
    private int count = 0;
    public synchronized void increment(){
        count++;
    }
    public synchronized int getcount(){
        return count;
    }
}
public class SynchronizedDemo {
    
    public static synchronized void print(String msg){

        // for (int i=0;i<5; i++){
        //     System.out.print("[ "+msg);
        //     try{
        //         Thread.sleep(100);
        //     }catch(InterruptedException ex){
        //         ex.printStackTrace();
        //     }
        //     System.out.print(" ]");
        // }
    }
    public static void main(String[] args) {
        abc a = new abc();
        Runnable task =()->{
            for(int i=0;i<1000;i++){
                a.increment();
            }
         
        };
        // Runnable task2 =()->{
        //     print("world");
        // };
        Thread t1 = new Thread(task);
        

            Thread t2 = new Thread(task);
            t1.start();
            t2.start();
            try {
                t1.join();
                t2.join();
            } catch (InterruptedException ex ) {
              ex.printStackTrace();
            }
            System.out.println(a.getcount());       //2000
    }
}
