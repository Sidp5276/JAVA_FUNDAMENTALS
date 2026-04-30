package OOPS.Class_Object;

public class Class_Object_4 {

        static class Student {
            String name;

            static int count = 0;

            Student(String name) {
                this.name = name;
                count++;
            }
            static  void showTotalStudents() {
                System.out.println("Total students so far: " + count);
            }
        }

        public static void main(String[] args) {
            Student.showTotalStudents();
            Student s1 = new Student("ME");
            Student s2 = new Student("MYSELF");
            Student s3 = new Student("I");
            System.out.println("After creating Objects");
            Student.showTotalStudents();

            System.out.println("Count from s1 object: " + s1.count);
        }
    }