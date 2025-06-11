import java.util.Arrays;

public class MinimizeHeightDifference {

    int getMinDiff(int[] arr, int k) {
        int n = arr.length;
        if (n == 1) return 0;

        Arrays.sort(arr);

        // Initial difference without any modification
        int ans = arr[n - 1] - arr[0];

        // Smallest and largest after modification
        int smallest = arr[0] + k;
        int largest = arr[n - 1] - k;

        for (int i = 0; i < n - 1; i++) {
            int min = Math.min(smallest, arr[i + 1] - k);
            int max = Math.max(largest, arr[i] + k);

            if (min < 0) continue;

            ans = Math.min(ans, max - min);
        }

        return ans;
    }

    public static void main(String[] args) {
        MinimizeHeightDifference solver = new MinimizeHeightDifference();

        int[] arr1 = {1, 15, 10};
        int k1 = 6;
        System.out.println("Min difference: " + solver.getMinDiff(arr1, k1)); // Output: 5

        int[] arr2 = {1, 5, 8, 10};
        int k2 = 2;
        System.out.println("Min difference: " + solver.getMinDiff(arr2, k2)); // Output: 5

        int[] arr3 = {3, 9, 12, 16, 20};
        int k3 = 3;
        System.out.println("Min difference: " + solver.getMinDiff(arr3, k3)); // Output: 11
    }
}

