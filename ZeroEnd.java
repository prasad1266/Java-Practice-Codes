public class ZeroEnd {
    public static void rotate(int[]  arr){
        int count=0;
        for(int i=0;i<arr.length; i++){
            if(arr[i]!=0){
                arr[count++]=arr[i];
            }
        }
        while(count<arr.length){
            arr[count++] = 0;
        }

    }
    public static void main(String[] args) {
        int[] arr = { 11, 0, 22, 44, 0, 0, 23, 11, 0 };
        rotate(arr);
        int i = 0;
        int j = arr.length - 1;
        // for(i=0,j=arr.length-1; i<arr.length; i++,j--){
        // if(arr[j]==0)
        // {
        // j--;

        // }
        // if(arr[i]==0 && arr[j]!=0){
        // int temp = arr[i];
        // arr[i] = arr[j];
        // arr[j] = temp;
        // i++;
        // j--;
        // }
        // }



        // while (i < j) {
        //     if (arr[i] == 0 && arr[j] != 0) {
        //         int temp = arr[i];
        //         arr[i] = arr[j];
        //         arr[j] = temp;
        //         i++;
        //         j--;
        //     }
        //     else{
        //         if(arr[j]==0)
        //         j--;
        //         if(arr[i] != 0)
        //         i++;
        //     }
        // }
        
        for(int k : arr){
            System.out.print(k+" ");
        }
       
    }
}
