package java_fundamentals;
import java.util.Scanner;

public class Array8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        boolean ignore = false;

        for (int i = 0; i < n; i++) {
            if (arr[i] == 6) {
                ignore = true;
            } else if (arr[i] == 7 && ignore) {
                ignore = false;
            } else if (!ignore) {
                sum += arr[i];
            }
        }

        System.out.println("Sum: " + sum);
    }
}

