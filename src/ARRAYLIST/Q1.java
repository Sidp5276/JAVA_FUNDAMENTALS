package ARRAYLIST;
import java.util.ArrayList;
public class Q1 {

        public static void main(String[] args) {
            // 1. ArrayList Create karna
            ArrayList<String> browsers = new ArrayList<>();

            // 2. 5 Browser names add karna
            browsers.add("Chrome");
            browsers.add("Firefox");
            browsers.add("Safari");
            browsers.add("Edge");
            browsers.add("Brave");

            // 3. Print using For Loop (Index ke saath)
            System.out.println("--- Using For Loop ---");
            for (int i = 0; i < browsers.size(); i++) {
                System.out.println(browsers.get(i));
            }

            // 4. Print using For-Each Loop
            System.out.println("\n--- Using For-Each Loop ---");
            for (String browser : browsers) {
                System.out.println(browser);
            }

            // 5. Remove 1 element (e.g., Edge remove kar rahe hain index 3 se)
            browsers.remove(3);
            System.out.println("\n--- After Removing Edge ---");

            // Print again to verify
            for (String b : browsers) {
                System.out.println(b);
            }
        }
    }
