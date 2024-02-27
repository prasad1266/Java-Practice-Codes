public class ThrowsDemo {
	static void myfun() throws  ArithmeticException{
		int res=5/0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Program execution started");
try {
	myfun();
	
}
catch(ArithmeticException ae){
	System.out.println("ArithmeticException caught inside Main");
}
System.out.println("Program execution Completed");
	}

}