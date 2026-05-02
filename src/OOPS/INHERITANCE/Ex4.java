package OOPS.INHERITANCE;
// super key
public class Ex4 {

   static class Animal {
        void display() {
            System.out.println("This is the Animal class.");
        }

        void eat() {
            System.out.println("The animal is eating food.");
        }
    }

    static class Dog extends Animal {
        @Override
        void display() {
            System.out.println("This is the Dog class.");
        }

        void bark() {
            System.out.println("The dog is barking.");
        }

        void performActions() {
            display();

            super.display();

            super.eat();
            bark();
        }
    }
        public static void main(String[] args) {
            Dog myDog = new Dog();
            myDog.performActions();
        }
    }
