package NestedLoops;
// 9. Print all pairs of numbers from an array using nested loops.

 import java.util.Scanner;
public class Q9_ArrayNested {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int n = sc.nextInt();

        int[] a=new int[n]; for(int i=0;i<n;i++) a[i]=sc.nextInt();
        for(int i=0;i<n;i++) for(int j=0;j<n;j++) System.out.print("("+a[i]+","+a[j]+") ");
        System.out.println();
    }
}