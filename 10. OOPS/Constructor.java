public class Constructor {

    public static void main(String[] args) {
        Student s1 = new Student("Manish", 19, "1234");
        s1.age = 21;
        s1.marks[0] = 12;
        s1.marks[1] = 82;
        Student s2 = new Student(s1); // copy properties of s1 object
        s1.age = 30;

        for (int i = 0; i < 2; i++) {
            System.out.println(s2.marks[i]);
        }
        s1.marks[0] = 1220;
        for (int i = 0; i < 2; i++) {
            System.out.println(s2.marks[i]);
        }
    }

    public static class Student {
        String name;
        int age;
        String password;
        int[] marks = new int[2];

        // parameterized constructor
        public Student(String name, int age, String password) {
            this.name = name;
            this.age = age;
            this.password = password;
        }

        // shallow copy constructor
        // public Student(Student s1) {
        // this.name = s1.name;
        // this.age = s1.age;
        // this.marks = s1.marks; // changing marks on s1 also changed in s2 object
        // }

        // deep copy constructor
        public Student(Student s1) {
            this.name = s1.name;
            this.age = s1.age;
            // marks = new int[s1.marks.length];
            for (int i = 0; i < s1.marks.length; i++) { // doesn't change marks in s1 object to s2 object
                this.marks[i] = s1.marks[i];
            }
        }
    }
}
