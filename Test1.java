public class Test1 {
    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 5 };
        int[] arr1 = { 2, 1, 3, 5, 9 };

        int missing = Integer.MAX_VALUE;
        boolean flag = false;

        for (int i = 0; i < arr.length; i++) {
            if (!isPresent(arr1, arr[i])) {
                if (missing > arr[i]) {
                    missing = arr[i];
                    flag = true;
                }
            }
        }
        if (flag)
            System.out.println("Missing Element found : " + missing);           // if Element found only then return
        else
            System.out.println("Missing element not found");            // Handle this condition IMP

    }

    public static boolean isPresent(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num)
                return true;
        }
        return false;
    }
}
