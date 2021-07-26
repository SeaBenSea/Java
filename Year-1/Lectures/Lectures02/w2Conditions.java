package lectures;

public class w2Conditions {
	public static void main(String[] args) {
		/*
		 // syntax of conditions is:
		  * if(boolean result){
		  }
		 */
		
		int age = 40;
		if (age > 80) {
			System.out.println("Too old");
		}
		else if (age > 45) {
			System.out.println("Middle age");
		}
		else {
			System.out.println("You are young");
		}
		
		//test range of numbers
		int grade = 67;
		if (grade > 100) {
			System.out.println("You can't get more than 100!");
		}
		else if (grade >= 85 ) {
			System.out.println("AA");			
		}
		else if (grade >= 75) {
			System.out.println("BA");
		}
		else if (grade >= 65) {
			System.out.println("CC");
		}
		else if (grade >= 55) {
			System.out.println("DD");
		}
		else {
			System.out.println("FF");
		}
		System.out.println("End of the grading...");
		
		//Test switch-case
		System.out.println("Test switch-case");
		
		int number = 4;
		
		switch (number) {
		case 1: {
			System.out.println("One");
			break;
		}
		case 2: {
			System.out.println("Two");
			break;
		}
		case 3: {
			System.out.println("Three");
			break;
		}
		case 4: {
			System.out.println("Four");
			break;
		}
		case 5: {
			System.out.println("Five");
			break;
		}
		case 6: {
			System.out.println("Six");
			break;
		}
		default:
			System.out.println("Not defined...");
		}
		
		System.out.println("Test ternary operator");
		int w1 = 3;
		int y1 = 5;
		int m1;
		
		m1 = (w1 > y1)? w1 + 10 : y1 + w1 - 100;
		System.out.println("The result is: " + m1);
		
		
		
	}
}
