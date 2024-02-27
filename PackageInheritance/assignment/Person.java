package assignment;
public class Person{

	public String name;
	public int age;
	public char gender;
	
	Person(){
	
}
public Preson(String s, int a, char c){
	this.name=s;
	this.age=a;
	this.gender=c;
}
	
 	public void displayDetailes(){
		System.out.println("name: "+this.name);
		System.out.println("Age: "+this.age);
		System.out.println("Gender: "+this.gender);




	}

}