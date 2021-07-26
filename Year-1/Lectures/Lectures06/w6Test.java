package lectures;

public class w6Test {
	public static void main(String[] args) {
		/*
		w6YourClass y1 = new w6YourClass();
		System.out.println(y1);
		
		//System.out.println(y1.total()); y1 has no relation with "total"
		System.out.println(w6YourClass.total()); //we can access it with the class name
		//System.out.println(total); we can't access it. must access it with the class name
		System.out.println(y1.myNumbers());//you must access it with an object
		System.out.println(w6YourClass.price);// static... we cab access it with object name
		*/
		
		w6Calculation c1 = new w6Calculation(10, 20);
		System.out.println("C1 first time: " + c1.mytotal(10));
		
		w6Calculation c2 = new w6Calculation(10, 20);
		System.out.println("The second onbject: " + c2.mytotal(10));
		
		//c2.number=100;
		//w6Calculation.number=100;
		System.out.println("static variable is updated...");
		System.out.println("The second onbject: " + c2.mytotal(10));
		System.out.println("C1 second time: " + c1.mytotal(10));
		
		lectures.w6StaticMethods.hello();
		
		System.out.println(lectures.w6StaticMethods.sum(1, 5));
		System.out.println(lectures.w6StaticMethods.myBignumber(3, 5));
		System.out.println(lectures.w6StaticMethods.myBignumber(30, 5));
		
		
		
	}
}
