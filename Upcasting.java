
class Parent{
 
    void myfun(){
    System.out.println("My fun first");
 }
}

class Child extends Parent{
 
    void myfun(){
   // super.myfun();
    System.out.println("My fun Second");
 }
}

public class Upcasting {
    public static void main(String args[]){
        Parent prt=new Child();
        prt.myfun();
    }
}	