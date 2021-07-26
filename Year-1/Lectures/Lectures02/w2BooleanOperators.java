package lectures;


public class w2BooleanOperators {
	public static void main(String[] args) {
		//Boolean operators: >, >=, <, <=, ==, !=
		
		int x = 10;
		int p = 5;
		System.out.println(x > p);
		System.out.println(x < p);
		System.out.println(x < p + 100);
		System.out.println(x < p - 100);
		System.out.println(10 + x < p + 100);
		
		System.out.println("Test boolean");
		System.out.println(x <= p);
		System.out.println(100 != 200);
		
		boolean result = p > x;
		System.out.println("The result is: " + result);
		
		boolean x2 = p > 200;
		boolean x3 = 23 > 3.4;
		System.out.println("The last test is: " + x3);
		
		//Logical operators...: and(&&), or(||), not(!)
		int z = 68;
		boolean range = z >= 50 && z <= 80;
		System.out.println("Range is: " + range);
		/*
		 l = true && r = true = true
		 l = true && r = false = false
		 l = false && r = true = false
		 l = false && r = false = false
		 */
		
		System.out.println("Test the or operator");
		int t = 68;
		boolean range2 = t >= 50 || t <= 80;
		System.out.println("Range is: " + range2);
		/*
		 l = true || r = true = true
		 l = true || r = false = true
		 l = false ||r = true = true
		 l = false || r = false = false
		 */
		
		int m = 3;
		int n = 5;
		int k = 4;
		
		boolean zz = k == n || k == m;
		System.out.println("The last result is: " + zz);
		
		System.out.println("The not operator...");
		boolean zzz = false;
		System.out.println("The last result is: " + !zzz);
		
		//find the minimum number among three numbers...
		
		int g = 3;
		int h = 100;
		int w = -100;
		
		if (g < h && g < w) {
			System.out.println("Minumum number is: " + g);			
		}
		else if (h < g && h < w) {
			System.out.println("Minumum number is: " + h);	
		}
		else if (w < g && w < h) {
			System.out.println("Minumum number is: " + w);	
		}
		
	}
}
