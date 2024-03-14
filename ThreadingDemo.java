public class ThreadingDemo extends Thread {
    public void run() {
        System.out.println("Starting Thread : " + Thread.currentThread().getName() + " " );
        for (int i = 1; i <= 4; i++) {

            try {
                Thread.sleep(500);
                System.out.println("Thread : " + Thread.currentThread().getName() + " " + i);
               
            } catch (Exception e) {
                System.out.println(e);
            }

        }
    }

    public static void main(String[] args) {
        ThreadingDemo obj = new ThreadingDemo();
        Thread th1 = new Thread(obj);
        Thread th2 = new Thread(obj);
        th2.start();

        try {
            // th1.join();
            
            th2.join(2000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        th1.start();

    }

}
