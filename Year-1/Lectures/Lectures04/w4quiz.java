package lectures;

public class w4quiz {
	public static void main(String[] args) {
		int a;
		int b;
		int c;
		
		a = -10;
		b=0;
		b+=a;
		c=10;
		
		while (a<0) {
			b+=a;
			a+=4;
		}
		System.out.println(b);
		while (c<0) {
			b+=a;
			c+=4;
		}
		System.out.println(b);
	}
	
}
