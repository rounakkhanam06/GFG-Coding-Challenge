public class MaxSubarraySum {

    int maxSubarraySum(int[] arr) {
        int maxSoFar = arr[0];   // max sum found so far
        int currentSum = arr[0]; // current subarray sum
        
        for (int i = 1; i < arr.length; i++) {
            // either start new subarray from current element or extend previous one
            currentSum = Math.max(arr[i], currentSum + arr[i]);
            maxSoFar = Math.max(maxSoFar, currentSum);
        }
        
        return maxSoFar;
    }

    public static void main(String[] args) {
        MaxSubarraySum solver = new MaxSubarraySum();

        int[] arr1 = {1, -2, 3, 4, -1, 2, 1, -5, 4};
        System.out.println("Maximum Subarray Sum: " + solver.maxSubarraySum(arr1)); // Output: 9

        int[] arr2 = {-3, -2, -1, -4};
        System.out.println("Maximum Subarray Sum: " + solver.maxSubarraySum(arr2)); // Output: -1

        int[] arr3 = {5, 4, -1, 7, 8};
        System.out.println("Maximum Subarray Sum: " + solver.maxSubarraySum(arr3)); // Output: 23
    }
}

