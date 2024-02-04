/*
A
B C
D E F
G H I J
K L M N O
 */

public class PrintCharacterPattern {

    public static void main(String[] args) {
        // The character is initially set to 'A' and is incremented after each iteration.
        char ch = 'A';
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
    }
}