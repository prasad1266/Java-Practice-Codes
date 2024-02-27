interface MyInterface {
	static void myFun(){			//java 8 can have static  methods
		System.out.println("Myfun:");
		}
	default void anotherFun(){			//java 8 can have default  methods
		System.out.println("Another Fun");
		}
	void oneFun();
}
class MyClass implements MyInterface{
 static void myFun(){
	System.out.println("OneFun");
	}


public void oneFun() {
	// TODO Auto-generated method stub
	System.out.println("OneFun");
}
}
public class InterfaceFeaturesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClass obj = new MyClass();
		MyInterface.myFun();
		obj.anotherFun();
		obj.oneFun();

	}

}