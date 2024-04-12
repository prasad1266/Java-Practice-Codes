import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamApi {
    public static void main(String[] args) {
        //   = new ArrayList<>();

        Integer[] arr = {10,20,30,40};
        List<Integer> list=Arrays.asList(arr);
        System.out.println(list);

        Stream<Integer> stream = list.stream(); 
        System.out.println("----------------------------------");
        // stream.forEach(System.out::println);
        // stream.forEach(e->{
        //     System.out.println(e);
        // });
        
        System.out.println();
        

    }
}
