package Phase_04_Array;
import java.util.*;
public class Q17_Array_CountPrime {
        static boolean isPrime(int num) {
            if (num <= 1) return false;
            if (num == 2) return true;
            if (num % 2 == 0) return false;

            for (int i = 3; i <= Math.sqrt(num); i += 2) {
                if (num % i == 0) return false;
            }
            return true;
        }
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
            for (int num : arr) {
                if (isPrime(num)) {
                    count++;
                }
            }
            System.out.println("Count of prime numbers in the array: " + count);
        }
    }

