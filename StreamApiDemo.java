import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
class pojo{
    private int b;
   
    public void setB( int newb){
        this.b = newb;
    }
    public int getB(){
        return b;
    }
}
public class StreamApiDemo {

    public static void main(String[] args) {
        pojo p = new pojo();
        p.setB(52);
        System.out.println(p.getB());
        
        // List<Integer> list = new ArrayList<>();
        List<Integer> list = Arrays.asList(5,4,45,12,8);
        Stream<Integer> stream = list.stream();
        
        List<Integer> newList = list.stream().filter( i -> i % 2 == 0).collect(Collectors.toList());
        List<Integer> newList1  = list.stream().map(x -> x*2).collect(Collectors.toList());
        System.out.println("Normal lIst "+list);
        System.out.println("NewList "+newList);
        System.out.println("NewList 1 "+newList1);
        Integer Sum = list.stream().reduce(0,(a,b)->a+b);
        System.out.println(Sum);
    } 

}
