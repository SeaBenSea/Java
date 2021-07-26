package lectures;

import java.util.Random;

public class w4Calculate3 {
	//loops with function method
	// f(x, n) = x^1 + x^2 + x^3 + ............ x^n, x and n integer
	
	//we solve this three different ways
	public int solution1(int x, int n) {
		
		int total = 0;
		int p = 1;
		for (int i = 1; i <= n ; i++) {//sum of total power
			
			for (int k = 1; k <= i; k++) {//calculates power of x according to "i"
				
				p = p * x;
				
			}
			total = total + p;
			p = 1;//reset p to 1			
		}//end of the sum
		return total;
	}//end of the first solution
	
	//solution 2
	public int solution2(int x, int n) {//best solution
		
		int total = 0;
		int p = 1;
		for (int i = 1; i <= n ; i++) {//sum of total power

			p = p * x;
			total = total + p;
						
		}//end of the sum
		return total;
	}//end of the second solution
	
	//helper method to calculate power f(x,y) = x^y
	
	public int power(int x, int y) {
	//what will happen if y = 0; x == 0, think yourself
		int p = 1;
		for (int i = 1; i <= y; i++) {
			p=p*x;
			
		}
		return p;
	}

	public int solution3(int x, int n) {
		
		int total = 0;
		for (int i = 1; i <= n ; i++) {//sum of total power
			total = total + power(x, i); //call the power		
		}//end of the sum
		return total;
	}//end of the third solution
	
	/*
	 shape(3, "*")
	 *
	 **
	 ***
	 */
	
	public void shape(int n, String sign) {
		int i = 0;
		while (i < n) {
			for (int j = 0; j <= i; j++) {
				System.out.print(sign + " ");				
			}//end of the inner loop for prints signs next to each other
			System.out.println();//move to next line
			i++;			
		}
	}
	
	//write a method that calculates sum of 10 even random numbers that less than 50
	//n = 10, m = 50
	
	public int randomsum(int n, int m) {
		int total = 0;
		int i = 0;
		Random ran = new Random();//create the "ran" object	
		while (i < n) {//counts odd even numbers
			int number = ran.nextInt(m);//create random number less than "m=50"
			if (number % 2 == 0) {//even number
				total += number;//total = total + number;
				i++;
				System.out.println("The random number is: " + number);
			}
		}//end of the while loop
		return total;
	}
	
	
	//main method	
	public static void main(String[] args) {
		w4Calculate3 test = new w4Calculate3();
		System.out.println(test.solution1(2, 2));
		System.out.println(test.solution1(10, 20));
		
		System.out.println("Test second solution.");
		System.out.println(test.solution2(2, 2));
		System.out.println(test.solution2(10, 20));
		
		System.out.println("Test second solution.");
		System.out.println(test.solution3(2, 2));
		System.out.println(test.solution3(10, 20));
		
		System.out.println("Test the shapes...");
		test.shape(3, "*");
		test.shape(10, "#");
		test.shape(10, "5");
		
		System.out.println("Test the randomsum");
		test.randomsum(5, 50);
	}
}
