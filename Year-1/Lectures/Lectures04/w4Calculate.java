package lectures;


public class w4Calculate {
	
	/*
	 Syntax of java methods...
	 Modifier: public, default, private, protected
	 	structure of a java method is:
	 	
	 	modifier data-type name_of_method( parameters ) {
	 		//body of the method
	 	}
	 
	 
	 Functions
	 sum(x, y) = x + y, x, y integer numbers
	 
	 */
	
	
	//main method
	public static void main(String[] args) {
		System.out.println("Test class");
		//how do we access class member methods
		//First we create an object from the "w4Calculate"
		w4Calculate cal = new w4Calculate(); //now we have the "cal" object, "w4Calculate"
		int result = cal.sum(3, 5);
		System.out.println("Result is: " + result);
		
		cal.showResult(3, 5);
		
		// int result2 = cal.showResult(3, 5); // int <---- void this line is wrong, not logic
		
		//we can use typed method as a variable
		
		int total = 100 + cal.sum(200, 300);
		System.out.println("Total sum is: " + total);
		
		System.out.println("Test the sum method again: " + cal.sum(1000, 3000));
		
		//System.out.println(cal.showResult(3000, 4000);); // again wrong, void, can't be printed out
		
	}//end of the main method
	
	//the sum method
	public int sum(int x, int y) {
		
		return x + y;
	}//end of the sum method
	
	//display result
	public void showResult(int a, int b) {
		int p = a + b;
		System.out.println("The result is: " + p + " with the void method.");
	}
	
}//end of the class
