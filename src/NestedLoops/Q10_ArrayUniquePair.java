package NestedLoops;
//10. Print all unique pairs of numbers from an array (i < j).
import  java.util.Scanner;

public class Q10_ArrayUniquePair {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int n = sc.nextInt();

        int[] a=new int[n]; for(int i=0;i<n;i++) a[i]=sc.nextInt();
        for(int i=0;i<n;i++) for(int j=i+1;j<n;j++) System.out.print("("+a[i]+","+a[j]+") ");
        System.out.println();
    }
}
