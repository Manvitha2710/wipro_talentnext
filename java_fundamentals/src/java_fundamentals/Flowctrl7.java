package java_fundamentals;
import java.util.Scanner;

public class Flowctrl7{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter gender (Male/Female): ");
        String gender = sc.nextLine();
        
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        
        double interestRate = 0.0;

        if (gender.equalsIgnoreCase("Female")) {
            if (age >= 1 && age <= 58) {
                interestRate = 8.2;
            } else if (age >= 59 && age <= 100) {
                interestRate = 9.2;
            }
        } else if (gender.equalsIgnoreCase("Male")) {
            if (age >= 1 && age <= 58) {
                interestRate = 8.4;
            } else if (age >= 59 && age <= 100) {
                interestRate = 10.5;
            }
        } else {
            System.out.println("Invalid gender entered.");
           
            return;
        }
      
        System.out.printf("The percentage of interest is %.1f%%.\n", interestRate);
       
    }
}
