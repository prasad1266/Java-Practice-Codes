
import java.util.*;

public class WordFrequency {
public static String findMostFrequentWord(String text){
    String[] words = text.split(" ");
   // System.out.println(words[0]);
   Map <String, Integer> map = new HashMap<>();
   for(String word :words){
    String lowercaseWord = word.toLowerCase();
    map.put(lowercaseWord,map.getOrDefault(lowercaseWord,0)+1);
  
   }
   String MaxWord =null;
   int max=0;
   for(Map.Entry<String ,Integer> map1:map.entrySet()){
    if(map1.getValue() >max){
      max = map1.getValue();
      MaxWord = map1.getKey();  
    }
    

   }
   return MaxWord;
}

    public static void main(String[] args) {
        String text = "This is a sample text. It contains some words, and some words are repeated more than others.";
        String word =  findMostFrequentWord(text);
        System.out.println("The most frequent word is: "+ word );
    }
}
