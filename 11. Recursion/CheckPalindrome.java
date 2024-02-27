public class CheckPalindrome {

    public static boolean isPalindrome(String str, int l, int r) {
        if (l >= r)
            return true;
        if (str.charAt(l) != str.charAt(r))
            return false;

        // Recursively check the remaining substring excluding the current left and right characters
        return isPalindrome(str, l + 1, r - 1);
    }

    public static void main(String[] args) {
        String str = "addaa";
        boolean result = isPalindrome(str, 0, str.length() - 1);
        if (result)
            System.out.println(str + " is palindrome");
        else
            System.out.println(str + " is not palindrome");
    }
}