package diss;

import java.util.Scanner;

public class Diss {
	//Opens the scanner input.
	static Scanner input = new Scanner(System.in);
	
		//Creates the additionEquation method and calculates the answer using user input.
	  static double additionEquation(){
	        System.out.println("Enter the first number in the equation: ");
	        double number1 = input.nextDouble();
	        System.out.println("Enter the second number in the equation: ");
	        double number2 = input.nextDouble();
	        return number1+number2;
	    }
	  //Creates the subtractionEquation method and calculates the answer using user input.
	    static double subtractionEquation(){
	        System.out.println("Enter the first number in the equation: ");
	        double number3 = input.nextDouble();
	        System.out.println("Enter the seocnd number in the equation: ");
	        double number4 = input.nextDouble();
	        return number3-number4;
	    }
	    	
	    static double multiplicationEquation() {
	    		System.out.println("Enter the first number in the equation: ");
	            double number5 = input.nextDouble();
	            System.out.println("Enter the seocnd number in the equation: ");
	            double number6 = input.nextDouble();
	            return number5*number6;
	    	}
	//A menu method used to simulate choosing an option in a calculator program.
	static void menu(){
    	//Values are set to 0 before being calculated and returned from the methods.
	    double studentAnswer1 = 0;
        double studentAnswer2 = 0;
        double studentAnswer3 = 0;
        int loopExit = 9;

        	//While loop statement used for the user to select which type of calculator function
        	//they plan to use.
        while (loopExit != 0){
        	System.out.println("Day Jordan // 11/21/2021 // CMIS 141 4060");
        	System.out.println("-----------------------------------------");
            System.out.println("Welcome to the overly complicated calculator program: ");
            System.out.println("1: Complete an addition equation");
            System.out.println("2: Complete a subtraction equation");
            System.out.println("3: Completet a multiplication equation");
            System.out.println("0: Exit Program");
            int menuSelect = input.nextInt();
            //A switch case is used for the menu select to choose between either addition and subtraction.
            //The methods are called back from global and then prints the users answer in the print statement below.
            switch(menuSelect){
                case 1:
                	studentAnswer1 = additionEquation();
                    System.out.println("Your answer to the addition equation is: " + studentAnswer1 + "\n");
                    break;
                case 2:
                    studentAnswer2 = subtractionEquation();
                    System.out.println("Your answer to the subtraction equation is: " + studentAnswer2 + "\n");
                    break;
                case 3:
                	studentAnswer3 = multiplicationEquation();
                	System.out.println("Your answer to the multiplication equating is: " +studentAnswer3 + "\n");
                	break;
                case 0:
                    System.out.println("Thank you for using the overly complicated calculator program!");
                    input.close();
                    loopExit = 0;
            }
        }
	}
	

	public static void main(String[] args) {
		//Begins the menu method as a callback.
		menu();
	}
}