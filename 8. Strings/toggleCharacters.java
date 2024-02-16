// Given a string, the task is to toggle all the characters of the string i.e.
// to convert Uppercase to Lowercase and vice-versa.

public class toggleCharacters {

    public static void toggle(StringBuilder str) {
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isUpperCase(ch)) {
                str.setCharAt(i, Character.toLowerCase(ch));
            } else if (Character.isLowerCase(ch)) {
                str.setCharAt(i, Character.toUpperCase(ch));
            }

            // Second approach
            // int ascii = str.charAt(i);
            // if (ascii >= 97 && ascii <= 122) {
            // ascii -= 32;
            // } else if (ascii >= 65 && ascii < 97) {
            // ascii += 32;
            // }
            // char ch = (char) ascii;
            // str.setCharAt(i, ch);

        }
        System.out.println("Toggled String: " + str);
    }

    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("mAniSH BhusaL");
        System.out.println("Original String: " + str);
        toggle(str);
    }
}