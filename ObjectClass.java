class ObjectClass{
	int a;
	int b;
 	static int c=30;

ObjectClass(int a,int b){
	this.a=a;
	this.b=b;
	}
	static void print(){
//	System.out.println(a);
//	System.out.println(b);		Non-static Datamember cant Access
	System.out.println(c);

	}
	 void print1(){
System.out.println("Print1 Function :  ");
	System.out.println(a);
	System.out.println(b);		
	System.out.println(c);

	}

	public static void main(String[] args){
//	System.out.println(ObjectClass.c);

	ObjectClass obj =new ObjectClass(10,20);
	obj.print();
	obj.print1();

 /*	c++;
	obj.print();
*/
  }
}