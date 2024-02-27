import java.util.*;
class TreeSetDemo{

		static void display (Collection <?> c){
			for(Object ob : c)
			{
				System.out.println(ob);
			}
		}
public static void main(String[] args){

	Set<String> mySet1 = new TreeSet<String>();
		mySet1.add("Hello");
		mySet1.add("Amol");
		mySet1.add("pawan");
		mySet1.add("Ganesh");
		mySet1.add("Dinesh");
	display(mySet1 ); 

	}
}