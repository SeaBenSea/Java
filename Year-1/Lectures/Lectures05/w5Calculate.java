package lectures;

public class w5Calculate {
	public int n;
	public final double m = 2.5;
	int total;
	
	public w5Calculate() {
		n=10;
	}
	
	public int sum(int x, int y, int n) {
		return x + y + n + this.n;
	}
	
	public int sub(int x, int y){
		return x - y - n;
	}
	
	public int total(int x, int y, int n) {
		return sum(x, y, n) + sub(x, y);
	}
	
	public int mul(int w, int z) {
		return w * z + n;
	}
	
	public void numbers(int w, int z) {
		w = 10;
		for (int i = w; i <= z ;i++) {
			System.out.println(i);			
		}
	}
	
	public double average(int k) {
		//int basket = 0;
		while (k > 0) {
			//basket = basket + k;
			total = total + k;
			k--;
		}
		//return basket;
		return total;
	}
	
	//overloaded methods
	
	public int add(int a, int b) {
		return a + b;
	}
	
	public int add(int a, int b, int c) {
		return a + b + c;
	}
}
