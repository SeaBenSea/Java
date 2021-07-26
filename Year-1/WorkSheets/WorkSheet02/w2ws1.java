//Deniz Günenç 120200078
package worksheets;

public class w2ws1 {
	public static void main(String[] args) {
		//Question 1
		int x;
		double y;
		float z;
		
		//Test 1
		x = 16;
		y = 3.16;
		z = 2.456789f;
		
		System.out.println(((x * x) + y - (z * z * z)) / ((5 * x) - (y * y)));
		
		//Test 2
		x = 6;
		y = 7.65;
		z = 4.4268423f;
		
		System.out.println(((x * x) + y - (z * z * z)) / ((5 * x) - (y * y)));
		
		//Question 2
		
		int a = 10; // defining a
		int res = a++ + ++a;  
		// a++ it takes value first so it is 10 and than it increases to 11
		// ++a first it increases 11 to 12 and get the value 12
		// res = 10 + 12
		System.out.println(res); // printing the sum
		a = 10; // reset a
		res = a++ + a++;
		// a++ it takes value first so it is 10 and than it increases to 11
		// a++ it takes value first so it is 11 and than it increases to 12
		// res = 10 + 11
		System.out.println(res); // printing the sum
		
		//Question 3
		
		String word = "Deniz";
		
		System.out.println(word.length()); // to find length of the string
		System.out.println(word.charAt(2));// to find 3rd character of the string
		System.out.println(word.toUpperCase());// to convert all characters to upper case
	}
}
