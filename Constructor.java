
class A{
    int x=10;

    // A(){
    //     System.out.println("A");
    // }
}

class B extends A{
    // B(){
    //     System.out.println("B");
    // }
    int x=  super.x+5;
}
// class C extends B{
//     C(){
//         System.out.println("C");
//     }
// }
public class Constructor {
    public static void main(String[] args) {
        // A obj = new B();
        A obj = new A();
        B obj1 = new B();
      //   System.out.println(obj.x+" "+obj1.x);
    }
}
