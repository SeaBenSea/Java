package test;

import bursa.A;
import bursa.Cities;
import bursa.D;
import lectures.w10Istanbul;
import lectures2.w10Calculate;

public class w10Test {

	//commandline parameters
	public int add(int a, int b) {
		return a + b;
	}
	
	public static void main(String[] args) {
		w10Calculate cal = new w10Calculate();
		cal.helloYildiz();
		
		lectures.w10Calculate call = new lectures.w10Calculate();
		System.out.println(lectures.w10Calculate.add(30, 40));
		
		System.out.println("This is located in folder test.");
		
		Cities c = new Cities();
		c.bursa();
		
		A a = new A("Bursa", 34, true, 3);
		System.out.println(a.sum(100));
		
		//a.div(); we can not access child method
		
		D d = new D("Diyarbakir", 12, false, 20, 400);
		System.out.println(d.sum(200));
		
		System.out.println("Test commandline arguments");
		test.w10Test t = new w10Test();
		
		if (args.length < 2) {
			System.out.println("Please input 2 integer numbers.");
		}
		String strOne = args[0];
		String strTwo = args[1];
		
		int one = Integer.parseInt(strOne);
		int two = Integer.parseInt(strTwo);
		
		//System.out.println(t.add(2, 3));
		//System.out.println(t.add(20, 30));
		
		System.out.println(t.add(one, two));
		
		//System.out.println(args[0]);
		//System.out.println(args[1]);
		
		
		
	}
}
