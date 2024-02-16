// For a given String convert the first letter of each word to Uppercase.

public class ConvertToUpperCase {

    public static void toUpperCase(String name) {
        StringBuilder str = new StringBuilder("");
        char ch = Character.toUpperCase(name.charAt(0));
        str.append(ch);

        for (int i = 1; i < name.length(); i++) {
            if (name.charAt(i) == ' ' && i < name.length() - 1) {
                str.append(name.charAt(i));
                i++;
                str.append(Character.toUpperCase(name.charAt(i)));
            } else {
                str.append(name.charAt(i));
            }
        }
        System.out.println(str.toString().trim());
    }

    public static void main(String[] args) {
        String name = "my name is manish bhusal";
        toUpperCase(name);
    }
}