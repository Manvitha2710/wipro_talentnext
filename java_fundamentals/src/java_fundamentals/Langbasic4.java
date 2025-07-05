package java_fundamentals;
import java.util.Scanner;
public class Langbasic4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first no: ");
		int num1 = sc.nextInt();
		System.out.println("Enter second no: ");
		int num2 = sc.nextInt();
		int sum = num1 + num2;
		System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum);
		
	}

}
