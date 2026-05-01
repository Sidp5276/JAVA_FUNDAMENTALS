package OOPS.INHERITANCE;

public class Ex2 {
// Multilevel

    static class person{
        String name = "RAHUL";

        void walk() {
System.out.println("Person is walking");
        }
    }

    static class employee extends person {
        int employeeID = 1001;
        void work() {
            System.out.println("Employee is working");
        }
    }

    static class manager extends employee {
        String department = "IT";
        void manage() {
            System.out.println("Manager is managing");
        }
    }

    public static void main(String[] args) {
        manager m= new manager();
        System.out.println("Name:" + m.name);
        System.out.println("ID:" + m.employeeID);
        System.out.println("Dept:" + m.department);

        m.walk();
        m.work();
        m.manage();
    }
}