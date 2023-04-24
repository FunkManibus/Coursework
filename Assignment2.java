package Assignment2;
import java.util.Scanner;
public class Assignment2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double number1;
		double number2;
		char symbol;
		double number3; // Creates the variables needed. //
		
		System.out.println("Enter a number: "); // Asks user for number1. //
		number1 = sc.nextDouble();
		System.out.println("Enter another number: "); // Asks user for number2. //
		number2 = sc.nextDouble();
		System.out.println("Enter your operation symbol: "); // Asks user for symbol. //
		symbol = sc.next().charAt(0);
		
		if (symbol == '+') {
			number3 = number1 + number2;
		System.out.println("The characters entered where: " +number1+ " " +symbol+ " " +number2);
		System.out.println("The result is: " +number3);
		} // If statement that calculates the equation based on the symbol provided. //
		
		else if (symbol == '-') {
			number3 = number1 - number2;
		System.out.println("The characters entered where: " +number1+ " " +symbol+ " " +number2);
		System.out.println("The result is: " +number3);		
		} // If statement that calculates the equation based on the symbol provided. //
		
		else if (symbol == '*') {
			number3 = number1 * number2;
		System.out.println("The characters entered where: " +number1+ " " +symbol+ " " +number2);
		System.out.println("The result is: " +number3);
		} // If statement that calculates the equation based on the symbol provided. //
		
		else if (symbol == '/') {
			number3 = number1 / number2;
		System.out.println("The characters entered where: " +number1+ " " +symbol+ " " +number2);
		System.out.println("The result is: " +number3);
		} // If statement that calculates the equation based on the symbol provided. //
		
		else {
			System.out.println("The symbol you entered is not valid.");
		} // Statement to tell user the error message. //
		
		System.out.println("Jacob Biehl CMIS 141 October 29, 2021");
		sc.close();
		
		
	}

}
