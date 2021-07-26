package lectures;

public class w1Bilgi {
	public static void main(String[] args) {
		
		//define variables...
		int d = 0;
		int a;
		int b = 23;
		int c = b + 23 + d;
		int d1, f, g;
		a = 0;
		
		double b2 = 3.4;
		float b3 = 4.5f;
		double b5 = 34.6f;
		
		long c1= 34l;
		int f1 = 34;
		
		double b6 = c;
		
		//type casting...
		double x = 45.6;
		int y = (int)x;
		float y1 = (float)x;
		System.out.println("y is: "+ y);
		System.out.println("y1 is: "+ y1);
		//test "long" and "int"
		long z = 2147483647;
		long w = z + 1;
		System.out.println("w is: "+ w);
		
		long w1 = 345;
		int w3 = (int)w1;
		System.out.println("Type cast w1: "+ w3);
		
		long z2 = 21474836500L;
		int w4 = (int)z2;
		System.out.println("Type cast z2: "+ w4);
		
		boolean flag;
			flag = true;
			flag = false;
		char my = '1';
		// char my2 = 'ab'; wrong
		String name = "Deniz";
		String lastName = "Günenç"; // String lastName = new String("Günenç");
		System.out.println(name + " " + lastName);
		
		
		//string with other data types
		int age = 18;
		System.out.println(name + " " + age);
		System.out.println(100 + name + " " + age);
		System.out.println(200 + 100 + name + " " + age);
		System.out.println(200 + 100 + name + " " + age + 500);
		System.out.println(age + 500);
		
		
		System.out.println(c + a);
		System.out.println(b6);
		
		System.out.println("Hello Bilgi");
		
		
		String lecture = "CMPE 101 Programming";
		System.out.println(lecture.length());
		System.out.println(lecture.toLowerCase());
		
		String greeting = " Hello ";
		System.out.println(greeting.trim());
		System.out.println(greeting.equals("Hello"));
		System.out.println(greeting.equals(" Hello "));
		System.out.println(greeting.equals(" hello "));
		System.out.println(greeting.equalsIgnoreCase(" hello "));
		System.out.println(greeting.charAt(0));
		System.out.println(greeting.charAt(1));
		System.out.println(greeting.substring(2));
		System.out.println(greeting.substring(2, 5));

		String greetingName = "Hi Deniz!";
		System.out.println(greetingName.indexOf("eniz"));
		System.out.println(greetingName.indexOf("Sally"));
		
		name = "Mary, Mary, Mary quite so";
		System.out.println(name.indexOf("Mary", 4));
		System.out.println(name.indexOf("Mary", 7));
		System.out.println(name.lastIndexOf("Mary"));
		
	}
}
