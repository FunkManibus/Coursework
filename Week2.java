import java.util.Scanner;

public class Week2 {
	
	public static void main(String[] args) {
		Scanner scanflt = new Scanner(System.in);
		
		System.out.println("This program will find the cost of fuel for a trip.");
		System.out.println("Enter the amount of miles driven: ");
		float miles = scanflt.nextFloat();
		System.out.println("Enter your vehicles mpg: ");
		float mpg = scanflt.nextFloat();
		System.out.println("Enter the price of fuel per gallon: ");
		float price = scanflt.nextFloat();
		
		float gascost = (miles / mpg) * price;
		
		System.out.println("The total cost for gas will be: $" + gascost);
		
		System.out.println("Jacob Biehl CMIS 141 October 29, 2021");
		
		scanflt.close();
	}

}
