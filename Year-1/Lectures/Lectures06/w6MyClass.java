package lectures;

public class w6MyClass {
	private int k;
	private static int n;
	
	public w6MyClass() {
		k=10;
		n=20;//static
	}
	
	public w6MyClass(int k, int n) {
		this.k=k;
		this.n=n;//static
	}
	
	public static void main(String[] args) {
		w6MyClass m1 = new w6MyClass();
		int s = m1.k + m1.n;
		System.out.println("result of the m1 obj: " + s);
		
		w6MyClass m2 = new w6MyClass(5, 5);
		int p = m2.n + m2.k;
		System.out.println("result of m2: " + p);
		
		s = m1.k + m1.n;//I am still using the m1 (old) object
		System.out.println("result of the m1 obj: " + s);
		
		m1.n=100;//access with object name
		p = m2.n + m2.k;
		System.out.println("result of m2: " + p);
		
		w6MyClass.n=1000;//access with class name, prefer option
		
		p = m2.n + m2.k;
		System.out.println("result of m2: " + p);
		
		s = m1.k + m1.n;
		System.out.println("result of the m1 obj: " + s);

		n=5000;//access directly
		
		p = m2.n + m2.k;
		System.out.println("result of m2: " + p);
		
		s = m1.k + m1.n;
		System.out.println("result of the m1 obj: " + s);		
		//k=100 not allowed not a static
	
	}
}
