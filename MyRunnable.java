public class MyRunnable implements Runnable {
    private int count;

    public MyRunnable(int count) {

        this.count = count;
    }

    @Override
    public void run() {                //synchronized
        // TODO Auto-generated method stub
        for (int i = 0; i < count; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
        }
    }

    public static void main(String[] args) {
        char ch = 'A';
        int num = ch;
        System.out.println("Number "+num);
        MyRunnable th = new MyRunnable(5);
        Thread t1 = new Thread(th);
        Thread t2 = new Thread(th);
         t1.start();            //Thread-0:0
         t2.start();
        //  t1.run();           // main:0
        //  t2.run();
    }
}
