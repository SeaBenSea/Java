//Deniz Günenç 120200078
package worksheets;

import java.util.Random;
import java.util.Scanner;


public class w8ws1 {
//Part 1
/*
 * When the static variables created they are going to be share in all objects at a class level.
 * All the instances of the class will share the same static variable.
 * You can use the static methods without creating a new object in mains.
 * In static methods you can only access the a-other static variables. You can't acces non static variables.
 */

//Part 2
static int counter = 1;//static counter

	public static void main(String[] args) {
		
		
		Random rand = new Random();//Random class for random integers
		int randomnumber = rand.nextInt(10);//Creating random number between [0,9]
		Scanner scan = new Scanner(System.in);//Scanner class for getting inputs
		System.out.println("Please enter a number: ");
		int usernumber = scan.nextInt();//Getting number from user.

		
		while (usernumber != randomnumber) {
			System.out.println("Please enter a number: ");
			usernumber = scan.nextInt();//Getting number from user.
			counter++;//Increase the counter if the user input and random number is not equal.
		}
		System.out.println(counter);//Printing static counter.
		
		//Part 3
		System.out.println(parser("3.1421314"));//Testing parser method.
		
		
	}
	
	public static double parser(String x) {//Part 3 method
		Double k = new Double(x);//Converting string to double with using wrappers.
		return Double.parseDouble(x);
	}
	
}
