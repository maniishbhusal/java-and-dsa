public class Fraction {

    public static int gcd(int num, int den) { // Greatest Common Divisor
        int hcf = 1;
        int min = Math.min(num, den);
        for (int i = min; i >= 1; i--) {
            if (num % i == 0 && den % i == 0) {
                return i;
            }
        }
        return hcf;
    }

    // add two fractions
    public static InnerFraction addTwoFractions(InnerFraction f1, InnerFraction f2) {
        int num = f1.numerator * f2.denominator + f1.denominator * f2.numerator;
        int deno = f1.denominator * f2.denominator;
        InnerFraction f3 = new InnerFraction(num, deno);
        return f3;
    }

    // multiply
    public static InnerFraction multiply(InnerFraction f1, InnerFraction f2) {
        int num = f1.numerator * f2.numerator;
        int deno = f1.denominator * f2.denominator;
        InnerFraction f3 = new InnerFraction(num, deno);
        return f3;
    }

    public static class InnerFraction {

        int numerator;
        int denominator;

        // constructor
        public InnerFraction(int numerator, int denominator) {
            this.numerator = numerator;
            this.denominator = denominator;

            simplify();

        }

        // simplify function - 7/21 -> 1/3
        public void simplify() {

            int hcf = gcd(this.numerator, this.denominator);
            this.numerator /= hcf;
            this.denominator /= hcf;
        }

    }

    public static void main(String[] args) {
        InnerFraction f1 = new InnerFraction(8, 24);
        // System.out.println(f1.numerator);
        // f1.simplify();
        System.out.println(f1.numerator + "/" + f1.denominator);
        InnerFraction f2 = new InnerFraction(14, 6);
        System.out.println(f2.numerator + "/" + f2.denominator);

        // add two fractions
        InnerFraction f3 = addTwoFractions(f1, f2);
        System.out.println("Addition of two fractions: " + f3.numerator + "/" + f3.denominator);

        // multiply
        InnerFraction f4 = multiply(f1, f2);
        System.out.println("Multiplication: " + f4.numerator + "/" + f4.denominator);
    }
}