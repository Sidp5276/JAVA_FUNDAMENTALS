package ARRAYLIST;
import java.util.*;
//Dashboard

public class Q3 {

        public static void main(String[] args) {
            List<String> pages = new ArrayList<>(Arrays.asList("Login", "Signup", "Dashboard", "Logout"));

            String target = "dashboard";
            boolean found = false;

            for (String page : pages) {
                if (page.equalsIgnoreCase(target)) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                throw new RuntimeException("Validation Failed: " + target + " not found in pages!");
            } else {
                System.out.println("Validation Passed: Found " + target);
            }
        }
    }

