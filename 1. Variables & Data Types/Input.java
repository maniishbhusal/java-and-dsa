import java.util.*;

public class Input {
    public static void main(String[] args) {
        // Taking Input from user
        /*
         * Scanner sc = new Scanner(System.in);
         * String input = sc.nextLine();
         * System.out.println(input);
         * 
         * int num = sc.nextInt();
         * System.out.println(num);
         * 
         * long phoneNum = sc.nextLong();
         * System.out.println(phoneNum);
         */

        // Sum of two numbers
        // Scanner sc = new Scanner((System.in));
        // try {
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int sum = a + b;
        // System.out.println("The sum of " + a + " and " + b + " is " + sum);
        // } finally {
        // sc.close();
        // }

        // Area of a Circle
        float pie = 3.14f;
        Scanner sc = new Scanner(System.in);
        try {
        float radius = sc.nextFloat();
        float area = pie * radius * radius;
        System.out.println("The radius of a area is " + area);
        } finally {
        sc.close();
        }

    }

}