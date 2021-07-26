package lectures;

public class w3NestedLoops {
	public static void main(String[] args) {
		//System.out.println("**********");
		
		
		for (int j = 0; j < 3; j++) {
			
			for (int i = 0; i < 10; i++) {
				System.out.print("*");
				
			}		
			System.out.println();
			
		}
		
		System.out.println("Test while loop");
		int x = 0;
		int y = 0;
		while (x<4) {
			while (y< 15) {
				System.out.print("*");
				y++;
			}
			System.out.println();
			x++;
			y = 0;
		}
		
		/*
		 * 1
		 * 12
		 * 123
		 * 1234
		 * 12345
		 */
		
		for (int d = 0; d <= 5; d++) {
			for (int i = 1; i <= d; i++) {
				System.out.print(i);				
			}
			System.out.println();//move to next line			
		}
		
		/*
		 * 54321
		 * 5432
		 * 543
		 * 54
		 * 5
		 */
		
		for (int d = 5; d >= 1; d--) {
			for (int i = 5; i >= d; i--) {
				System.out.print(i);				
			}
			System.out.println();//move to next line			
		}
	}
}
