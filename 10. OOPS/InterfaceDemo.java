interface Car {
    public void start();
}

class ElectricCar implements Car {
    public void start() {
        System.out.println("Electric Car Starts");
    }
}

class DieselCar implements Car {
    public void start() {
        System.out.println("Diesel Car Starts");
    }
}

public class InterfaceDemo {

    public static void main(String[] args) {
        Car tesla = new ElectricCar();
        tesla.start();
        Car xuv700 = new DieselCar();
        xuv700.start();

        ElectricCar s1 = new ElectricCar();
        s1.start();
    }
}