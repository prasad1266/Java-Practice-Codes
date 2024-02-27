			***COnstructor***

class STudent1{
int rollNo;
int age;
String name;
/*
STudent1(){
 this.rollNo=0;
	this.age=18;
	this.marks =70.5;
	}

public void getDetailes(int r, int a, double m){
	this.rollNo=r;
	this.age=a;
	this.marks =m;

	}*/
public void printDetailes(){
	System.out.println("RollNumber : "+rollNo);
	System.out.println("Age : "+age);	
	System.out.println("String default Name : "+name);
	}

public static void main(String args[]){
STudent1 s = new STudent1();
//s.getDetailes();
s.printDetailes();

	}
}