package Phase_01;
//Take three numbers and print the largest

import java.util.Scanner;

    public class Q_07_LargestofThree {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // Taking input
            System.out.print("Enter first number: ");
            int num1 = sc.nextInt();
            System.out.print("Enter second number: ");
            int num2 = sc.nextInt();
            System.out.print("Enter third number: ");
            int num3 = sc.nextInt();

            // Logic to find the largest
            int largest;
            if (num1 >= num2 && num1 >= num3) {
                largest = num1;
            } else if (num2 >= num1 && num2 >= num3) {
                largest = num2;
            } else {
                largest = num3;
            }

            // Output
            System.out.println("The largest number is: " + largest);
        }
    }

