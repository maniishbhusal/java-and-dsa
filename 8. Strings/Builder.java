public class Builder {

    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Hello World");
        str.append("!");
        // Hello -> Mello
        str.setCharAt(0, 'M');
        str.insert(6, "!Grishma "); // Mello !Grishma World!
        str.deleteCharAt(6); // Mello Grishma World!
        // str.delete(5, 13); // deletes from start to end
        System.out.println(str);

        // reverse the string
        StringBuilder str2 = new StringBuilder("Manish");
        for (int i = 0, j = str2.length() - 1; i < j; i++, j--) {
            char temp = str2.charAt(i);
            str2.setCharAt(i, str2.charAt(j));
            str2.setCharAt(j, temp);
        } //hsinaM

        // inbuilt function for reverse
        str2.reverse();
        System.out.println("Reversed string: " + str2);

    }
}