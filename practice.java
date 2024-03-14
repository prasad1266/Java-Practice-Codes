import java.util.*;
public class practice{
	
	
	public static void main (String []args){
		int year = 2022;
		if((year % 4 == 0) && (( year % 100 != 0) || (year % 400 == 0)))
		System.out.println("Leap Year");
			
		String str="prasad";
		
		Map <Character, Integer> map1 = new HashMap<>();
		Set<Character> set = new HashSet<>();

		char[] arr =str.toCharArray();
		for(char c :arr){
			set.add(c);
			if(map1.containsKey(c)){
			map1.put(c,map1.get(c)+1);
			}
			else{
				map1.put(c,1);
			}
			
		}
		
		Integer value =0;
		Integer max = 0;
		Character word = null;
		for(Map.Entry entry : map1.entrySet()){
			 value = (Integer)entry.getValue();
			if (value >  max){
				max = (Integer)entry.getValue();
				word = (Character)entry.getKey();
			}
			
				// System.out.println(entry.getKey()+"	:"+entry.getValue());
			
			
			//System.out.println(entry.getKey()+"	:"+entry.getValue());
			}
			System.out.println("Character: "+word +" max Frequency :"+max);
		}
	}