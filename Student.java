class Student{
	int rollNo;
	int age;
	double marks;
	public void getDetailes(int r,int a,double m) {
		rollNo=r;
		age=a;
		marks=m;
	}
	public void printDetailes() {
		System.out.println("RollNo  : "+rollNo);
		System.out.println("Age  :    "+age);
		System.out.println("marks  :  "+marks);
	}
public static void main(String args[]){
	Student p = new Student();
		System.out.println("Detailes For Student1 : ");
		
		p.getDetailes(10, 20, 35.6);
		p.printDetailes();
		
		Student p1 = new Student();
		System.out.println("Detailes For Student2 : ");
		
		p.getDetailes(20, 30, 45.6);
		p.printDetailes();
		
		
		System.out.println("After All Process : ");
		p.printDetailes();
	}
}