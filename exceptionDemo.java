class MyException extends Exception{
    MyException(){

    }
     MyException(String msg){
        super(msg) ;
       }

}
public class exceptionDemo {
    public static void demo() throws MyException {
       
       System.out.println("Demo Function Exception Called.....!!");
    }
      
    public static void main(String[] args) throws MyException {
       try{
        demo();
       throw new MyException("My Exception Called..");
      
       } catch(MyException e){
        //throw new MyException("Exception Again thrown");
        System.out.println(e.getMessage());
      //   throw e;
       }
        
    }
}
