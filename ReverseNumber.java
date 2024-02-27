import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        int reverse =0;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Number to reverse :");
        int num = sc.nextInt();
        while(num!=0){
            reverse = reverse*10;
            reverse = reverse+ num%10;
            num = num/10;
        }
        System.out.println("ReverseNumber is : "+reverse);
    }
}
