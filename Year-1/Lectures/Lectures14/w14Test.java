package lectures;

import java.util.Random;

public class w14Test {
	
	public static void main(String[] args) {
		w14Circle c1 = new w14Circle(10, 4, 100);
		w14Rect r1= new w14Rect(20, 50, 20, 100);
		w14Square s1 = new w14Square(30, 40, 100);
		w14SquareTwo s2 = new w14SquareTwo(40, 50, 200);
		
		c1.draw();
		r1.draw();
		s1.draw();
		s2.draw();
		
		System.out.println(c1.area());
		System.out.println(r1.area());
		System.out.println(s1.area());
		System.out.println(s2.area());
		
		//polymorphism
		w14IShape c2 = new w14Circle(100, 30, 50);
		w14IShape r2 = new w14Rect(100, 200, 40, 400);
		w14IShape s3 = new w14Square(300, 400, 150);
		w14IShape s4 = new w14SquareTwo(400, 100, 20);
		
		
		c2.draw();
		r2.draw();
		
		System.out.println("Testing poly");
		w14IShape []shapes = {c1,r1,s1,s2,c2,r2,s3,s4, new w14Circle(20,40, 50), new w14Square(20, 40, 100)};
	
		double sum = 0;
		Random ran = new Random();
		for (int i = 0; i < shapes.length; i++) {
			shapes[i].draw();
			sum += shapes[i].area();
			shapes[i].move(ran.nextInt(), ran.nextInt());
		}
		System.out.println("Total area is: " + sum);
		
		r1.myRect();
		//r2.myRect(); can't reach
		r1.myLast();
		r2.myLast();
		
		w14AShape c4 = new w14Circle(1, 2, 30);
		w14AShape r5 = new w14Rect(10, 30, 20, 50);
		
		System.out.println("Test abstract");
		c4.draw();
		
		
	}
}
