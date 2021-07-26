//Deniz Günenç 120200078
package worksheets;

import java.util.Random;
import java.util.Scanner;

public class w4ws1 {
	public static void main(String[] args) {
		
		//Part 1
		Random rand = new Random(); //define random object
		int notails = 0; //number of tails
		int notoss = 1; //counter
		while (notoss < 101) {
			int coin = rand.nextInt(2);
			if (coin == 0) { //if number equals 0 it means the coin is tails
				System.out.println(notoss + ") Tails");//printing the coin
				notails++; //increasing value of number of tails because the coin is tails
			}
			else {//else it means the coin is heads
				System.out.println(notoss + ") Heads");//printing the coin
			}
			notoss++;//increasing the counter
		}
		System.out.println("Number of tails: " + notails); //printing number of tails
		
		//Part 2
		int nostar = 5;//number of star
		for (int d = 0; d <= nostar; d++) {//loop for lines
			for (int s = nostar; s > d; s--) {//loop for spaces
				System.out.print("  ");
					
			}
			for (int l = 0; l < d; l++) {//loop for stars
				System.out.print(" *");
			}
		System.out.println();//move to next line			
		}
		
		
		//Part 3
		int number1;
		int counter = 1;
		Scanner inputs = new Scanner(System.in); // "System.in" console input
		number1 = inputs.nextInt();//getting integer number1 from user
		int mult = number1;//for defining the result of multiplication
		if (number1 == 0) {//if the number equals 0 the loop will be infinite so we need to check it
			System.out.println("Infinite loop. The answer always: " + (number1));
		}		
		else {
			while ((mult) < 256) {//checking is result over the 256 or not
				
				System.out.print("Please enter new number: ");
				int number2 = inputs.nextInt();//getting integer number2 from user
				if (number2 == 0) {//if the next number is 0 the result is going to 0 forever
					System.out.println("Infinite loop. The answer always: 0");
					System.out.print("Please enter new number: ");
					number2 = inputs.nextInt();//getting integer number2 from user
				}
				else {
					mult = mult * number2;//result
					System.out.println(counter + ") " + mult);
					counter++;
				}				
			}
		}
	}
}
