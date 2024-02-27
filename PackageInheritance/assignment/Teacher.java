package assignment;
public class Teacher{
	public int employeeId;
	public String subject;
	
	Teacher(){

}
public Teacher(int e, String s){
	
	this.employeeId = e;
	this.subject = s;
}
	
 	public void displayDetailes(){
		System.out.println("EmployeeId : "+employeeId);
		System.out.println("Subject: "+subject);
	}

}