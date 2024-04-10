import java.util.*;
public class practice{
	
	
	public static void main (String []args){
		int year = 2022;
		if((year % 4 == 0) && (( year % 100 != 0) || (year % 400 == 0)))
		System.out.println("Leap Year");
			
		 String str="1mam1";
		 String str1 ="";
		// String str1=str.replaceAll("[^a-zA-Z0-9]","");
		 
		 for(int i=str.length()-1;i>=0;i--){
				if(Character.isLetterOrDigit(str.charAt(i)))
			str1+=str.charAt(i);
		 }
		 System.out.println("Str :"+str);
		 System.out.println("Str1 :"+str1);
		 System.out.println("Palindrome :"+str1.equals(str));
		//int [] arr = 
		
		Map <Character, Integer> map1 = new HashMap<>();
		Set<Character> set = new HashSet<>();

		char[] arr1 =str.toCharArray();
		for(char c :arr1){
			//set.add(c);
			map1.put(c,map1.getOrDefault(c, 0)+1);
			// if(map1.containsKey(c)){
			// map1.put(c,map1.get(c)+1);
			// }
			// else{
			// 	map1.put(c,1);
			// }
			
		}
		
		Integer value =0;
		Integer max = 0;
		Character word = null;
		for(Map.Entry entry : map1.entrySet()){
			//if((Integer)entry.getValue() > 1){
				System.out.println("Intersection : "+entry.getKey());
			//}
			//  value = (Integer)entry.getValue();
			// if (value >  max){
			// 	max = (Integer)entry.getValue();
			// 	word = (Character)entry.getKey();
			// }
			
				// System.out.println(entry.getKey()+"	:"+entry.getValue());
			
			
			//System.out.println(entry.getKey()+"	:"+entry.getValue());
			}
		//	System.out.println("Character: "+word +" max Frequency :"+max);
		}
	}