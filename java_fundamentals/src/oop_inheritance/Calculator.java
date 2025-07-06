package oop_inheritance;
import java.util.Scanner;

public class Calculator {

    public static int powerInt(int num1, int num2) {
        return (int) Math.pow(num1, num2);
    }

    public static double powerDouble(double num1, double num2) {
        return Math.pow(num1, num2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two integers (base and exponent): ");
        int intBase = sc.nextInt();
        int intExp = sc.nextInt();
        int intResult = Calculator.powerInt(intBase, intExp);
        System.out.println("Result of powerInt: " + intResult);

        System.out.print("Enter two doubles (base and exponent): ");
        double doubleBase = sc.nextDouble();
        double doubleExp = sc.nextDouble();
        double doubleResult = Calculator.powerDouble(doubleBase, doubleExp);
        System.out.println("Result of powerDouble: " + doubleResult);

        sc.close();
    }
}
