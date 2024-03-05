import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Trail {
    public static void main(String[] args) {
        
        Set<String> set = new HashSet<>();
        set.add("prasad");
        set.add("Nandu");
        set.add("prasad");
        for(Object val : set){
            System.out.println(val);
        }
//         Map<Integer,String> map = new HashMap<>();
//         map.put(1,"one");
//         map.put(2,"Two");
//         map.put(2,"Three");
//         // System.out.println(map.get(2));
//         for(Map.Entry<Integer,String> val : map.entrySet()){
// System.out.println(val.getKey()+" "+val.getValue());
        }
    }

