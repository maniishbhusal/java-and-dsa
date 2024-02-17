public class Student {

    String name;
    int rollNo;
    double percent;
    final String school = "Pawan"; // now it can't be modified
    private static int noOfStudents;

    // default constructor
    public Student() {
        noOfStudents++;
    }

    // constructor
    public Student(String name, int rollNo, double percent) {
        this.name = name;
        this.rollNo = rollNo;
        this.percent = percent;
        noOfStudents++;

        System.out.println("this will be printed automatically when objects is created");
    }

    public static int getNoOfStudents() {
        return noOfStudents;
    }

    // getter
    public int getRollNo() {
        return rollNo;
    }

    // setter
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
}
