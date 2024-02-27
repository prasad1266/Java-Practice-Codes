import java.util.Scanner;

public record Trial1() {
    public static void main(String[] args) {
        int []num = {1,2,3,6,5};
        int []num2 = new int[5];
        System.arraycopy(num, 0, num2, 0, 5);
        for(int i:num2){
            System.out.println(i);
        }
       
    }
}
