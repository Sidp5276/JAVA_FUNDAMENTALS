package OOPS.ABSTRACTION;

    abstract class Vehicle {

        abstract void start();

        void stop() {
            System.out.println("Vehicle stopped: Engine off");
        }
    }

    class Car extends Vehicle {
        @Override
        void start() {
            System.out.println("Car Starting: Press button.");
        }
    }

    class Bike extends Vehicle {
        @Override
        void start() {
            System.out.println("Bike Starting: Kick maaro ya Self-start karo.");
        }
    }

    class VehicleTest {
        public static void main(String[] args) {
            System.out.println("--- Vehicle Control System ---");

            Vehicle myVehicle;

            myVehicle = new Car();
            myVehicle.start();
            myVehicle.stop();

            System.out.println();

            myVehicle = new Bike();
            myVehicle.start();
            myVehicle.stop();
        }
    }
