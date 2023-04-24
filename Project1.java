import java.util.Arrays;
public class Project1{

	   // Jacob Biehl | Jan. 23, 2022 | program is uses to find the minimum, maximum, and average of 3 weights
	   public static void main(String args[]){

		   double weight[] = new double[]{50.5, 67.2, 30.9}; // Array of the weights
		   double length = weight.length;
		   double min = findMinimum(weight);
		   double max = findMaximum(weight);
		   double average = findAverage(weight);

	           System.out.println("Minimum Weight:  " + min); // Prints the min, max, average
	           System.out.println("Maximum Weight: " + max);
	           System.out.println("Average Weight: " + average);
	   }
    
   private static double findMinimum(double weight[]){

		double min = weight[0]; // initializing the min
	    for (double i = 1; i < weight.length; i++){ // calculates the minimum
	      if (weight[(int) i] < min){ 
	        min = weight[(int) i]; 
	      } 
	    } 
	    return min; 
	  }
   
   private static double findMaximum(double weight[]){
	   
	   double max = weight[0]; // initializing the max
	   for (double i = 1; i < weight.length; i++) { // calculates the max
		   if (weight[(int) i] > max) {
			   max = weight[(int) i];
			   }
	   }
	   return max;
   }
   
   private static double findAverage(double weight[]){

	   double sum = Arrays.stream(weight).sum(); // adds the values of the array
	   double average = sum / 3; // calculate average using a know array length of 3
	   
	   return average;
   }
}

