package OOPS;

public class Constructor {

    // Define the class once
    static class Student {
        String name;
        int age;

        // 1. Non-parameterized constructor
        Student() {
            System.out.println("Non-parameterized constructor called");
        }

        // 2. Parameterized constructor
        Student(String name, int age) {
            this.name = name;
            this.age = age;
            System.out.println("Parameterized constructor called");
        }

        // 3. Copy Constructor
        Student(Student s2) {
            this.name = s2.name;
            this.age = s2.age;
            System.out.println("Copy constructor called");
        }
    }

    public static void main(String[] args) {
        // Usage examples:
        Student s1 = new Student();              // Calls non-parameterized
        Student s2 = new Student("Alice", 20);   // Calls parameterized
        Student s3 = new Student(s2);            // Calls copy constructor
    }
}