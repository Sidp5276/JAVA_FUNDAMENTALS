package OOPS.Class_Object;

public class Class_Object_3 {
     static class Student{
         String name;
         int marks;

         //Constructor
         Student (String name, int marks) {
             this.name = name;
             this.marks = marks;
         }
         String calculateGrade() {
             if (marks >= 90) {
                 return "A+ (Topper!)";
             } else if (marks >= 75) {
                 return "A";
             } else if (marks >= 60) {
                 return "B";
             } else if (marks >= 40) {
                 return "C";
             } else {
                 return "Fail";
             }
         }

         void displayInfo () {
             System.out.println("Student: " + name);
             System.out.println("Marks" + marks);
             System.out.println("Grade" + calculateGrade());
             System.out.println();
         }
             }

    public static void main(String[] args) {
        Student [] classbatch = new Student[3];
        classbatch[0] = new Student("Rahul", 95);
        classbatch[1] = new Student("Nannhe", 94);
        classbatch[2] = new Student("Mai", 98);

        System.out.println("===Results===");
        for (Student s: classbatch) {
            s.displayInfo();
        }
    }
}


