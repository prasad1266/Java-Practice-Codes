public class SelectionSortDemo {
    public static void selectinSort(int[] arr) {
        for(int i=0;i<arr.length;i++){
            int midIndex = i;
           for(int j=i+1; j<arr.length; j++){
                if(arr[j] < arr[midIndex]){
                    midIndex = j;
                }
           }

           if(midIndex != i){
            int temp =  arr[i];
            arr[i] = arr[midIndex];
            arr[midIndex] = temp; 
           }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 8,3,12,4,6};
        for (int i : arr) {
            System.out.print(i + " ");
        }
        selectinSort(arr);

        System.out.println("-------------------After Sorting-----------------");

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
