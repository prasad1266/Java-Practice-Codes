import java.util.*;
class MapFrequency{
public static void main(String[] args){
	String str = "abvdsabbavab";

	Map<Character,Integer> myMap1 = new TreeMap<Character,Integer> ();
	for(int i=0;  i<str.length(); i++){
		char ch = str.charAt(i);
		if(myMap1.get(ch) ==null){
			myMap1.put(ch,1);
		}
		else{
			int curval = myMap1.get(ch);
			myMap1.put(ch,curval+1);
			}

		}


	}
}