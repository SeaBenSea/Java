//Deniz Günenç 120200078
package worksheets;

import java.util.Scanner;
import java.lang.Math;

public class w5ws1 {
	public static void main(String[] args) {
		w5ws1 func = new w5ws1();//create object
		
		//Part 1
		System.out.println(func.binomial(5, 2));
		//Part 2
		System.out.println(func.operation());
		//Part 3
		System.out.println(func.isinside(4.00001, 0, 4));
	}
	
	public int factorial(int number) {//Factorial function for Part 1
		if (number == 0) {//If the number equals 0 it gives 1
			return 1;
		}
		else {
			return (number * factorial(number - 1));//Loop for factorial function
		}
	}
	
	public int binomial(int x, int y) {//Part 1 binomial expression
		if (x > y) {//check which number is greater if x is greater than y
			return factorial(x)/factorial(x - y);//Binomial formula
		}
		else {//if y is greater than x
			return factorial(y)/factorial(y - x);//Binomial formula
		}
	}
	
	public double operation() {
		Scanner input = new Scanner(System.in);// "System.in" console input
		
		System.out.println("Please enter first number");
		double x = input.nextDouble();//User input number1
		
		System.out.println("Please enter second number");
		double y = input.nextDouble();//User input number2
		
		System.out.println("Please enter operation");
		String character = input.next();//User input operation
		
		if (character.equals("+")) {//If operation is +
			return x + y;
		}
		else if (character.equals("*")) {//If operation is *
			return x * y;
		}
		else if (character.equals("/")) {//If operation is /
			return x / y;
		}
		else if (character.equals("-")) {//If operation is -
			return x - y;
		}
		else {//If operation is %
			return x % y;
		}
		
	}
	
	public boolean isinside(double x, double y, double r) {//Part 3 function
		if (Math.sqrt((Math.pow(x, 2) + Math.pow(y, 2))) <= r) {//checking is the point inside of the circle or not (x^2 + y^2)^(1/2) if this is equal or lower than radius the point is inside of the circle
			return true;//inside of the circle
		}
		return false;//outside of the circle
	}
}
