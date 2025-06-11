package Strings;

public class UniqueElement {

    static char nonRepeatingChar(String s) {
        int freq[] = new int[26]; // Frequency array for 'a' to 'z'

        for(int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }

        for(int i = 0; i < s.length(); i++) {
            if(freq[s.charAt(i) - 'a'] == 1) {
                return s.charAt(i);
            }
        }

        return '$';
    }

    public static void main(String[] args) {
        String input = "geeksforgeeks";
        char result = nonRepeatingChar(input);

        if(result == '$') {
            System.out.println(-1);
        } else {
            System.out.println(result);
        }
    }
}
