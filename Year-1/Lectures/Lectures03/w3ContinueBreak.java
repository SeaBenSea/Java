package lectures;

public class w3ContinueBreak {
	public static void main(String[] args) {
		
		for (int i = 0; i < 20; i++) {
			System.out.println("i is: " + i);
			if (i >= 10) {
				break;
			}
			
		}
		
		int x = 0;
		while (x < 20) {
			System.out.println("x is: " + x);
			x++;
			if (x > 5) {
				break;
			}
		}
		
		int x1 = 0;
		while (true) {
			System.out.println("x1 is: " + x1);
			x1++;
			if (x1 > 5) {
				break;
			}
		}
		
		//infinite for loop
		int p = 0;
		for (;;) {
			p++;
			System.out.println("p is: " + p);
			if (p > 5) {
				break;
			}
		}
		
		System.out.println("Test continue");
		
		for (int i = 0; i < 10; i++) {
			if (i%2==0) {
				System.out.println("This is even number: " + i);
				continue;
			}
			System.out.println("We can't print even numbers " + i);		
		}
		
		System.out.println("While loop with continue");
		
		int z = 0;
		while (z < 10) {
			if (z % 2 == 0) {
				System.out.println("While: " + z);
				z++;
				continue;
			}//end of the if condition
			System.out.println("While, this is odd number: " + z);
			z++;
		}//end of the while loop
		
	}
}
