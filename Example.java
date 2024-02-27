class Example{
 void myFun(int a, int b){
 a=a+2;
b=b+2;
System.out.println(a+"  "+b);
	}
	public static void main(String args[]){
	int a=5;
	int b=10;

	new Example().myFun(a,b);
System.out.println(a);
System.out.println(b);
	
	}
}