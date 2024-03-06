import java.util.*;
import java.util.LinkedList;

public class LinkedListDemo1 {
    public static void main(String[] args) {
        // List<String> a1 = new LinkedList<>();
        // a1.add("prasad");
        LinkedList<String> LL = new LinkedList<>(); // Arrays.asList("Prasad","Ayush","Nitish","Omkar");
        LL.add("Prasad");
        LL.add("Ayush");
        LL.add("Nitish");
        LL.add("Omkar");

        System.out.println(LL.get(0));
        // String val = LL.removeFirst();
        // String val = LL.removeLast();
        LL.addLast("Abhinav");
        LL.addFirst("First");
        // System.out.println("removed: "+val);
        // boolean val= LL.remove("Omkar");
        LL.remove(2);
        //System.out.println("Returned Removed Value : "+str);
        LL.removeFirst();

        System.out.println("---------------------------------");
        System.out.println(LL);

        LinkedList<String> list = new LinkedList<>();
        list = (LinkedList) LL.clone();
        System.out.println("Before pop : " + list);
        list.pop();
        list.push("New");
        System.out.println("---------------------------------");

        System.out.println("Cloned Linked List : " + list);
        // System.out.println(list.contains("First"));

        // Iterator x = list.descendingIterator();
        // while(x.hasNext()){
        // System.out.println(x.next());
        // }

    }
}
