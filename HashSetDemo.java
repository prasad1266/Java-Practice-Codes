import java.util.*;
public class HashSetDemo {
    public static void main(String[] args) {


        int x=5;
        int y=3;
        int result =  x-- -y++ * x++;
        System.out.println("Result is : "+result);


        HashSet<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(30);
        System.out.println(set);        //Set Dosen't maintain Order
        set.remove(10);
        System.out.println("Set After Removal 10 : "+set);

        System.out.println("Size of Set : "+set.size());
        if(set.contains(20)){
            System.out.println("20 Available in Set");
        }

    //      Iterator For Iterating Set

    System.out.println();

    Iterator<Integer> iterator = set.iterator();
    while(iterator.hasNext()){
        System.out.println(iterator.next());
    }

    for(Integer i: set){
System.out.println(i);
    }

set.clear();

System.out.println(set);
    }
}
