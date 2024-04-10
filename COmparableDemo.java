import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student {
    int rollNo;
    String name;

    Student() {

    }

    Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }
    public String toString(){
        return "Student RollNO :"+this.rollNo+" Name :"+this.name;
    }
}

class StudentAge implements Comparator <Student>{

    @Override
    public int compare(Student o1, Student o2) {
        // TODO Auto-generated method stub
      
        return o1.rollNo - o2.rollNo;
    }
}

public class COmparableDemo {
    static void display(Collection<?> c){
	if(c!=null){
	for(Object ob : c){
	
	System.out.println(ob);
	}
     }
}
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(2,"prasad"));
        list.add(new Student(1,"Omkar"));
        list.add(new Student(3,"Aayush"));

        display(list);
        
        StudentAge ag = new StudentAge();
        Collections.sort(list,ag);

        System.out.println("__________________");
        display(list);


    }
}
