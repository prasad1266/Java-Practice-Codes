public class GreaterThanAverage {
    public static void main(String[] args) {
        int[] arr = {1,4,17,7,25,3,100};
        int sum =0;
        for(int i=0; i<arr.length;i++){
            sum+=arr[i];
        }
        int avg = sum/(arr.length);
        System.out.println(avg);
        // for (int i : arr) {
        //     if(i>avg){
        //         System.out.println(i);
        //     }
        }
    }

