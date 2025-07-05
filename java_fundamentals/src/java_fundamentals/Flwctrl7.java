package java_fundamentals;

import java.util.Scanner;
public class Flwctrl7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        int number = 1;
        System.out.println("Floyd's Triangle:");
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
                number++;
            }
            System.out.println();
        }
        
    }
}