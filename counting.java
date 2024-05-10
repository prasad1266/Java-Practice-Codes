import java.util.*;
public class counting{
public static void charCount(String str){

	Map<Character,Integer> map = new HashMap<>();
	char[] arr = str.toCharArray();
	for(Character ch: arr){
	if(!map.containsKey(ch) ){
		map.put(ch,1);
	}else{
	map.put(ch,map.get(ch)+1);
	  }
	}
	for(Map.Entry<Character,Integer> map1: map.entrySet()){
		System.out.print(map1.getKey()+ "  "+map1.getValue());
	}
}
  public static void main(String[] args){


	String str = "prasad";
	charCount(str);
	}
}

/*
name id usertype-->>typ1,type2 type3

select type ,count(*) from employee
group by type;
*/