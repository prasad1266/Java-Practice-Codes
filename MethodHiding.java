class abc{
    static void method(){
        System.out.println("Static Method abc");
    }
}
class xyz extends abc{
    static void method(){
        System.out.println("Static Method xyz");
    }
}

public class MethodHiding  {
    public static void main(String[] args) {
        abc  mh = new xyz();
        mh.method();
    } 
}
