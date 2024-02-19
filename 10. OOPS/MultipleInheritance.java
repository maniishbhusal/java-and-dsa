interface A {
    public void run();
}

interface B {
    public void run();

    public void walk();
}

class C implements A, B {
    public void run() {
        System.out.println("C class run");
    }

    public void walk() {
        System.out.println("C class walks");
    }
}

public class MultipleInheritance {

    public static void main(String[] args) {
        C obj = new C();
        obj.run();
        obj.walk();

    }
}