import java.util.ArrayList;
import java.util.List;
import java.util.*;
 public class deemo{
static void display(Collection<?> c){
		for(Object ob:c){
			System.out.println("Value is :"+ob);
		}
	}
public static void main(String[] args){

	
	List<String> list = new ArrayList<>();
	list.add("Prasad");
	list.add("AAyush");
	list.add("Ganesh");
	System.out.println(list);

	/*System.out.println(list.indexOf("Prasad"));

	System.out.println(list.contains("Ganesh"));
	System.out.println("-------------------------------------");

	Collections.sort(list);
	//Collections.sort(al);
	System.out.println(list);*/
	Collections.shuffle(list);
	System.out.println(Collections.min(list));
	display(list);
	}
}