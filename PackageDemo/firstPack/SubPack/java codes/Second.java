class First{
public int a;      	//anywhere
private int b;		//WIthin class
int c;			//Within package Only (Default)
protected int d;	//WIthin same package child class
void firstFun(){
System.out.println(a);
System.out.println(b);
System.out.println(c);
System.out.println(d);
   }
}
public class Second extends First{
	 void firstFun(){
		System.out.println(a);		//OK
	//	System.out.println(b);		//error
		System.out.println(c);		//OK
		System.out.println(d);		//OK
   }	
public static void main(String args[]){
Second sc=new Second();
sc.firstFun();

	}
}