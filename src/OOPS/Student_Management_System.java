package OOPS;

// 1. Student Class
class Students {
    String name;
    int marks;

    // Constructor to initialize data
    Students (String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    void display() {
        System.out.println("Student: " + name + ", Marks: " + marks);
    }
}

// 2. Course Class
class Course {
    String subject;
    int hours;

    Course(String subject, int hours) {
        this.subject = subject;
        this.hours = hours;
    }

    void display() {
        System.out.println("Course: " + subject + ", Duration: " + hours + " hours");
    }
}

// 3. Main Class (Entry Point)
public class Student_Management_System {
    public static void main(String[] args) {
        // Creating objects (Instances of the classes)
        Students s1 = new Students("Rahul", 85);
        Course c1 = new Course("Java Programming", 40);

        // Accessing data
        s1.display();
        c1.display();
    }
}