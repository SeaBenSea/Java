//Deniz Günenç 120200078
package HomeWorks;

import java.lang.Math;
import java.util.Scanner;

public class HomeWork1 {
	public static void main(String[] args) {
		HomeWork1 func = new HomeWork1();//create object
		
		//Part 1
		
		System.out.println("Part1: " + func.part1(14));
		
		//Part 2
		System.out.println("Part2: " + func.part2());
		
		
		//Part 3
		System.out.println("Part3: " + func.part3());
	}
	
	//Part 1 function
	public int part1(int x) {
		int total = 0;//creating a total value for return
		if (x == -1) {//f(-1)=0
			return 0;
		}
		else if (x == 0) {//f(0)=0
			return 0;
		}
		else {//else part
			for (int k = 1; k <= x; k++) {//until k equal or less to x the loop continues so it sum up the results
				total = total + (part1(k-1) + ((int)Math.pow(-1, k) * part1(k-2)) + x);//the function for given variable x and k				
			}
			return total;//returning to the total value of sums
		}
	}
	
	//Part 2 function
	
	public double part2() {
		double x1;
		double n;
		long iteration;
		double result = 0;//creating a result value for return
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter x1: ");
		x1 = input.nextDouble();//user input x1
		System.out.println("Please enter n: ");
		n = input.nextDouble();//user input n
		System.out.println("Please enter number of iteration: ");
		iteration = input.nextLong();//user input number of iteration
		for (int i = 0; i < iteration; i++) {//loop for decide the how many times run the Newton's algorithm

			result = x1 - ( (Math.pow(x1, 3) - n) / (3 * Math.pow(x1, 2)));//Newton's Algorithm
			x1 = result;//for the loop defining new x1 to last result
			
		}
		return result;//returning the result value
	}
	
	//Part 3 function	
	
	public int part3() {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter x: ");
		int x = input.nextInt();//user input x
		int total = 0;//creating a total value for return
		if (x <= 0) {//if the number less or equal than 0 the number don't have any factors so it gives 0
			return 0;
		} 
		else {//if the number greater than 0
			for (int i = 1; i <= x; i++) {//loop until the divider equal to the given number
				if (x % i == 0) {//checking the remaining and if it is 0 taking the divider
					total = total + i;//sum up the factors
				}
			}
		}
		return total;//returning the total value
	}
}
