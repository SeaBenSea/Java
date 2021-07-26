package lectures;

public class w4Calculate2 {
	
	public int add(int a, int b) {
		return a+b;
	}
	
	//write a method calculates sum of four integer numbers
	
	public int sumOfFour(int x, int y, int z, int w) {
		return x + y + z + w;
	}
	
	//second version of the solution
	public int sumOfFour2(int x, int y, int z, int w) {
		return add(x, y) + add(z, w); //we have used methods that defined before
	}
	
	public void show(int a, int b, int c, int d) {
		System.out.println("This is void method: " + sumOfFour2(a, b, c, d));
	}
	
	public boolean isGreater(int x, int y) {
		if (x > y) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean isGreater2(int x, int y) {
		return x > y;
	}
	
	public double average(int x, int y, int m, int p) {
		if (isGreater(x, y)) {
			return (x + y + m) / 3.0;
		}
		else {
			return (x + y + m + p) / 4.0;
		}
	}
	
	
	public static void main(String[] args) {
		w4Calculate2 cal = new w4Calculate2(); //create object
		System.out.println(cal.sumOfFour(1, 2, 3, 4));
		System.out.println("Test 2: " + cal.sumOfFour2(1, 2, 3, 4));
		cal.show(1, 2, 3, 4);
		
		System.out.println("Test boolean " + cal.isGreater2(2, 4));
		System.out.println("Test boolean " + cal.isGreater2(12, 4));
		
		System.out.println("Test the average: " + cal.average(10, 20, 30, 40));
		
		//call the number method
		
		cal.numbers(1, 5);
		System.out.println("Test again the number method with 10, 20");
		cal.numbers(10, 20);
		
		System.out.println("Test the average method");
		System.out.println(cal.average(1, 10));
	}// end of the main method
	
	//write a method it takes m and n as parameters (m < n), and print out all numbers between them[m,n]
	
	public void numbers(int m, int n) {
		for (int i = m; i <= n ; i++) {
			System.out.println("numbers: " + i);
			
		}
	}
	
	//write a method calculates average of all odd numbers [m,n] between m and n (m < n, int)
	
	public double average(int m, int n) {
		double sum = 0.0;
		int i = m;
		int counter = 0;
		while (i <= n) {//test if the "i" is odd number
			if (i%2 == 1) {
				sum = sum + i;
				counter++;
				System.out.println("The odd number is: " + i);
			}
			i++;
		}//end of the while loop
		return sum / counter;
	}
	
}
