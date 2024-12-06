/*
 Hazhel CJ B. MAtingyad 
 CITCS 1N - A
 */
package hazhel_tr;
import java.util.Scanner;
public class Challenge_no_2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double average = 0;
		final int DAYS = 7;
		final int CITIES = 3;
		
		//use of two dimensional array to store the inputs of the user
		double [][] temperatures = new double [CITIES] [DAYS];
		
		//collect temperatures per cities from the user
		for(int city = 0; city < CITIES; city++) {
			System.out.println("Enter the temperatures for CITY " + (city + 1) + " for 7 days");
			for(int day = 0; day < DAYS; day++) {
				System.out.print("Day " + (day + 1) + ":");
				temperatures [city] [day] = input.nextDouble();
			}
			System.out.println();
		}
		
		// to see for the highest temperature by city
		for (int city = 0; city < CITIES; city++) {
			double sum = 0; // reset sum for each city
			double highest = temperatures [city][0]; //assume the first day as the highest
			
			for (int day = 0; day < DAYS; day++) {
				sum += temperatures[city][day];
				if (temperatures [city][day] > highest) {
					highest = temperatures [city] [day]; //to update the highest the temperature
				}
			}
			
			// calculate the average for the current city
			average = sum / DAYS;
			
			//displays the average and highest per city
			System.out.println("CITY " + (city + 1) + ": " ); 
			System.out.println("Average: " + average);
			System.out.println("Highest temperature: " + highest + "°C");
			System.out.println();
			
		}
		
		input.close();

	}

}
