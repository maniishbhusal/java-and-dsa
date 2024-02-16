// Java program to reverse each word in String

public class ReverseEachWord {

    public static void reverseEachWord(String str) {
        String[] words = str.split(" ");
        StringBuilder reverseSentence = new StringBuilder();
        for (String word : words) {
            reverseSentence.append(new StringBuilder(word).reverse().append(" "));
        }
        System.out.println(reverseSentence);
    }

    public static void main(String[] args) {
        String str = "My name is Manish Bhusal.";
        reverseEachWord(str);
    }
}