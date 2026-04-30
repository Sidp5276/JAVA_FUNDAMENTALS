package OOPS.Constructor;
import java.util.Scanner;
public class Ex1 {

        static class Laptop {
            String brand;
            int ram;

            Laptop() {
                brand = "Unknown Brand";
                ram = 4; // Default 4GB
                System.out.println("Default Constructor Called!");
            }

            Laptop(String b, int r) {
                brand = b;
                ram = r;
                System.out.println("Parameterized Constructor Called!");
            }

            void display() {
                System.out.println("Laptop: " + brand + " | RAM: " + ram + "GB");
            }
        }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.print("Enter Laptop 1 Brand: ");
        String b1 = sc.nextLine();
        System.out.print("Enter Laptop 1 RAM: ");
        int r1 = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter Laptop 2 Brand: ");
        String b2 = sc.nextLine();
        System.out.print("Enter Laptop 2 RAM: ");
        int r2 = sc.nextInt();

        Laptop l1 = new Laptop(b1, r1);
        Laptop l2 = new Laptop(b2, r2);

        l1.display();
        l2.display();

        sc.close();
    }
}