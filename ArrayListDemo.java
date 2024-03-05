import java.util.*;
class ArrayListDemo{
  public static void main(String[] args) {
	
	double va= 97.11;
	//int IntVal = va;			Cmpile time error

	String[] arrr ={"Apple","Banana","Grapes"};
	System.out.println("Character : "+arrr[0].charAt(3));
	int[][] arr1 = {{1,2},{2,3},{3,1}};
	//System.out.println(arr1[1][2]+"_____________");

	int n=5;
	int[] arr = new int[n];
	arr[0] = 5;
	arr[2] = 5;
	arr[1] = 5;
	for(int val: arr){
		System.out.println(val);
	}

	// Map<Integer,String> map = new HashMap<>();
	// map.put(1,"Praasd");
	// map.put(2,"ganesh");
		List <String> myList1 = new ArrayList<String>();
		myList1.add("Hello");
		myList1.add("Amol");
		myList1.add("pawan");
		myList1.add("Hellllo");
		System.out.println("3rd Index Element is : "+myList1.get(3));

		System.out.println("Size Before Delete: "+myList1.size());

		Iterator<String> iterator  = myList1.iterator();
		while(iterator.hasNext()){
			if(iterator.next()=="Hello"){
				iterator.remove();
			}
		}
		System.out.println("Size After Delete: "+myList1.size());

// System.out.println(myList1);
// myList1.add(5, "Neeraj");
// 			*********Iterating ArrayList Using ForEach Loop*********	
		// for(Map.Entry<Integer,String> v : map.entrySet()) {
		// 	System.out.println(v);
		// }
		
		// myList1.remove("hello");
	System.out.println("____________________");

	// myList1.clear();
	//System.out.println(myList1.size());
//	System.out.println(myList1.get(0));

		String str1 = "hello";
		String str2 = new String("hello");
		System.out.println(str1 == str2);
		System.out.println("Equals Method  :"+str1.equals(str2));
		
	}
}