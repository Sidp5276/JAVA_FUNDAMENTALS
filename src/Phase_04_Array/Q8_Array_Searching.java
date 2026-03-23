package Phase_04_Array;
import java.util.*;
public class Q8_Array_Searching {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int[] arr = {2, 5, 6, 7, 8, 99, 524, 489, 325, 159, 357};

                System.out.println("Welcome to Array Searching: ");
                System.out.print("Enter the number: ");
                int num = sc.nextInt();

                boolean found = false;
                int index = -1;

                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] == num) {
                        found = true;
                        index = i;
                        break;
                    }
                }

                if (found) {
                    System.out.println("Number " + num + " found at index " + index);
                } else {
                    System.out.println("Number " + num + " not found in the array.");
                }
            }
        }
