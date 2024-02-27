package assignment;
public class Student{
	public int studentId;
	public char grade;
	
	Student(){

}
public Student(int s, char g){
	
	this.studentId = s;
	this.grade = g;
}
	
 	public void displayDetailes(){
		System.out.println("studentId : "+studentId);
		System.out.println("grade: "+grade);
	}

}