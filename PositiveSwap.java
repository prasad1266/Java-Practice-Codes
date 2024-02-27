public class PositiveSwap {
    public static void main(String[] args) {
        int []arr = {-2,3,4,-1,-3,1};
       
        int left = 0;   
        int right = arr.length - 1;

        while (left < right) {
            while (arr[left] < 0 && left < right) {
                left++;
            }

            while (arr[right] >= 0 && left < right) {
                right--;
            }

            if (left < right) {
                // Swap elements
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right--;
            }
          
        }
        for(int i: arr){
            System.out.println(i);
        }
    }
}
