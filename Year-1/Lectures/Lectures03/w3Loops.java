package lectures;

public class w3Loops {
	public static void main(String[] args) {
		/*
		 * System.out.println("Hello");
		 * System.out.println("Hello");
		 * System.out.println("Hello");
		 * System.out.println("Hello");
		 */
		
		int i;
		int k = 0;
		for (i = 0; i < 6; i++) {
			System.out.println("My loops: " + i);
			k = i * i;
			System.out.println("My data: " + k);
		}
		System.out.println("The last value of i is: " + i);
		System.out.println("K is: " + k);
		
		//print numbers between 10 and 1 in decreasing order
		
		for (int p = 10; p > 0; p = --p){
			System.out.println("p is: " + p);
			
		}
		
		for (int j = 2, p2 = 100, s = 0; j < 100 && p2 > 90; j = j + 10, p2 = p2 - 5) {
			System.out.println("j is: " + j + p2);
			s = s + p2 + j;
			System.out.println("s is: " + s);
		}
		
		int w = 0;
		for (i = 0; i < 20; i++) {
			w= w + i;
			i = i + 3;//not suggested to change loop variable in the loop body
			
		}
		System.out.println("w is: " + w);
		
		
	}
}
