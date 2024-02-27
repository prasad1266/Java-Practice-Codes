
import java.util.*;

public class Knapsack {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);							//OBJECT (i)  1   2  3  4  5  6  7 
																		//Profit (P)  10  5  15 7  6 18  3
        System.out.println("Enter the Total Objects");					//Weight (W)  2   3  5  7  1  4  1
		
        int object = sc.nextInt();										//P/W         5  1.6  3  1  6 4.5 3
        int[] weight = new int[object];
        int[] profit = new int[object];									//P/W   =    6  5  4.5   3   3   1.6  1
        double[] p_w = new double[object];								//X		=	 1  1   1    1   1   2/3  0
																					
        for (int i = 0; i < object; i++) {
            System.out.println("Enter the Profit");						//xi*Wi <= Capaiciy  
            profit[i] = sc.nextInt();									//xi*pi = MaxProfit
            System.out.println("Enter the weight");
            weight[i] = sc.nextInt();
            p_w[i] = (double) profit[i] / weight[i];
        }

        System.out.println("Enter the Knapsack capacity");
        int m = sc.nextInt();

        for (int i = 0; i < object - 1; i++) {
            for (int j = i + 1; j < object; j++) {
                if (p_w[i] < p_w[j]) {
                    swap(p_w, i, j);
                    swap(profit, i, j);
                    swap(weight, i, j);
                }
            }
        }

        int k = 0;
        double sum = 0;

        while (m > 0 && k < object) {
            if (weight[k] <= m) {
                sum += profit[k];
                m -= weight[k];
            } else {
                double x6 = (double) m * profit[k] / weight[k];
                sum += x6;
                m = 0;
            }
            k++;
        }

        System.out.println("Final Profit is=" + sum);
    }

    // Helper method to swap elements in arrays
    public static void swap(double[] arr, int i, int j) {
        double temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
