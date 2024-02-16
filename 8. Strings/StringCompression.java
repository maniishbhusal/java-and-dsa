// String Compression
// Input: aaabbcccd     Output: a3b2c3d

public class StringCompression {

    public static String compressed(String str) {
        StringBuilder newString = new StringBuilder("");
        int count = 1;
        for (int i = 0; i < str.length(); i++) {

            // Check if the current character is the same as the next one
            if (i + 1 < str.length() && str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                // Append the character to the compressed string
                newString.append(str.charAt(i));
                if (count > 1) { // Append the count if it's greater than 1
                    newString.append(count);
                }
                count = 1; // Reset the count for the next character
            }
        }
        return newString.toString();
    }

    public static void main(String[] args) {
        String str = "maannniisssssh";
        System.out.println(compressed(str)); // ma2n3i2s5h
    }
}