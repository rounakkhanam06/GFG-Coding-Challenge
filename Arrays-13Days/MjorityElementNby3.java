import java.util.*;

public class MjorityElementNby3{

    // Function to find the majority elements in the array
    public List<Integer> findMajority(int[] nums) {
        int n = nums.length;
        int candidate1 = 0, candidate2 = 1;
        int freq1 = 0, freq2 = 0;

        // First pass to find potential candidates
        for (int num : nums) {
            if (num == candidate1) {
                freq1++;
            } else if (num == candidate2) {
                freq2++;
            } else if (freq1 == 0) {
                candidate1 = num;
                freq1 = 1;
            } else if (freq2 == 0) {
                candidate2 = num;
                freq2 = 1;
            } else {
                freq1--;
                freq2--;
            }
        }

        // Second pass to count actual frequencies
        freq1 = 0;
        freq2 = 0;
        for (int num : nums) {
            if (num == candidate1) {
                freq1++;
            } else if (num == candidate2) {
                freq2++;
            }
        }

        List<Integer> result = new ArrayList<>();
        if (freq1 > n / 3) result.add(candidate1);
        if (freq2 > n / 3) result.add(candidate2);

        Collections.sort(result); // Optional
        return result;
    }

    public static void main(String[] args) {
        MjorityElementNby3 obj = new MjorityElementNby3();
        int[] arr = {3, 2, 3, 1, 2, 2, 3};

        List<Integer> result = obj.findMajority(arr);

        System.out.print("Majority elements (n/3): ");
        for (int num : result) {
            System.out.print(num + " ");
        }

        // Output: 2 3
    }
}

