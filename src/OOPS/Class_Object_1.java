package OOPS;

public class Class_Object_1 {
    static class Laptop {
       String brand;
       int ram;

       void display () {
     System.out.println("BRAND: " + brand + "\nRAM: " + ram + "GB");
       }
    }
    // public class main {
        public static void main(String[] args) {
            Laptop myLaptop = new Laptop();
            myLaptop.brand = "HP";
            myLaptop.ram = 16;
            myLaptop.display();
        }}

