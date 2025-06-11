
public class ReverseArray {
    
    public void reverseArray(int arr[]) {
        int first = 0;
        int last = arr.length - 1;
        
        while (first < last) {
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;
            
            first++;
            last--;
        }
    }
public static void main(String args[]){
    int[] arr = {1, 4, 3, 2, 6, 5};
      ReverseArray obj = new ReverseArray();
        obj.reverseArray(arr);

            // Print the reversed array
            for (int num : arr) {
            System.out.print(num + " ");
        }
        // arr = [5, 6, 2, 3, 4, 1]
}

}
