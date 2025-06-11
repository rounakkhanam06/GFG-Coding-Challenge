public class MissingPositiveNumber {

    // Function to find the smallest positive number missing from the array.
    public int missingNumber(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            while (arr[i] > 0 && arr[i] <= n && arr[arr[i] - 1] != arr[i]) {
                int temp = arr[i];
                arr[i] = arr[temp - 1];
                arr[temp - 1] = temp;
            }
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] != i + 1) {
                return i + 1;
            }
        }

        return n + 1;
    }

    // Main method to test the code
    public static void main(String[] args) {
        MissingPositiveNumber solver = new MissingPositiveNumber();

        int[] arr1 = {3, 4, -1, 1};
        System.out.println("Missing number: " + solver.missingNumber(arr1)); // Output: 2

        int[] arr2 = {1, 2, 0};
        System.out.println("Missing number: " + solver.missingNumber(arr2)); // Output: 3

        int[] arr3 = {7, 8, 9, 11, 12};
        System.out.println("Missing number: " + solver.missingNumber(arr3)); // Output: 1

        int[] arr4 = {2, 1, 3, 5};
        System.out.println("Missing number: " + solver.missingNumber(arr4)); // Output: 4
    }
}

