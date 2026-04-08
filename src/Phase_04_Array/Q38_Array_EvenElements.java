package Phase_04_Array;
import java.util.Scanner;
public class Q38_Array_EvenElements {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter the size of the array: ");
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

            int[] evens = new int[count];
            int index = 0;
            for (int i = 0; i < n; i++) {
                if (arr[i] % 2 == 0) {
                    evens[index++] = arr[i];
                }
            }

            System.out.println("Array with even elements:");
            for (int i = 0; i < evens.length; i++) {
                System.out.print(evens[i] + " ");
            }
        }
    }
