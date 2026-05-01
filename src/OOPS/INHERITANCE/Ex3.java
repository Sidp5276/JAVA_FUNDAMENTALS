package OOPS.INHERITANCE;
//HIERARCHIAL

public class Ex3 {
        static class Animal {
            String type = "Living Being";

            void eat() {
                System.out.println("This animal is eating...");
            }
        }

        static class Dog extends Animal {
            void bark() {
                System.out.println("Dog is barking: Woof! Woof!");
            }
        }

        static class Cat extends Animal {
            void meow() {
                System.out.println("Cat is meowing: Meow~");
            }
        }

        public static void main(String[] args) {

            Dog d = new Dog();
            System.out.println("Dog is a: " + d.type);
            d.eat();
            d.bark();

            System.out.println("--------------------");


            Cat c = new Cat();
            System.out.println("Cat is a: " + c.type);
            c.eat();
            c.meow();
        }
    }
