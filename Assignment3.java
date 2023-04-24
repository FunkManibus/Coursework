import java.util.Scanner;

public class Assignment3 {

public static void main(String[] args) {

    String Student; String Cont;
    double A1 = 0; double A2 = 0; double Ex = 0; double P = 0; double Final = 0;
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Welcome to the grade calculation program.");
    System.out.println("Do you want to enter student's data? Yes/No ");
    Cont = sc.nextLine(); 
    
    switch (Cont) {
   
    case "yes": 

	   System.out.println("Enter student's Name: ");
	   Student = sc.nextLine();
	   
	   System.out.println("Enter student's grades seperated by space: A1 A2 Ex P ");
	   A1 = sc.nextDouble(); 
	   A2 = sc.nextDouble(); 
	   Ex = sc.nextDouble(); 
	   P = sc.nextDouble();
   
	   Final = A1*0.25+A2*0.25+Ex*0.4+P*0.1;
   
	   System.out.println("Student name: " + Student);
	   System.out.println("A1 = " + A1 + " A2 = " + A2 + " Ex = " + Ex + " P = " + P);
	   System.out.println("Final course grade: " + Final);
    
    
default: 
		System.out.println("Thank you for using the grade calculation program.");
		


	   sc.close();
	   System.out.println("---------------------------");
	   System.out.println("Jacob Biehl | CMIS 141 4060");
    }   
  }}