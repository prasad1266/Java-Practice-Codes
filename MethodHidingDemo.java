class First{
	 void fun(){
	System.out.println("Hello fUN 1");
	myFun();
}
	private void myFun(){
	System.out.println("Hello mYfUN 1");
	}
	   
}
class Second extends First{
	void myFun(){
	System.out.println("Hello mYfUN 2");
}
	
}
public class MethodHidingDemo{
public static void main(String args[]){
	Second sc = new Second();
sc.fun();

	}
}
