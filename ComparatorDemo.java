import java.util.*;
class Student{
	int rollNo;
	String name;
	int age;

	Student(){

	}
	Student(int rollNo, String name, int age){
	this.rollNo = rollNo;
	this.name = name;
	this.age = age;
	
	}
	public String toString(){
	
	return "Student[roll = " + rollNo + ", name = " + name + ", age = " + age + "]";

	}


}
class StudentAge implements Comparator<Student>{
	public int compare(Student s1, Student s2){

	return s1.age - s2.age;
	}
}
class StudentName implements Comparator<Student>{
	public int compare(Student s1, Student s2){

	return s1.name.compareTo(s2.name);
	}
}
class ComparatorDemo{
	
	static void display(Collection<?> c){
	if(c!=null){
	for(Object ob : c){
	
	System.out.println(ob);
	}
     }
}
	public static void main(String[] args) {
	List<Student> stud = new ArrayList<Student>();
	
	Student s1 = new Student(55,"Prasad",12);
	Student s2 = new Student(45,"Piyush",17);

	stud.add(s1);
	stud.add(s2);
		stud.add(new Student(1,"Geeta",20));
		stud.add(new Student(5,"Joseph",24));
		stud.add(new Student(2,"Rajesh",25));
	
	display(stud);

	StudentAge sg = new StudentAge ();

	Collections.sort(stud,sg); 
	System.out.println("\nSorting Based on Age : \n");
	display(stud);

	StudentName sn = new StudentName();

	Collections.sort(stud,sn); 
	System.out.println("\nSorting Based on Name : \n");
	display(stud);

	}
}