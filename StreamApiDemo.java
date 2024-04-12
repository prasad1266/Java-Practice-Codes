import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class pojo {

    public  int b;
    public String name; 
    public int salary;




    public void setB(int newb) {
        this.b = newb;
    }

    public int getB() {
        return b;
    }
}

public class StreamApiDemo {

    public static void main(String[] args) {
        pojo p = new pojo();
        p.setB(52);
       // System.out.println(p.getB());

        // List<Integer> list = new ArrayList<>();
        List<Integer> list = Arrays.asList(5, 4, 45, 12, 8,11,24);
        Stream<Integer> stream1 = list.stream();

        List<Integer> newList = list.stream().
                                filter(i -> i % 2 == 0)
                                .toList();     //collect(Collectors.toList())

        
        List<Integer> newList1 = list.stream()
                                .map(x -> x * 2)
                                .collect(Collectors.toList());

        // System.out.println("Normal lIst "+list);
        // System.out.println("NewList "+newList);
        // System.out.println("NewList 1 "+newList1);
        // Integer Sum = list.stream().reduce(0,(a,b)->a+b);
        // System.out.println("Sum of the Elements :"+Sum);

       Optional<Integer> max = list.stream()
                                .max(Integer::compareTo);
                            
                                System.out.println(" Maximum :" + max.get());

         Optional<Integer> max1= list.stream()
                                .reduce((a,b)->a.compareTo(b) > 0? a:b);

        // System.out.println("Maximum Element is :"+ max1.get());

        // List<Integer> Sorted= list.stream().sorted((a,b)->-a.compareTo(b)).toList();     // toList After java 17

        // List<Integer> Sorted=
        // list.stream().sorted((a,b)->Integer.compare(a,b)).toList();
        // List<Integer> Sorted=
        // list.stream().sorted(Comparator.naturalOrder()).toList();
        Integer Sorted = list.stream().min((a, b) -> Integer.compare(a, b)).get();

        Integer count = list.stream()
        .sorted(Comparator.reverseOrder())
                // .sorted((a, b) -> Integer.compare(b, a))
                .skip(1)
                .findFirst()
                .get();

        System.out.println("Second Highest :" + count);

// Integer ab = list.stream()
// .forEach(i-> (i % 2 == 0) ).get();
      
// for(Object num:arr){
//     System.out.println(num);
// }

  // list.stream().forEach((i)-> System.out.println(i));
  list.stream() 
                .filter((i)->i%2==0)
                .sorted(Comparator.naturalOrder())
                .forEach( System.out::println);

//           ************* Filter and Map Function  *****************     

List<Integer> list1 = Arrays.asList(10,35,65,55,20,75,80);
        List<Integer> passed = list1.stream()
                                .filter((i)-> i>=35).toList();

        System.out.println("passed Students : "+passed);

        List<Integer> grace = list1.stream()  
                                .filter((i)->i<35)
                                .map((i)->i+5)
                                .toList();
            
            
              System.out.println("Grace Marked Students :"+grace);

              //           *************  Count Function  ***************** 
             Long count1 = list1.stream()
                                         .filter((i)-> i>=35)
                                         .count();
                                         System.out.println("Number of passed Students :"+count1);

                  //           *************  Sorting  Function  ***************** 

                  List<Integer> sorted = list1.stream().sorted(Comparator.naturalOrder()).toList();
                  System.out.println("Reverse Sorted List : "+sorted);

                  //List<Integer> Descsorted = list1.stream().sorted((a,b)->Integer.compare(-a,b)).toList();
                  List<Integer> Descsorted = list1.stream().sorted((a,b)-> a<b?1:a>b?-1:0).toList();
                  System.out.println("Descending Order : "+Descsorted);


                  List<String> list2 = Arrays.asList("a","aaa","bbbb","bb","aaaaa");
                   
                  Comparator<String> c= (a,b)->{
                   int  l1 = a.length();
                    int l2 = b.length();
                    if(l1>l2) return 1;
                    else if(l1<l2) return -1;
                    else return 0;
                  };

                //   List<String> lengthSort = list2.stream().sorted(c).toList();
                List<String> lengthSort = list2.stream().sorted((a,b)->Integer.compare(-a.length(),b.length())).toList();

                  System.out.println("Sorting Based On Length : "+lengthSort);

              //           *************  min and max   Function  ***************** 
           
                //  Integer min = list.stream().min(Integer::compareTo).get();
                Integer min = list.stream().min((a,b)->Integer.compare(a,b)).get();
                  System.out.println("Minimum Element :"+min);

                //   Integer maxx = list.stream().max(Integer::compareTo).get();
                Integer maxx = list.stream().max((a,b)->Integer.compare(a,b)).get();
                  System.out.println("Maximum Element :"+maxx);

                     //           *************  forEach   Function  *****************    

                    //    list.forEach(System.out::println); 

                  //           *************  ToArray   Function  *****************  

                  System.out.println("========================================");
                  Integer [] i = list.stream().toArray(Integer[]:: new) ;
                  for (Integer integer : i) {
                    System.out.println(integer);
                  }   
                 

         //           *************  Array To Stream   Function  *****************   

         
         System.out.println("========================================   Array To Stream ");

        //  Stream<Integer> st = Stream.of(i);          //Generic for All Types
        Stream<Integer> st =Arrays.stream(i);
         //st.forEach(System.out::println);
         Arrays.stream(i).filter(j->j%2==0).forEach(System.out::println);
        

            // System.out.println("");

   }

}
