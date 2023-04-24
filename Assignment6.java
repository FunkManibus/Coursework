import java.util.Scanner;

public class Assignment6 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int highScore = 0;
		String highScoreName = "";
		
		int lowScore = 100;
		String lowScoreName = "";
	
		System.out.print("How many students do you want to enter: ");
		int numberOfStudents = input.nextInt();

		System.out.println("Enter each student’s name and score");
		for (int i = 0; i < numberOfStudents; i++) {
			System.out.print("Student: " + (i + 1) +"\nEnter student's name: ");
			String name = input.next();
			
			System.out.print("Enter student's score: ");
			int score = input.nextInt();
			
			if (score > highScore) {
				highScore = score;
				highScoreName = name;
				}
			if (score < lowScore) {
				lowScore = score;
				lowScoreName = name;
				}


			
			}
		
		System.out.println("Student with the lowest score: " + lowScoreName + " " + lowScore);
		System.out.println("Student with the highest score: " + highScoreName + " " + highScore);
	}
}
