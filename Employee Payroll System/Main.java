import java.util.ArrayList;

abstract class Employee {
    private String name;
    private int id;

    // constructor
    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public abstract double calculateSalary(); // abstract method

    @Override
    public String toString() {
        return "Employee [name=" + name + ", id=" + id + ", salary=" + calculateSalary() + "]";
    }
}

// full time employee class
class FullTimeEmployee extends Employee {
    private double monthlySalary;

    // constructor
    public FullTimeEmployee(String name, int id, double monthlySalary) {
        super(name, id);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculateSalary() {
        return monthlySalary;
    }
}

// part time employee
class PartTimeEmployee extends Employee {
    private int hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(String name, int id, int hoursWorked, double hourlyRate) {
        super(name, id);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}

// payroll system class
class PayrollSystem {
    private ArrayList<Employee> employeeList;

    public PayrollSystem() {
        employeeList = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employeeList.add(employee);
    }

    // remove employee object if given id matches to employee id
    public void removeEmployee(int id) {
        Employee employeeToRemove = null;
        for (Employee employee : employeeList) {
            if (employee.getId() == id) {
                employeeToRemove = employee;
                break;
            }
        }
        if (employeeToRemove != null) {
            employeeList.remove(employeeToRemove);
            System.out.println("Employee removed successfully");
        } else {
            System.out.println("Employee ID not matched");
        }
    }

    public void displayEmployees() {
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }

}

public class Main {

    public static void main(String[] args) {
        PayrollSystem payrollSystem = new PayrollSystem();
        FullTimeEmployee emp1 = new FullTimeEmployee("Benjamin", 1, 30000);
        PartTimeEmployee emp2 = new PartTimeEmployee("Manish", 2, 10, 998895);
        payrollSystem.addEmployee(emp1);
        payrollSystem.addEmployee(emp2);
        System.out.println("Initial Employee Details:");
        payrollSystem.displayEmployees();
        payrollSystem.removeEmployee(1);
        // payrollSystem.displayEmployees();
        System.out.println(emp1.calculateSalary());
        System.out.println(emp2.calculateSalary());

    }
}