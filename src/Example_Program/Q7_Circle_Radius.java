package Example_Program;

import java.util.Scanner;

public class Q7_Circle_Radius {
    public static void main(String[] args) {
        double radius, area;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        radius = sc.nextDouble();
        area = Math.PI * radius * radius;
System.out.println("Area of radius of circle is: " + area);
    }
}
