// to invoke parent class variable
class Animall {
    String color = "white";

    // parent class method
    void eat() {
        System.out.println("eating...");
    }

    // parent class constructor
    Animall() {
        System.out.println("Animall is created");
    }
}

class Dog extends Animall {
    String color = "black";

    // child class constructor
    Dog() {
        super(); // calls super class constructor and prints `Animall is created`
        System.out.println("Dog is created"); // Dog is created
    }

    // child class method having same name
    void eat() {
        System.out.println("eating bread...");
    }

    void bark() {
        System.out.println("barking...");
    }

    void work() {
        eat(); // eating bread...
        super.eat(); // eating...
    }

    void printColor() {
        System.out.println(color); // prints color of Dog class
        System.out.println(super.color); // prints color of Animall class
    }
}

public class SuperKeyword {

    public static void main(String[] args) {
        Dog d = new Dog();
        // d.printColor();
        d.work();
    }
}