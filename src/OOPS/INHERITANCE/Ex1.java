package OOPS.INHERITANCE;

public class Ex1 {

        static class Employee {
            String name;
            double baseSalary;

            Employee(String name, double baseSalary) {
                this.name = name;
                this.baseSalary = baseSalary;
            }

            void showDetails() {
                System.out.println("Employee: " + name);
                System.out.println("Total Salary: ₹" + calculateSalary());
            }

            double calculateSalary() {
                return baseSalary; // Normal employee gets only base
            }
        }

        static class Developer extends Employee {
            double bonus;

            Developer(String name, double baseSalary, double bonus) {

                super(name, baseSalary);
                this.bonus = bonus;
            }

            @Override
            double calculateSalary() {

                return baseSalary + bonus;
            }
        }

        public static void main(String[] args) {

            Employee emp = new Employee("Amit", 30000);
            emp.showDetails();

            System.out.println("-----------------------");

            Developer dev = new Developer("Rahul", 50000, 15000);
            dev.showDetails();
        }
    }