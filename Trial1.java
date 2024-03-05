import java.util.Scanner;

public record Trial1() {
    public static void main(String[] args) {
        int []num = {1,2,3,6,5};
        int []num2 = new int[5];
        System.arraycopy(num, 0, num2, 0, 5);
        for(int i:num2){
           // System.out.println(i);
        }

        int n =10;
        switch(n){
            case 5:
            System.out.println("case 5");
            break;
            case 10:
            System.out.println("case 10");
           
            case 15:
            System.out.println("case 15");
            break;
            default:
            System.out.println("Default");
        }
       
    }
}
