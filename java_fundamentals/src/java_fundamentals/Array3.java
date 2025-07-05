package java_fundamentals;

import java.util.Scanner;

public class Array3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] array = new int[n];

        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        System.out.print("Enter the number to search for: ");
        int searchNumber = sc.nextInt();
        int index = -1;

        for (int i = 0; i < n; i++) {
            if (array[i] == searchNumber) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            System.out.println("Number found at index: " + index);
        } else {
            System.out.println("-1 (Number not found)");
        }

    }
}

