// Print x^n

public class PrintXpowerN {

    // Not optimized solution
    // public static int findPower(int base, int power) {
    // if (power == 0)
    // return 1;
    // return base * findPower(base, power - 1);
    // }

    // Optimized solution
    public static int findPower(int base, int power) {
        if (power == 0)
            return 1;

        int halfPower = findPower(base, power / 2);
        int halfPowerSq = halfPower * halfPower;
        // same as above
        // int halfPowerSq = findPower(base, power / 2) * findPower(base, power / 2); 

        // power is odd
        if (power % 2 != 0)
            halfPowerSq = base * halfPowerSq;
        return halfPowerSq;
    }

    public static void main(String[] args) {
        int base = 2, power = 10;
        System.out.println(base + "^" + power + ": " + findPower(base, power));
    }
}