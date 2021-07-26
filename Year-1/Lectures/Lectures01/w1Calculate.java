package lectures;

public class w1Calculate {
	public static void main(String[] args) {
		//arithmetic operators... +,-,*,/,%
		int x = 10;
		int y = x + 23 * 45;
		int z = y - 4;
		int w = z / 2;
		System.out.println(w + " x is: " + z + " " + y + " " + x);
		System.out.println("mod of 7 % 2: " + 7 % 2);
		System.out.println("division of 7 / 2: " + 7 / 2);		
		
		System.out.println("test type casting...");
		int m = 7;
		int n = 2;
		System.out.println(m / n);
		System.out.println("test type casting with floating number...");
		System.out.println(m / n * 0.1);
		
		System.out.println(7.0 / 2);
		//the unary operators
		System.out.println("the unary operators");
		
		int s=10; //s=s+1
		s++;
		System.out.println(s);
		s--;
		System.out.println(s);
		
		System.out.println("the unary operators again");
		int t =10;
		int h = 10;
		int k = t++;
		int p = ++h;
		System.out.println("t is: " + t);
		System.out.println("k is: " + k);
		System.out.println("p is: " + p);		
		
	}
}
