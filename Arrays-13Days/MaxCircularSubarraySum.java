public class MaxCircularSubarraySum {

    public int circularSubarraySum(int[] arr) {
        int maxNormal = kadane(arr);
        
        // Check if all elements are negative
        boolean allNegative = true;
        for (int x : arr) {
            if (x > 0) {
                allNegative = false;
                break;
            }
        }
        
        if (allNegative) return maxNormal; // If all negative, maxNormal is the answer
        
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
            arr[i] = -arr[i]; // invert elements for min subarray sum
        }
        
        int minSubarraySum = kadane(arr);
        int maxCircular = total + minSubarraySum; // total - (-minSubarraySum)
        
        return Math.max(maxNormal, maxCircular);
    }
    
    // Standard Kadane’s algorithm to find max subarray sum
    public static int kadane(int[] arr) {
        int maxSoFar = arr[0];
        int currMax = arr[0];
        
        for (int i = 1; i < arr.length; i++) {
            currMax = Math.max(arr[i], currMax + arr[i]);
            maxSoFar = Math.max(maxSoFar, currMax);
        }
        return maxSoFar;
    }

    public static void main(String[] args) {
        MaxCircularSubarraySum solver = new MaxCircularSubarraySum();

        int[] arr1 = {8, -4, 3, -5, 4};
        System.out.println("Max Circular Subarray Sum: " + solver.circularSubarraySum(arr1)); // Output: 11

        int[] arr2 = {-1, -2, -3, -4};
        System.out.println("Max Circular Subarray Sum: " + solver.circularSubarraySum(arr2)); // Output: -1

        int[] arr3 = {5, -2, 3, 4};
        System.out.println("Max Circular Subarray Sum: " + solver.circularSubarraySum(arr3)); // Output: 10
    }
}
