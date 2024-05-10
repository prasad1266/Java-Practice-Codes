import java.util.*;



public class HAshMapDemo extends Thread{

  // synchronized(Object obj){
  //   for(int i=0; i<5 ; i++){
  //     System.out.println("hello thread : "+i);
  //   }
  // }

  // public HAshMapDemo(String msg){
  //   super(msg);
  // }
  // public void run(){
  //   System.out.println("Thread Name is : "+Thread.currentThread().getName());
  // }
    static void display(Map<Integer, String> map){
        for(Map.Entry<Integer,String> val : map.entrySet()){
            System.out.println("key : " +val.getKey() + "  value : "+val.getValue());
        }
    }
    public static void main(String[] args) {
      // HAshMapDemo t = new HAshMapDemo("t1");
      // t.start();
        Map <Integer,String> map = new HashMap<>();
        map.put(1,"prasad");
        map.put(2,"Omkar");
        map.put(3,"Mayur");
        map.put(3,"Prathmesh");

        // for(Map.Entry<Integer,String> mapEntry : map.entrySet()){
        //    System.out.println(mapEntry.getKey()+ " "+ mapEntry.getValue()); 
        // }
        // for(Integer key: map.keySet()){
        //     System.out.println(key);
        // }
        display(map);
        System.out.println("---------------------------------------");
        map.remove(2);
        //   display(map);
          if(map.containsKey(2)){
            System.out.println("key is present");
          }else{
            System.out.println("value Is Absent");
          }
          System.out.println("---------------------------------------");
          System.out.println("Value at Key 1 is :"+map.get(1));
    }
}