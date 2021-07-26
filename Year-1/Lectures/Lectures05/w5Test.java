package lectures;

public class w5Test {
	public static void main(String[] args) {
		w5Student s1 = new w5Student("Erhan", 3.4);
		w5Person p1 = new w5Person("Fatma", 14, "female");
		System.out.println(p1.getName());
		
		p1.setAge(23);
		System.out.println(p1);
		
		System.out.println(s1.getName());
		System.out.println(s1);
		
		w5Calculate c1 = new w5Calculate();
		System.out.println("n is: " + c1.n);
		System.out.println("m is: " + c1.m);
		System.out.println(c1.sum(-1, -1, -1));
		System.out.println(c1.sub(-1, -1));
		System.out.println(c1.mul(3, 4));
		System.out.println("Numbers are:");
		c1.numbers(3, 10);
		System.out.println(c1.average(10));
		System.out.println(c1.total(3, 4, 5));
	}
	
	
}
