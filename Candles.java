public class Candles {
   
    // Function to find the length of the smallest subarray having all candles 1 to K
    static int lengthOfSmallestSubarrayWithKCandles(int[] arr, int n, int K) {
        int minSubarrayLength = Integer.MAX_VALUE;
        
        // Array to keep track of the count of each candle
        int[] candleCount = new int[K + 1];

        int distinctCandles = 0;
        int left = 0;
        
        // Iterate through the array
        for (int right = 0; right < n; right++) {
            // If the candle is within the range [1, K]
            if (arr[right] >= 1 && arr[right] <= K) {
                // Increment the count of this candle
                if (candleCount[arr[right]] == 0) {
                    distinctCandles++;
                }
                candleCount[arr[right]]++;
                
                // If all candles from 1 to K are present
                if (distinctCandles == K) {
                    // Move the left pointer to shrink the window
                    while (candleCount[arr[left]] > 1 || arr[left] > K) {
                        candleCount[arr[left]]--;
                        left++;
                    }
                    
                    // Update the minimum subarray length
                    minSubarrayLength = Math.min(minSubarrayLength, right - left + 1);
                }
            }
        }

        return minSubarrayLength;
    }
    public static void main(String[] args) {
    
        int K = 3; // Number of cakes
        // int n = 5; // Number of candles
        // int[] arr = {2, 3, 5, 1, 4}; // Heights of candles
        int n = 7; // Number of candles
        int[] arr = {2,6, 3, 5,7, 1, 4}; // Heights of candles

        int result = lengthOfSmallestSubarrayWithKCandles(arr, n, K);
        System.out.println("Length of the smallest subarray with all 1 to " + K + " candles: " + result);
    System.out.println("Length of subarrays with all 1 to " + K + " candles: " + result);
    
    }
}
