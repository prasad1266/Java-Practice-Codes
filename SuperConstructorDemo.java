class Parent{
private int a;
	Parent(){
	System.out.println("Hello ParentConstructor");
	a=1;
	}
Parent(int a){
	System.out.println("Hello Parent 1 ARGS Constructor");
 	this.a=a;
	}
void print(){
	System.out.println("Parent print :"+a);
  }
}
class Child extends Parent{
	int b;
	Child (){
	System.out.println("Hello CHild Constructor");
	b=1;							
	}
Child (int a ,int b){
	super(a);
	System.out.println("Hello CHild 2ARGS Constructor");
//	this.a=a;			Private cant access
	this.b=b;
	}
void print(){
	super.print();
	System.out.println( "CHild print: "+b);
  }
}
public class SuperConstructorDemo{
public static void main(String[] args){
//	Child  ab = new Child();

	Child  ab = new Child(5,10);
	ab.print();
	}
}
