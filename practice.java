import java.util.*;
public class practice{
	
	
	public static void main (String []args){
			
		String str="prasad";
		
		Map <Character, Integer> map1 = new HashMap<>();
		char[] arr =str.toCharArray();
		for(char c :arr){
			if(map1.containsKey(c)){
			map1.put(c,map1.get(c)+1);
			}
			else{
				map1.put(c,1);
			}
			
		}
		for(Map.Entry entry:map1.entrySet()){
			System.out.println(entry.getKey()+"	:"+entry.getValue());
			}
		}
	}