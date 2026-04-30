package OOPS.POLYMORPHISM;

public class Overloading {
    static class overload {
        void sum (int a, int b) {
            System.out.println(a + b);
        }
        void sum (int a, int b, int c) {
            System.out.println(a+b+c);
        }

        void sum(String a, String b) {
            System.out.println(a+b);
        }
    }

        public static void main(String[] args) {
            overload obj = new overload();
            obj.sum (15,277);
            obj.sum  (58,63,298);
            obj.sum  ("sid", "patel");
        }
    }
