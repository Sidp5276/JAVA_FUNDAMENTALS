package ARRAYLIST;
import java.util.*;
import java.util.stream.Collectors;

public class Q7 {

    static class User {
        String name;
        int age;

        User(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return name + " (" + age + ")";
        }
    }

    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User("John", 22));
        users.add(new User("Alice", 30));
        users.add(new User("Bob", 28));
        users.add(new User("Eve", 24));
        users.add(new User("Charlie", 35));

        List<User> filteredUsers = users.stream()
                .filter(u -> u.age > 25)
                .sorted(Comparator.comparingInt((User u) -> u.age).reversed())
                .collect(Collectors.toList());

        System.out.println("Users older than 25 (Sorted Desc):");
        filteredUsers.forEach(System.out::println);
    }
}