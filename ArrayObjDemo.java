class Student {
int roll;
double marks;

Student(int roll, double marks){

 this.roll=roll;
 this.marks=marks;

	}
void printDetailes(){
	System.out.println("RollNumber : "+this.roll+" Marks :"+this.marks);
  }
}
public class ArrayObjDemo{

	public static void main(String[] args){

	Student stud[] = new Student[5];

	for(int i=0; i<stud.length; i++){
	stud[i] = new Student(i+1,72.11);
	}
	
	for(int i=0; i<stud.length; i++){
	stud[i].printDetailes();
	}
/*	stud[0].printDetailes();
	stud[1].printDetailes();
	stud[2].printDetailes();

//	stud[0]= new Student(15,13.3);
//	
 obj.printDetailes();
*/
	}
 }