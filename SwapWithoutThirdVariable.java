import java.util.Scanner;

public class SwapWithoutThirdVariable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x= sc.nextInt();
        int y = sc.nextInt();
        System.out.println("Before Swapping X is :"+x +" Y is :"+y);

        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println("After Swapping X is :"+x +" Y is :"+y);
    }
}
