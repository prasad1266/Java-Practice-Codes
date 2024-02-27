class First{
void myFun(){
System.out.println("MyFun of First");
	}
}
class Second extends First{
void myFun(){

System.out.println("Myfun of second");
super.myFun();				 // for methods not mandotory to write it first
	}
}
class SuperExp{
public static void main(String[] args){
	Second obj = new Second();
	obj.myFun();
	}
}