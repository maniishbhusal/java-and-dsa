// Remove Duplicates in a String
// maaannnnisssha -> manish

public class RemoveDuplicates {

    public static void removeDuplicate(String str, StringBuilder newStr, int i, boolean map[]) {
        if (i == str.length()) {
            System.out.println(newStr);
            return;
        }

        char currChar = str.charAt(i);
        if (map[currChar - 'a'] == true) { // 109-97=12
            // duplicate
            removeDuplicate(str, newStr, i + 1, map);
        } else {
            map[currChar - 'a'] = true; // set true if character found original not duplicate
            removeDuplicate(str, newStr.append(currChar), i + 1, map);
        }
    }

    public static void main(String[] args) {
        String str = "maannisshhhaaaannn"; // manish
        removeDuplicate(str, new StringBuilder(), 0, new boolean[26]);
    }
}