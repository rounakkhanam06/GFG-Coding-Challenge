package Strings;

// import java.util.*;

public class AnagramCheck {

    public static boolean isAnagram(String s1, String s2) {
        // If lengths are not equal, they can't be anagrams
        if (s1.length() != s2.length()) {
            return false;
        }

        // Array to count frequency of each character (26 letters)
        int[] count = new int[26];

        // Count characters in s1
        for (int i = 0; i < s1.length(); i++) {
            count[s1.charAt(i) - 'a']++;
        }

        // Subtract counts using s2
        for (int i = 0; i < s2.length(); i++) {
            count[s2.charAt(i) - 'a']--;
        }

        // If any count is not 0, not an anagram
        for (int val : count) {
            if (val != 0) {
                return false;
            }
        }

        return true;
    }

    // Test the function
    public static void main(String[] args) {
        System.out.println(isAnagram("geeks", "kseeg"));     // true
        System.out.println(isAnagram("allergy", "allergic")); // false
        System.out.println(isAnagram("g", "g"));               // true
    }
}

