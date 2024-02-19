// to invoke parent class variable
class Animal {
    String color = "white";

    // parent class method
    void eat() {
        System.out.println("eating...");
    }

    // parent class constructor
    Animal() {
        System.out.println("Animal is created");
    }
}

class Dog extends Animal {
    String color = "black";

    // child class constructor
    Dog() {
        super(); // calls super class constructor and prints `Animal is created`
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
        System.out.println(super.color); // prints color of Animal class
    }
}

public class SuperKeyword {

    public static void main(String[] args) {
        Dog d = new Dog();
        // d.printColor();
        d.work();
    }
}