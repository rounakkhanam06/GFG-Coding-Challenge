public class NextPermutation {

    void nextPermutation(int[] arr) {
        int n = arr.length;
        int i = n - 2;

        // Find the first decreasing element from the right
        while (i >= 0 && arr[i] >= arr[i + 1]) {
            i--;
        }

        // If found, swap it with the next greater element to the right
        if (i >= 0) {
            int j = n - 1;
            while (arr[j] <= arr[i]) {
                j--;
            }

            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        // Reverse the rest of the array to get the next permutation
        reverse(arr, i + 1, n - 1);
    }

    void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};

        NextPermutation obj = new NextPermutation();
        obj.nextPermutation(arr);

        System.out.print("Next permutation: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        // Output: 1 3 2
    }
}

