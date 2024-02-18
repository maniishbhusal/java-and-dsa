// Polymorphism is a concept by which we can perform a single action by
// different ways.

public class Polymorphism {

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.sum(2, 3));
        System.out.println(calc.sum(12.2f, 3.4f));
        System.out.println(calc.sum(12, 13, 1));

        // animal
        Deer d1 = new Deer();
        d1.eat();
    }
}

// Method Overloading -> Multiple functions with same name but different parameters(on the basis of its datatypes and total no of parameters)
class Calculator {
    int sum(int a, int b) {
        return a + b;
    }

    float sum(float a, float b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }
}

// Method overriding -> parent and child class has same function name `eat()` but different actions
class Animal {
    void eat() {
        System.out.println("eat anything");
    }
}

// Method overriding
class Deer extends Animal {
   void eat(){
    System.out.println("only eat grass");
   }
}