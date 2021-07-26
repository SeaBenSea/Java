package lectures;

public class w2Deniz {
	public static void main(String[] args) {
		System.out.println("Test outputs...");
		System.out.print("Bilgi");
		System.out.println(" University");
		int p = 23;
		int s = 10;
		int sum = p + s;
		System.out.println("p + s = " + sum);
		System.out.println("Test formatted output");
		double k = 34.5678;
		System.out.println(k);
		System.out.println("print it with a format");
		System.out.printf("My formatted data%7.2f my next message is: %5d \n", k, p);
		System.out.println("Hello \ntable");
		
		String name = "Deniz";
		String lastname = "Günenç";
		int age = 18;
		
		System.out.printf("Name %10s Last Name %15s age %5d", name, lastname, age);
	}
}
