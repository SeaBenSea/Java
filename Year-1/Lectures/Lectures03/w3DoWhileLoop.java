package lectures;

public class w3DoWhileLoop {
	public static void main(String[] args) {
		
		int i = 10;
		while (i < 10) {
			System.out.println("Hello while loop " + i);
			i--;
		}
		System.out.println("End of the while loop");
		
		int x = 10;
		do {
			System.out.println("Hello do-while loop " + x);
			x++;
		} while (x<15);
		
		System.out.println("End of the do-while loop");
	}
}
