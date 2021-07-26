package lectures;

public class w11ConditionalExceptions {
	
	public static void main(String[] args) {
		
		int a = 40;
		int b = 30;
		int c = 20;
		
		try {
			if (a < 5) throw new Exception("a is less than 5");
			else if (b < 5) throw new Exception("b is less than 10");
			else if (c > 5) throw new w11MyException("My Exception is working, c is greater than 5");
			else {
				int sum = a + b;
				System.out.println("sum is: " + sum);
			}
		}
		catch (w11MyException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
		System.out.println("This is the end of the program.");
	}
}
