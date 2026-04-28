package OOPS;

public class Q3_Inheritance {

    static class Vehicle {
        String brand;
        int year;

        public void start() {
            System.out.println("Vehicle is starting...");
        }

        public void stop() {
            System.out.println("Vehicle is stopping...");
        }
    }

    static class Car extends Vehicle {
        int doors;
        public void honk() {
            System.out.println("Car says: Beep Beep!");
        }
    }

    static class Bike extends Vehicle {
        boolean hasCarrier;
        public void kickStart() {
            System.out.println("Bike started with a kick.");
        }
    }

    public static void main(String[] args) {
        // Car object
        Car myCar = new Car();
        myCar.brand = "Toyota";
        myCar.start();
        myCar.honk();

        Bike myBike = new Bike();
        myBike.brand = "Yamaha";
        myBike.kickStart();
        myBike.stop();
    }
}