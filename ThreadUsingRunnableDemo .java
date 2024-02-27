
class MyThread implements Runnable
{
	Thread t;
	MyThread(){
		t = new Thread(this);				//Thread Object
		t.start();
	}
	MyThread(String tname){
		t = new Thread(this);				//Thread Object
		t.setName(tname);
		t.start();
	}

public void run(){
System.out.println(t.getName()+" Completed Execution .");
	}
}


public class ThreadUsingRunnableDemo{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		MyThread mth1 = new MyThread("thread1");	
		MyThread mth2 = new MyThread("thread2");	
		MyThread mth3 = new MyThread("thread3");	//Runnable Object
		
//		Thread t1 = new Thread(mth1);			//Thread Object
//		t1.start();
//		mth1.t.join();
		
		System.out.println("main thread completed");	
		
	}

}