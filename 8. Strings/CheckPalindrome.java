// Check if a String is a Palindrome

public class CheckPalindrome {

    public static boolean checkPalindrome(String str) {
        for (int i = 0, j = str.length() - 1; i < j; i++, j--) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "racecar";
        boolean palindrome = checkPalindrome(str);
        if (palindrome) {
            System.out.println("String " + str + " is palindrome");
        } else {
            System.out.println("String " + str + " is not palindrome");
        }
    }
}