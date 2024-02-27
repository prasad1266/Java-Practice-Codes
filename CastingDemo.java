class First{
	void myFun(){
	System.out.println("MyFun Of first");
}
}
class Second extends First {

	public void fun2(){
	System.out.println("Fun2 Of Second");
	}

}
class Third {

}
public class CastingDemo{
public static void main(String[] args){
	First f;
	f= new First();
	Second s;
	s= new Second();
	//f=s;			// UpCasting
	s=(Second)f;		// DownCasting

//First f= new second ()
//Second s;
//S= (second)f;

System.out.println("FINE");
	}
}