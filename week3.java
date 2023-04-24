package week3;

import java.util.Scanner;

public class week3 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("What is the tempurature outside?");
		int temp = scan.nextInt();
		if (temp <= 31) {
			System.out.println("You might want to bundle up, it's cold outside.");
		}
		else if (temp >= 32 && temp <= 50) {
			System.out.println("A jacket should be enough.");
		}
		else if (temp >= 51 && temp <= 75) {
			System.out.println("It's nice out, wear some shorts.");
		}
		else {
			System.out.println("It's really hot out, drink some water.");
		}
		
		System.out.println("Jacob Biehl November 5, 2021 CMIS 141");
		
		scan.close();
		
		}
	}	


