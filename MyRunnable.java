public class MyRunnable implements Runnable {
    private int count;

    public MyRunnable(int count) {

        this.count = count;
    }

    @Override
    public void run() { // synchronized
        // TODO Auto-generated method stub
        for (int i = 0; i < count; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
        }
    }

    public static void main(String[] args) {
        int []arr  = {1,2,3,4,5};
        int []newArray = arr.clone();
        System.out.println("Element : "+newArray[0]);
for(int i:newArray){
    System.out.print(i+" ");
}

        int x = 128;
        short b=32000;
        System.out.println("Short Value : "+b);
         byte val = (byte) x;
       
        System.out.println(" Byte Value :" + val);

        // int y=3;
        // int result1 = (x>y)?(x*y):(x+y);
        // System.out.println(result1);
        // try {
        // int result = x/y;
        // System.out.println(result);
        // } catch (ArithmeticException e) {
        // // TODO: handle exception
        // System.out.println(e.getMessage());
        // }
        char ch = 'A';
        int num = ch;
        // System.out.println("Number "+num);
        MyRunnable th = new MyRunnable(5);
        Thread t1 = new Thread(th);
        Thread t2 = new Thread(th);
        // t1.start(); //Thread-0:0
        // t2.start();
        // t1.run(); // main:0
        // t2.run();
    }
}
