import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        System.out.println("Enter The Number : ");
        Scanner sc = new Scanner(System.in);

        while (true) {
            int num = sc.nextInt();
            if (num != 0) {
                System.out.println("You have Entered :" + num);
                continue;
            } else {
                break;
            }
        }

    }
}
