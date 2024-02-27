public class Primeexample {
    public static void main(String args[]) {
    //     // prime(11);
    //     for(int i=10;i<=20;i++){
    //         if(prime(i)){
    //             System.out.println(i);
    //         }
    //     } 
    // }
    
    // public static boolean prime(int n) {
    //     if (n <= 1) {
         
    //         return false;
    //     }
        
    //     for (int i = 2; i <= Math.sqrt(n); i++) {
    //         if (n % i == 0) {
              
    //             return false;
    //         }
    //     }
        
     
    //     return true;
for(int i=10;i<=25;i++){
    if(isPrime(i)){
        System.out.println(i);
    }
}
    }
    public static boolean isPrime(int num){
        if(num <= 1)
        return false;

        for(int i=2;i<=Math.sqrt(num);i++){
            if(num %i == 0)
            return false;
        }
        
        return true;
    }
}
