import java.util.Enumeration;
import java.util.ListIterator;
import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector<Integer> vc = new Vector<>();
       
        
    //    // Enumeration<Integer> e = vc.elements();
       // System.out.println("Class name : " + e.getClass().getName());

        vc.add(15);
        vc.add(10);
        vc.add(5);

        ListIterator<Integer> l = vc.listIterator();

            // boolean present = l.hasNext();
            // System.out.println("Elements Present : "+present);
        

        while(l.hasNext()){
            Integer index = l.nextIndex();
       
        //   if(l.nextIndex()==2){
            Integer str = l.next();
            System.out.println("Index is : "+index+" Integer : "+str);
        //    }
        }
        while(l.hasPrevious()){
            Integer index = l.previousIndex();
       
        //   if(l.nextIndex()==2){
            Integer str = l.previous();
            System.out.println("previous Index is : "+index+" Integer : "+str);
        }

        // while(e.hasMoreElements()){
        //     System.out.println(e.nextElement());
        // }
        // System.out.println(vc);
        // System.out.println( "Capacity of Vector: "+vc.capacity());
        // System.out.println( "Size of Vector: "+vc.size());
        Vector<Integer> vc1 = (Vector<Integer>) vc.clone();
        System.out.println("-----------------------------------------------");
        System.out.println(vc1);
        // vc1.add(5);
        // System.out.println(vc1);
        vc.ensureCapacity(15);
        System.out.println("Capacity of Vector: " + vc.capacity());

        System.out.println();

        vc.trimToSize();
        System.out.println("Capacity of Vector: " + vc.capacity());
    }
}
