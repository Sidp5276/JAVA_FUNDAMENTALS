package OOPS;

import java.util.ArrayList;

class Stud {
    String name;
    int marks;

    Stud(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    void display() {
        System.out.println("Name: " + name + ", Marks: " + marks);
    }
}

public class Management_Arraylist {
    public static void main(String[] args) {
        ArrayList<Stud> studList = new ArrayList<>();

        studList.add(new Stud("Rahul", 85));
        studList.add(new Stud("Priya", 92));
        studList.add(new Stud("Amit", 78));

        System.out.println("--- Student List ---");
        for (Stud s : studList) {
            s.display();
        }
    }
}