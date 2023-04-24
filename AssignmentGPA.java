import java.util.Scanner;

public class AssignmentGPA {
	public static void main(String[] args) {
		Scanner scanflt = new Scanner(System.in);
		
		System.out.println("This program will calculate your current GPA.");
		System.out.println("Enter your student ID: ");
		float id = scanflt.nextFloat();
		System.out.println("Enter your class grade in GPA format: ");
		float classgrade = scanflt.nextFloat();
		System.out.println("Enter your current class number of credits; ");
		float currentcredit = scanflt.nextFloat();
		System.out.println("Enter your overall GPA: ");
		float overallGPA = scanflt.nextFloat();
		System.out.println("Enter your overall number of credits: ");
		float overallcredit = scanflt.nextFloat();
		
		float newoverall = ((classgrade * currentcredit) + (overallGPA * overallcredit)) / (currentcredit + overallcredit);
		
		System.out.println("Student: " + id);
		System.out.println("Class grade: " + classgrade);
		System.out.println("Current class credits: " + currentcredit);
		System.out.println("Overall GPA: " + overallGPA);
		System.out.println("Over all number of credits: " + overallcredit);
		System.out.println("/nYour new GPA: " + newoverall);
		
System.out.println("Jacob Biehl CMIS 141 October 29, 2021");
		
		scanflt.close();
	}
	
}
