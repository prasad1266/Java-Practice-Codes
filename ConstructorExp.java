Class ConstructorExp{
	int rollNo;
	int age;
	double marks;
	 ConstructorExp(){
	System.out.println("Non-Parameterized COnstructor");

		}
	 ConstructorExp(int r){
	System.out.println("1 Parameter Constructor");
	this.myFun();

		}
	 ConstructorExp(int r,int a){
	System.out.println("2 Parameter Constructor");

		}
	void myFun(){
	System.out.println("Hello myFun() Called");

		}



		public static void main(String args[]){
			ConstructorExp obj = new ConstructorExp(10);
			




	}
}