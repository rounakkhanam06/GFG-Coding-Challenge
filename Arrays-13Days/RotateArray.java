public class RotateArray {
    // Function to rotate an array by d elements in counter-clockwise direction.
    static void rotateArr(int arr[], int d) {
        int n = arr.length;
        d = d % n;

        reverseArr(arr, 0, d - 1);   // Reverse first d elements
        reverseArr(arr, d, n - 1);   // Reverse the remaining elements
        reverseArr(arr, 0, n - 1);   // Reverse the whole array
    }

    // Function to reverse a part of the array from index start to end
    static void reverseArr(int arr[], int start, int last) {
        while (start < last) {
            int temp = arr[start];
            arr[start] = arr[last];
            arr[last] = temp;

            start++;
            last--;
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {10, 5, 10, 22, 34, 12, 89, 23, 90, 12}; 
        int d = 3;

        rotateArr(arr1, d);

        // Print the rotated array
        for (int num : arr1) {
            System.out.print(num + " ");
        }

        // Expected Output after 3 rotations:
        // 22 34 12 89 23 90 12 10 5 10
    }
}



