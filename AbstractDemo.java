abstract class First{
abstract void fun();
	   
}
class Second extends First{
	void myFun(){
	System.out.println("Hello");
}
	void fun(){
	System.out.println("Hello Abstract Method");
	}
}
public class AbstractDemo{
public static void main(String args[]){
	Second sc = new Second();
sc.myFun();
sc.fun();
	}
}


