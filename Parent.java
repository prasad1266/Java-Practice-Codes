class Parent {
	
	int a=5;
	int b=10;
	void print1(){
 System.out.println("Hello Child");
	}				// 3	   
}
public class Child extends Parent {
	int c=20;
	void anotherFun(){
		  System.out.println("Hello Child Here...!");			// 4
	}
	void print(){
	System.out.println(a);
System.out.println(b);
System.out.println(c);

}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello Main Method Here...!");			// 2
		Child sb=new Child();
sb.print();
		System.out.println("!...END OF FILE...!");
	}

}