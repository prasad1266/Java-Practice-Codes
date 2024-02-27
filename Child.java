class Parent {
	
	int a=5;
	int b=10;
	void print1(){
 System.out.println("Hello Child");
	}				   
}
public class Child extends Parent {
	int c=20;
	void anotherFun(){
		  System.out.println("Hello Child Here...!");			
	}
	void print(){
	System.out.println(a);
System.out.println(b);
System.out.println(c);

}
	public static void main(String[] args) {
		System.out.println("Hello Main Method Here...!");			
		Child sb=new Child();
	sb.print();
		System.out.println("!...END OF FILE...!");
	}

}