public class MaxProductSubarray {
    // Function to find maximum product subarray
    int maxProduct(int[] arr) {
        int currMax = arr[0];
        int currMin = arr[0];
        int maxProduct = arr[0];

        for (int i = 1; i < arr.length; i++) {
            int num = arr[i];

            // Store currMax temporarily because currMax will be updated
            int tempMax = currMax;

            currMax = Math.max(num, Math.max(num * currMax, num * currMin));
            currMin = Math.min(num, Math.min(num * tempMax, num * currMin));

            maxProduct = Math.max(maxProduct, currMax);
        }
        return maxProduct;
    }

    public static void main(String[] args) {
        MaxProductSubarray solver = new MaxProductSubarray();

        int[] arr1 = {2, 3, -2, 4};
        System.out.println("Maximum Product Subarray: " + solver.maxProduct(arr1)); // Output: 6

        int[] arr2 = {-2, 0, -1};
        System.out.println("Maximum Product Subarray: " + solver.maxProduct(arr2)); // Output: 0

        int[] arr3 = {-2, 3, -4};
        System.out.println("Maximum Product Subarray: " + solver.maxProduct(arr3)); // Output: 24
    }
}

