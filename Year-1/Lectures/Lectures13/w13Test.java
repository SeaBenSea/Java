package lectures;

public class w13Test {

	public static void main(String[] args) {
		
		//w13ABilgi a = new w13ABilgi();//this is an abstract class we can't initialize it.
		//System.out.println(a.add(3, 4));
		w13Bilgi b = new w13Bilgi();
		System.out.println(b.add(2, 3));
		int c[] = {1,2,3,4,5};
		b.printArray(c);
		
		System.out.println("Test Rectangle");
		
		w13Rect r = new w13Rect(20, 50, 100, 60);
		r.draw();
		System.out.println("Area of the rect is: " + r.area());
		System.out.println("Move rectangle");
		r.moveToNewLocation(200, 400);
		r.draw();
		
		System.out.println("Test Circle");
		w13Circle cir = new w13Circle(300, 400, 200);
		cir.draw();
		System.out.println("Area of the circle is: " + cir.area());
		System.out.println("test move");
		cir.moveToNewLocation(600, 100);
		cir.draw();
		
		System.out.println("Test interface");
		w13Istanbul ist = new w13Istanbul();
		System.out.println(ist.sum(2, 3));
		ist.hello();
		ist.ankara("Ankara");
		ist.sivas();
		ist.erzurum();
		ist.izmir();
		
		System.out.println("Test the Bursa");
		w13Bursa bursa  = new w13Bursa();
		bursa.erzurum();
		
		System.out.println("Test variables");
		w13MyVariable my = new w13MyVariable();
		my.hello();
		
		System.out.println("my flag is: " + w13MyVariable.flag);
		//w13MyVariable.flag = false; it was final variable
		
		System.out.println("Test error interfaces");
		w13WithErrorInterface w = new w13WithErrorInterface();
		//System.out.println(w.z); 2 z defined can not decide
		
	}
	
}
