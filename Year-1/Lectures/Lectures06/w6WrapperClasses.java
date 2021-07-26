package lectures;

public class w6WrapperClasses {
	public static void main(String[] args) {
		/*
		 * byte, short, int, long, double, float, char, boolean
		 */
		Byte b;
		Short s;
		Integer n = new Integer(2);
		Long s2;
		Double d;
		Float f;
		Character c;
		Boolean b2;
		
		System.out.println(n.MAX_VALUE);
		System.out.println(n.MIN_VALUE);
		
		int myNumber = 30;
		Integer myObjectNumber = new Integer(myNumber);//boxing
		
		Integer yourNumber = new Integer(300);//object
		int myPrimitive=yourNumber.intValue();//unboxing
		System.out.println("The number is: " + myPrimitive);
		
		String name = new String("Ali");
		String lastName = "Ahmet";//lastName = new String("Ahmet")
		
		Integer x = 34;// x = new Integer(34)
		int z = x; //x.intValue();
		
		String strOne = "23";
		int two = 34;
		int sum= two + Integer.parseInt(strOne);
		System.out.println("The sum is: " + sum);
		
		String strPrice = "3.4";
		double k = Double.parseDouble(strPrice);
		System.out.println(k*2);
		
		char c2 = 'a';
		System.out.println(Character.toUpperCase(c2));
		
		//10 into binary
		System.out.println(Integer.toBinaryString(10));
		
		
		
	}
	
	
	
	
}
