class MyException extends Exception{

	MyException(){
		
	}
	
	MyException(String msg){
		super(msg);
	}
}

class UserDefinedCheckedEXceptionClassDemo{
	public static void main(String[] args) {
		
		try{
			throw new MyException("MyException Here: ");
			}
		catch(MyException e){
			//	System.out.println("MyException Caught here");
				System.out.println(e.getMessage());
			}

		System.out.println("Program Execution Completed : ");
	}
}

