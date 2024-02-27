

class StringPrinter{

void print(String str){
{
System.out.prinn("[");
System.out.print("Hello");
System.out.print("]");
	}
}
class Mythread implements Runnable{
	
	
	Thread t;
	StringPrinter sp;
	
	Mythread (StringPrinter sp,String strToPrint){
		t= new Thread(this);
		this.sp = sp;
		this.strToPrint= strToPrint;
		t.start();
		}

	public void run(){
		sp.print(strToPrint);
		}
}

class NonSynchronizationDemo{
public static void main(String[] args){
	StringPrinter sp = new StringPrinter();
	
	Mythread mth1 = new Mythread (sp, "hello");
	Mythread mth2 = new Mythread (sp, "Friends");
	Mythread mth3 = new Mythread (sp, "Welcome");



	}
}


