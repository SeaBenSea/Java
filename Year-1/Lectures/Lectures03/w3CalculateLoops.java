package lectures;

import java.util.Random;

public class w3CalculateLoops {
	public static void main(String[] args) {
		//Calculate sum of all odd numbers between 1 and 10 [1,10]
		
		int sum = 0;
		int sumodd = 0;
		for (int i = 1; i <= 10; i++) {
			sum = sum + i;	
			if (i%2==1) {
				sumodd = sumodd + i;
			}
		}
		System.out.println("Total is: " + sum);
		System.out.println("Sum of odd numbers is: " + sumodd);
		
		System.out.println("Example for while loop");
		//Create 10 random numbers between 0 and 100, with using the "while" loop
		Random ran = new Random(); //define random object
		int count = 0;
		while (count < 10) {
			int number = ran.nextInt(100); //How do you get numbers between [34,90]
			System.out.println("Random number is: " + number);
			count++;
		}
		//Create 10 random numbers between 0 and 100, with using the "while" loop
		count = 0;
		int cycles = 0;
		while (count < 10) {
			int number = ran.nextInt(100); 
			if (number % 2 == 0) {
				System.out.println("Random number is: " + number);
				count++;
			}
			cycles++;
		}
		System.out.println("Total run is: " + cycles);
		
	}
}
