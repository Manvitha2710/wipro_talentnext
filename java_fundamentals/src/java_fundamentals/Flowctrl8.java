package java_fundamentals;
import java.util.Scanner;
public class Flowctrl8 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	        
	        System.out.print("Enter a character: ");
	        char inputChar = sc.next().charAt(0);
	       
	        if (Character.isLowerCase(inputChar)) {
	            char outputChar = Character.toUpperCase(inputChar);
	            System.out.printf("Input: %c, Output: %c\n", inputChar, outputChar);
	        } else if (Character.isUpperCase(inputChar)) {
	            char outputChar = Character.toLowerCase(inputChar);
	            System.out.printf("Input: %c, Output: %c\n", inputChar, outputChar);
	        } else {
	            System.out.println("Invalid input. Please enter an alphabetic character.");
	        }
	        
	    }
	}
