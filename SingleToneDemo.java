
public class SingleToneDemo {
    private static SingleToneDemo instance =null;

    private SingleToneDemo(){

    }
    public static SingleToneDemo getInstance(){

        if(instance == null)
        instance = new SingleToneDemo();
        return instance;
    }
    public static void Demo(){
        System.out.println("hello Demo");
    }
    public static void main(String[] args){

        SingleToneDemo ob = SingleToneDemo.getInstance();
        ob.Demo();
        System.out.println(ob);
        
         SingleToneDemo ob1 = SingleToneDemo.getInstance();

        System.out.println(ob1);
        // Singletone ob1 = Singletone.getInstance();
        // ob1.Demo();
       
    }
    
}
