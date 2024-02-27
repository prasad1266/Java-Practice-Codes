class First{
int a;
int b;

First(){
}
First(int a, int b){
this.a=a;
this.b=b;
  }
}
class ObjectClassDemo{
public static void main(String[] args){
	First obj1 = new First(5,10);
	First obj2 = new First(5,10);
//					obj2=obj1;		Assigning Reference To eachOther Equal Object
	
	if(obj1.equals(obj2)){						//reference Compare
		System.out.println("Objects Are Equal");

	    }	
	else{
	System.out.println("Objects Are Not Equal");
		}
	//int hashcode()						//hashCode Compare
	System.out.println("Hascode of obj1 is :"+obj1.hashCode());
	System.out.println("Hascode of obj2 is :"+obj2.hashCode());

//		toString();				ClassName@hashCode in HexaDecimal Point
	System.out.println("obj1.toString is : "+obj1.toString());
	System.out.println("obj2.toString is : "+obj2.toString());

	}
}