package Method;

import java.util.Scanner;

public class Method {
	
	public static void displayMenu() {
		
		System.out.println("     MENU");
		System.out.println("1: Convert pounds into kilograms");
		System.out.println("2: Convert hight in inches to centimeters");
		System.out.println("3: Calculate BMI");
		System.out.println("9: EXIT");
	}
	
	public static void calcBMI() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input weight in kilograms: ");
		double weight = sc.nextDouble();
		System.out.print("Input height in meters: ");
		double height = sc.nextDouble();
		double BMI = weight / (height * height);
		System.out.print("Your BMI is " + BMI + "kg/m2");
		
		
	}
	public static void calcHight() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the hieght in inches: ");
		double inch = sc.nextDouble();
		double meters = inch * 0.0254;
		System.out.print(inch + " inch is " + meters + " meters.");
		
		
	}
	public static void calcPounds() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number of pounds: ");
		double pounds = sc.nextDouble();
		double kilograms = pounds * 0.45;
		System.out.print(pounds + " pounds is " + kilograms + " kilograms.");
		
		
	}
	
	
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int selection = 0;
		
		do {
			
		displayMenu();
			
		System.out.println("Enter your selection: ");
		selection = sc.nextInt();
			
		switch (selection) {
		
		case 1 : calcPounds();
				break;
		case 2 : calcHight();
				break;
		case 3 : calcBMI();
				break;
		case 9 : break;
		default: System.out.println("Invalid input");
		 }
		
		
		
		} while (selection != 9);
		
		
	}
	
	
	}


