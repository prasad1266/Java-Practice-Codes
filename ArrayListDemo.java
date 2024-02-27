import java.util.*;
class ArrayListDemo{
  public static void main(String[] args) {

		List <String> myList1 = new ArrayList<String>();
		myList1.add("Hello");
		myList1.add("Amol");
		myList1.add("pawan");
//System.out.println(myList1);
/ 			*********Iterating ArrayList Using ForEach Loop*********	
		for(String v : myList1) {
			System.out.println(v);
		}
	}
}