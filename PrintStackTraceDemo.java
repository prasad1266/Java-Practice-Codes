
 class PrintStackTraceDemo {
	public static void myFun() {
		
		anotherFun();
	}
	public static void anotherFun(){
		
		int res = 5/0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println("Execution Start :   ");
			try{
				myFun();


		}
			catch(ArithmeticException ae){
			//	ae.printStackTrace();
				System.out.println(ae.getMessage());
				}


			System.out.println("Exit :  ");
			
			
			
			
	
	}

}
