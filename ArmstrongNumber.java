import java.util.*;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number to Check : ");
        int num = sc.nextInt();

        int digits =0;
        int temp = num;

        while(temp!=0){
            digits++;
            temp =temp/10;
            // temp/=10;
        }
      temp =num;
      int sum=0;
      int remainder;
      while(temp!=0){
        remainder=temp%10;
        sum+=Math.pow(remainder,digits);
        temp/=10;
      }
      if(sum==num){
        System.out.println(num+" Number is Armstrong");
      }
      else{
        System.out.println("Not an ArmStrong Number");
      }
    }
}
