package OOPS.Constructor;

import java.util.Scanner;
public class Ex2 {

    static class User {
        String name;
        int age;

        User(String name, int age) {
            this.name = name;
            this.age = age;
        }

        void displayDetails() {
            System.out.println("User Profile -> Name: " + name + ", Age: " + age);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String userName = sc.nextLine();

        System.out.print("Enter your age: ");
        int userAge = sc.nextInt();

        User u1 = new User(userName, userAge);

        u1.displayDetails();

        sc.close();
    }
}

