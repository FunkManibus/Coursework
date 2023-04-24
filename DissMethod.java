
import java.util.Scanner;

public class DissMethod {
	
	public static void displayMenu() {
		System.out.println("     MENU");
		System.out.println("1: Area of a rectangle");
		System.out.println("2: Area of a triangle");
		System.out.println("9: EXIT");
	}
	
	public static void calcArea() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length: ");
		double length = sc.nextDouble();
		System.out.println("Enter width: ");
		double width = sc.nextDouble();
		double Area = length * width;
		System.out.println("The area is " + Area);
		
		
	}
	public static void calcTriangle() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter base length: ");
		double base = sc.nextDouble();
		System.out.println("Enter height: ");
		double height = sc.nextDouble();
		double AreaT = (base * height) / 2;
		System.out.println("The area is " + AreaT);
		
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int selection = 0;
		
		do {
		System.out.println(" ");
		displayMenu();
			
		System.out.println("Enter your selection: ");
		selection = sc.nextInt();
			
		switch (selection) {
		
		case 1 : calcArea();
				break;
		case 2 : calcTriangle();
				break;
		case 9 : break;
		default: System.out.println("Invalid input");
		 }
		
		
		
		} while (selection != 9);
		
		
	}
	
	
	}

