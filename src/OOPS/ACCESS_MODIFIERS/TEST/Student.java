package OOPS.ACCESS_MODIFIERS.TEST;

import OOPS.ACCESS_MODIFIERS.BASE.Teacher;

    public class Student extends Teacher {

        public void checkAccess() {

            System.out.println(subject);

            System.out.println(salary);
        }

        public static void main(String[] args) {
            Student s1 = new Student();
            s1.checkAccess();
        }
    }
