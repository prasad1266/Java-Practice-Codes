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

	double num2 = 10.5;
	int num1 = 3;
	char ch ='A';
	boolean flag = true;
	System.out.println("Remainder is :"+num2%num1);
	
	//System.out.println("ROund Of Integer Value: "+num);
// System.out.println(num1/num2);
// System.out.println(num1*ch);
// System.out.println(flag && (num1>num2));

	Map<Integer,String> myMap1 = new HashMap<Integer,String>();
		myMap1.put(1,"Hello");
		myMap1.put(2,"Amol");
		myMap1.put(3,"pawan");
		myMap1.put(4,"Ganesh");
		myMap1.put(5,"Dinesh");

		int hashcode1 = myMap1.get(1).hashCode();
		int hashcode2 = myMap1.get(2).hashCode();
		int hashCode3 = myMap1.get(3).hashCode();

	// System.out.println(hashcode1);
	// System.out.println(hashcode2);

		HashMap<String,Integer> myMap = new HashMap<>();
		HashMap<String,Integer> myMap2 = new HashMap<>();
		myMap.put("apple",1);
		myMap.put("Banana",2);
		myMap.put("Orange",3);
		myMap2.put("Banana",2);
		myMap2.put("Grape",4);
		myMap2.put("apple",5);
		int sum = 0;
	

		for(String key : myMap.keySet()){
			if(myMap2.containsKey(key)){
				sum += myMap.get(key)+ myMap2.get(key);
			}
			
		}
		System.out.println("SUm : "+sum);		//10

		
	Set<Map.Entry<Integer,String>> mySet1 = myMap1.entrySet();
	// display(mySet1); 
	}
}