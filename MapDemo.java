import java.util.*;
class MapDemo{

		static void display (Collection <?> c){
		if(c!=null){
			for(Object ob : c)
			{
				System.out.println(ob);
			  }
			}
		}
public static void main(String[] args){

	Map<Integer,String> myMap1 = new HashMap<Integer,String>();
		myMap1.put(1,"Hello");
		myMap1.put(2,"Amol");
		myMap1.put(3,"pawan");
		myMap1.put(4,"Ganesh");
		myMap1.put(5,"Dinesh");
	
	Set<Map.Entry<Integer,String>> mySet1 = myMap1.entrySet();
	display(mySet1); 
	}
}