import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector<Integer> vc = new Vector<>();
        vc.add(15);
        vc.add(10);
        vc.add(5);
        System.out.println(vc);
        // System.out.println( "Capacity of Vector: "+vc.capacity());
        // System.out.println( "Size of Vector: "+vc.size());
       Vector<Integer> vc1 = (Vector<Integer>) vc.clone();
       System.out.println("-----------------------------------------------");
       System.out.println(vc1);
    //    vc1.add(5);
    //    System.out.println(vc1);
    vc.ensureCapacity(15);
    System.out.println( "Capacity of Vector: "+vc.capacity()); 
    
System.out.println();

    vc.trimToSize();
    System.out.println( "Capacity of Vector: "+vc.capacity()); 
    }
}
