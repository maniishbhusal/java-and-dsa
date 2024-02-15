// Given a strings, print all the substrings of s.
// Input: s = "abcd"
// Output: a ab abc abcd b bc bcd c cd d

public class PrintSubStrings {

    public static void printSubStrings(String s) {
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                System.out.print(s.substring(i, j + 1) + " "); // from i to j+1
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        String s = "abcd";
        printSubStrings(s);
    }
}