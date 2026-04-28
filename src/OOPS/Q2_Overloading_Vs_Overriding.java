package OOPS;

public class Q2_Overloading_Vs_Overriding {

        static class Calculator {
            public int add(int a, int b) {
                return a + b;
            }
            public int add(int a, int b, int c) {
                return a + b + c;
            }
        }

        static class Animal {
            public void makeSound() {
                System.out.println("Animal makes a sound");
            }
        }

        static class Dog extends Animal {
            @Override
            public void makeSound() {
                System.out.println("Dog barks");
            }
        }

        public static void main(String[] args) {
            Calculator calc = new Calculator();
            System.out.println("Overloading Result: " + calc.add(10, 20));

            Animal myAnimal = new Dog();
            myAnimal.makeSound();
        }
    }