package java_fundamentals;
import java.util.Arrays;
import java.util.Scanner;

public class Array9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Size of the array: ");
        int n = sc.nextInt();

        int[] a = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int[] result = new int[n];
        int idx = 0;
        for (int x : a) {
            if (x != 10) {
                result[idx++] = x;
            }
        }

        System.out.println("Array after removing all 10s and left-shifting:");
        System.out.println(Arrays.toString(result));
    }
}