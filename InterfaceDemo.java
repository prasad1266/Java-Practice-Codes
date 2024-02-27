interface MyInterface1{
	public void fun1();
}
interface MyInterface2{
	public void fun2();
}
class First{
	void myFun(){
	System.out.println("MyFun Of first");
}
}
class Second extends First implements MyInterface1,MyInterface2{
	public void fun1(){
	System.out.println("Fun1 Of Second");
	}
	public void fun2(){
	System.out.println("Fun2 Of Second");
	}
}
class Third extends Second {

}
	class InterfaceDemo{
	public static void main(String[] args){
	// 	Second s= new Second();
		First s= new Third();
//	s.fun1();
//	s.fun2();
	s.myFun();
	}
}