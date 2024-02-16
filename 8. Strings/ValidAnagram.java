// Determine if two strings are anagrams of each other
// An Anagram is a word or phrase formed by rearranging the letters of a
// different word or phrase, typically using all the original letters exactly
// once.
// e.g. calm/clam

import java.util.Arrays;

public class ValidAnagram {

    public static boolean checkAnagram(String str1, String str2) {
        if (str1.length() != str2.length())
            return false;

        char str1Array[] = str1.toCharArray(); // {'m','a','a','n'}
        char str2Array[] = str2.toCharArray();

        Arrays.sort(str1Array); // {'a','a','m','n'}
        Arrays.sort(str2Array);

        if (Arrays.equals(str1Array, str2Array))
            return true;

        return false;
    }

    public static void main(String[] args) {
        String str1 = "maan";
        String str2 = "naam";
        if (checkAnagram(str1.toLowerCase(), str2.toLowerCase())) {
            System.out.println(str1 + " and " + str2 + " are anagram");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagram");
        }
    }
}