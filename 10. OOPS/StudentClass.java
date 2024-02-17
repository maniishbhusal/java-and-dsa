public class StudentClass {

    // Car class
    public static class Car {

        String name;
        String color;
        int wheel;
    }

    // function that accepts Class
    public static void student(Student x) {
        x.name = "Grishma";
    }

    public static void main(String[] args) {
        Student x = new Student();
        x.name = "Manish";
        x.percent = 92.22;
        // x.rollNo = 13;
        System.out.println(x.getRollNo()); // getter function calling
        x.setRollNo(10); // setter function calling
        System.out.println(x.getRollNo());

        student(x);

        Student x2 = new Student();
        x2.name = "Manish Bhusal";
        System.out.println(x2.name);

        Car c1 = new Car();
        c1.name = "Ferharri";
        c1.color = "red";

        System.out.println(x.name);
    }
}