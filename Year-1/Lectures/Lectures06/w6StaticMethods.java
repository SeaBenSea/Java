package lectures;

public class w6StaticMethods {
	
	private int mynumber = 0;
	
	
	
	public static void hello() {
		System.out.println("Hello");
	}
	
	public static int sum(int m, int n) {
		int total = 0;
		for (int i = m; i <= n; i++) {
			total+=i;
		}
		return total;
	}
	
	public static int myBignumber(int n, int m) {
		return(n>m)? n:m;
	}
}
