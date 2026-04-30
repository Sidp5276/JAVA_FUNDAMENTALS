package OOPS.Constructor;

public class Ex3 {
    static class user {
        String name;
        int age;
        String city;

        user() {
            this.name = "Guest";
            this.age = 0;
            this.city = "Not Specified";
            System.out.println("user created");
        }

        user (String name, int age) {
                this.name = name;
                this.age = age;
                this.city = "Unknown";
                System.out.println("Constructor 2: Name & Age User Created");
            }

            user(String name, int age, String city) {
                this.name = name;
                this.age = age;
                this.city = city;
                System.out.println("Constructor 3: Full Profile User Created");
            }

            void display() {
            System.out.println("Details -> Name:" + name + ", Age:" + age + ", city:" + city );
            System.out.println("---------------------------------");
        }
    }

    public static void main(String[] args) {
        user u1 = new user();
        user u2 = new user("Me", 25);
        user u3 = new user("Still me", 25, "Geneva");

        u1.display();
        u2.display();
        u3.display();
    }
}
