package Phase_04_Array;
import java.util.*;
public class Q22_Array_EvenElements {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter the size of array: ");
            int n = sc.nextInt();

            int[] arr = new int[n];

            System.out.println("Enter " + n + " elements:");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int count = 0;
            for (int i = 0; i < n; i++) {
                if (arr[i] % 2 == 0) {
                    count++;
                }
            }

            int[] evenArr = new int[count];
            int j = 0;
            for (int i = 0; i < n; i++) {
                if (arr[i] % 2 == 0) {
                    evenArr[j] = arr[i];
                    j++;
                }
            }

            if (count > 0) {
                System.out.println("New array with even elements:");
                for (int i = 0; i < evenArr.length; i++) {
                    System.out.print(evenArr[i] + " ");
                }
            } else {
                System.out.println("No even elements found in the array.");
            }
    }
}
