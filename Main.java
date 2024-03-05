import java.util.*;

class Parent{
    int x=10;
    public void show(){
        System.out.println("Parent x: "+x);
    }
}
class Child extends Parent{
    int x=20;
    public void show(){
        System.out.println("Child x: "+x);
    }
}
public class Main {


    public void show(int x){
        System.out.println("Int");
    }
    public void show(String x){
        System.out.println("String");
    }
    public void show(double x){
        System.out.println("Double");
    }
    public static void main(String[] args) {
        Parent ob = new Child();
        ob.show();
        Main obj = new Main();
        //obj.show("hello",5,11.5);             Compile time Error
        
        Thread t1 = new Thread(()->{
            for( int i=0; i<5; i++){
                System.out.println(i+" ");
            }
        });
        // t1.run();

        String str = "hello";
       
      str.concat(" World");
        System.out.println("String concat : "+str);

        str = str.replace('l','w');
        System.out.println("String Replace : "+str);

        str = str.toUpperCase();
        System.out.println(str);
       Set<String> set = new HashSet<>();
       set.add("apple");
       System.out.println(set.contains("grape"));

       int[] arr = {1,2,3,4,5};
       for(int i=0;i<=arr.length;i++){
           //System.out.println(arr[i]);
       }

    }
}
