import java.io.*;
class MyException extends RuntimeException{

	MyException(){
		
	}
	
	MyException(String msg){
		super(msg);
	}
}

class UserDefinedUnCheckedEXceptionClassDemo{

	static void myFun() throws MyException{

		System.out.println("MyFun called here");
		//throws MyException("Hello");
	}
	public static void main(String[] args) {
		myFun();
		System.out.println("program  terminated");
	}
}

