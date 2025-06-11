
public class SecondLargest {
    public static int findSecondLargest(int[] arr) {
        if (arr.length < 2) {
            return -1;
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num < largest && num > secondLargest) {
                secondLargest = num;
            }
        }

        // If secondLargest remains Integer.MIN_VALUE, check whether it's valid
        return (secondLargest == Integer.MIN_VALUE) ? -1 : secondLargest;
    }

    public static void main(String[] args) {
        int[] arr1 = {10, 5, 10};         // Output: 5
        int[] arr2 = {3, 3, 3};           // Output: -1
        int[] arr3 = {1};                 // Output: -1
        int[] arr4 = {1, 2, 3, 4, 5};     // Output: 4
        int[] arr5 = {-10, -20, -30};     // Output: -20

        System.out.println(findSecondLargest(arr1));
        System.out.println(findSecondLargest(arr2));
        System.out.println(findSecondLargest(arr3));
        System.out.println(findSecondLargest(arr4));
        System.out.println(findSecondLargest(arr5));
    }
}
