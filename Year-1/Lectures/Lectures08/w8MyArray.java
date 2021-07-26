package lectures;

public class w8MyArray {
	public static void main(String[] args) {
		
		int b;
		b = 45;
		int c = 10;
		
		int a[];
		a = new int [5]; //size of the array is 5
		double d[] = new double[5];//index [0, size-1], integer and positive
		
		boolean []e = new boolean [4];
		
		a[0] = 10;
		a[1] = 34;
		a[3] = 4 + 5;
		a[4] = a[0] + a[2];
		a[2] = 10 - a[4];
		
		System.out.println(a[4]);
		System.out.println(d[1]);
		System.out.println(e[2]);
		String names[] = new String[3];
		System.out.println(names[1]);
		System.out.println(a[2]);
		
		//we define arrays with default values
		
		int k[] = {1, 24, -4, -6, 5};
		System.out.println(k[2]);
		boolean myFlag[] = {true, false, false, true, true};
		System.out.println(myFlag.length);
		System.out.println(e.length);
		
		System.out.println("Elements of a are: ");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);			
		}
		
		System.out.println("Elements of k in reverse order: ");
		for (int i = k.length - 1; i >= 0; i--) {
			System.out.println(k[i]);			
		}
		
		
		
	}
	
}
