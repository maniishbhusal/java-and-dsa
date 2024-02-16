// Given a strings, return the number of palindromic substrings in it.
// Input: abc  Output: 3

public class PalindromicSubstrings {

    public static boolean checkPalindrome(StringBuilder str) {
        for (int i = 0, j = str.length() - 1; i < j; i++, j--) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
        }
        return true;
    }

    public static void palindromicSubstrings(StringBuilder str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < str.length(); j++) {
                StringBuilder s = new StringBuilder(str.substring(i, j + 1));
                if (checkPalindrome(s)) {
                    System.out.print(s + " ");
                    count++;
                }
            }
        }
        System.out.println("\nThe number of palindromic substrings are: " + count);
    }

    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("repaper");
        palindromicSubstrings(str);
    }
}