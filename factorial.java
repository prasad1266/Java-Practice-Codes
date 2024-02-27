import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int fact =1;
        if(num<0){
            System.out.println("Number Should  be Positive");
        }
        else{
            for(int i=1;i<=num;i++){
            fact*=i;
            }
        }
        System.out.println("Factorial is : "+fact);

    }
}
