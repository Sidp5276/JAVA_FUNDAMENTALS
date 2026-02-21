package phase_03;

import java.util.Scanner;

        public class Q1_1_to_n {

            static void printNumbers(int current, int n) {

                if (current > n) {
                    return;
                }
                System.out.print(current + " ");

                printNumbers(current + 1, n);

                System.out.print(current + " ");
            }
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);

                System.out.print("Enter n: ");
                int n = sc.nextInt();
                printNumbers(1, n);
            }
        }

