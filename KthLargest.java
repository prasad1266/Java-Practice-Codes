import java.util.Arrays;

class KthLargest{
    public static void main(String[] args) {
        int[] arr = {1,4,17,7,25,3,100};
        Arrays.sort(arr);
       int k=3;
        int b= arr.length-k;
        System.out.println("3rd Largest Element is : "+arr[b]);
       
    }
}