public class Primeexample {
    public static void main(String args[]) {
        // prime(11);
        for(int i=10;i<=20;i++){
            if(prime(i)){
                System.out.println(i);
            }
        } 
    }
    
    public static boolean prime(int n) {
        if (n <= 1) {
          //  System.out.println("false");
            return false;
        }
        
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
               // System.out.println("FALSE");
                return false;
            }
        }
        
       // System.out.println("true");
        return true;
    }
}
