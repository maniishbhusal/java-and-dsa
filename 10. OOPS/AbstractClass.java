public class AbstractClass {

    public static void main(String[] args) {
        Child c1 = new Child();
        c1.greet();

        Child2 c2 =new Child2();
        c2.sayHello();
        c2.greet();
    }
}

    abstract class Parent {
        // constructor
        public Parent() {
            System.out.println("Constructor of Parent");
        }

        public void sayHello() {
            System.out.println("Hello");
        }

        // abstract method -> different people can greet differently, so abstract helps
        // to define a method without implementation in the abstract class, allowing
        // each subclass to provide its own implementation.
        abstract public void greet();

    }

    class Child extends Parent {
        // the @Override annotation specifies the compiler that the method after this
        // annotation overrides the method of the superclass.
        @Override
        public void greet() {
            System.out.println("Hello Good Morning");
        }
    }

    class Child2 extends Parent {
        @Override
        public void greet() {
            System.out.println("Guten Morgan");
        }
    }