package worksheets;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class w11ws1 {

	public int mul(int a, int b) throws MyExceptionClass{//multiplication method 
		if (a == 0 || b == 0) throw new MyExceptionClass("One of variable is 0");//exception for any variable is 0
		return a * b;
	}
	
	public int sum(int a, int b) throws MyExceptionClass {//sum method
		if (a < 0 || b < 0) throw new MyExceptionClass("One of variable is less than 0");//exception for any variable is less than 0
		return a + b;
	}
	
	public int sub(int a, int b) throws MyExceptionClass {//sub method
		if (a < 0 || b < 0) throw new MyExceptionClass("One of variable is less than 0");//exception for any variable is less than 0
		return a - b;
	}
	
	public int divide(int a, int b) throws MyExceptionClass {//divide method
		if (b == 0) throw new MyExceptionClass("b is zero so its undefined");//exception for b variable is 0
		return a / b;
	}
	
	public int divide2(int a, int b) throws MyExceptionClass {//divide2 method
		if (a == 0) throw new MyExceptionClass("a is zero so its undefined");//exception for a variable is 0
		return b/a;
	}
	
	public void writeData() throws IOException {
		File file = new File("bilgi.txt");
		try {
			PrintWriter writer = new PrintWriter(file);
			writer.write("Istanbul ");
			writer.flush();
			writer.close();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
