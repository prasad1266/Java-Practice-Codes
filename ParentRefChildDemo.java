 class First{
void myFun(){
	System.out.println("Hello Parent Method");
	} 
}
class Second extends First{
	void myFun(){
	System.out.println("Hello Child method");
}
	
}
public class ParentRefChildDemo{
public stati                c void main(String args[]){
	First f = new Second();					// UpCasting
	f.myFun();

	}
}

