// Inheritance is when properties & methods of base(parent) class are passed on
// to a derived(child) class.

public class Inheritance {

    // base class
    public static class Animal {
        String color;

        public void breathe() {
            System.out.println("breathes");
        }

        public void eat() {
            System.out.println("eats");
        }
    }

    // Mammal class inherits from Animal class
    public static class Mammal extends Animal {
        int legs;
    }

    // Dog class inherits from Mammal class which inherits from Animal class
    public static class Dog extends Mammal {
        boolean bark;
    }

    // child class (single level inheritance)
    public static class Fish extends Animal {
        int fins;

        void swim() {
            System.out.println("Swims");
        }
    }

    public static class Tuna extends Fish{
        void fly() {
            System.out.println("flyI");
        }
    }

    public static void main(String[] args) {
        // fish
        Fish shark = new Fish();
        shark.color = "blue";
        shark.eat();

        // dog
        Dog d1 = new Dog();
        d1.bark = true;
        d1.breathe();
    }
}