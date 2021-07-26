package lectures;

public class w11MethodThrowExceptions {
	
	public int mul(int a, int b) throws w11MyException{
		if (a == 0 || b == 0) throw new w11MyException("One of variable is zero");
		return a * b;
	}
	
	public int sum(int a, int b) {
		return a + b;
	}
	
	
	public void callMul(int a, int b) throws w11MyException {
		
		System.out.println(mul(a, b));
	}
	
	public void callMul2(int a, int b){
		try {
			System.out.println(mul(a, b));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	public static void main(String[] args) {
		w11MethodThrowExceptions m = new w11MethodThrowExceptions();
		System.out.println(m.sum(20, 30));
		
		try {
			System.out.println(m.mul(0, 4));
		} catch (w11MyException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Test again");
		
		try {
			m.callMul(0, 4);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		m.callMul2(0, 6);
		
		System.out.println("End of the main method.");
	}
}
