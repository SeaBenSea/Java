//Deniz Günenç 120200078
package HomeWorks;

import java.lang.Math;//importing math library for sin. cos. etc.

public class HomeWork2 {
	
	public void rotate(double degree, Triangle t) {//rotate method
		double radian = Math.toRadians(degree);//converting degree to radians for math library
		System.out.println("Old Points" + t.toString());//Printing the original points
		
		double Ax = t.getA().getX();//defining point A's x
		double Ay = t.getA().getY();//defining point A's y
		double Bx = t.getB().getX();//defining point B's x
		double By = t.getB().getY();//defining point B's y
		double Cx = t.getC().getX();//defining point C's x
		double Cy = t.getC().getY();//defining point C's y
		
		double p1x =(( Ax * Math.cos(radian) ) - ( Ay * Math.sin(radian) ));//rotate formula for x
		double p1y =(( Ax * Math.sin(radian) ) + ( Ay * Math.cos(radian) ));//rotate formula for y
		Point p1 = new Point(p1x, p1y);//creating new point
		t.setA(p1);//updating triangles first point
		
		double p2x =(( Bx * Math.cos(radian) ) - ( By * Math.sin(radian) ));//rotate formula for x
		double p2y =(( Bx * Math.sin(radian) ) + ( By * Math.cos(radian) ));//rotate formula for y
		Point p2 = new Point(p2x, p2y);//rotate formula for x
		t.setB(p2);//updating triangles second point
		
		double p3x =(( Cx * Math.cos(radian) ) - ( Cy * Math.sin(radian) ));//rotate formula for x
		double p3y =(( Cx * Math.sin(radian) ) + ( Cy * Math.cos(radian) ));//rotate formula for y
		Point p3 = new Point(p3x, p3y);//rotate formula for x
		t.setC(p3);//updating triangles third point
		
		
		System.out.println("New Points" + t.toString());//Printing the rotated points
	}

	public void area(Triangle t) {
		double area = 0;
		double Ax = t.getA().getX();//defining point A's x
		double Ay = t.getA().getY();//defining point A's y
		double Bx = t.getB().getX();//defining point B's x
		double By = t.getB().getY();//defining point B's y
		double Cx = t.getC().getX();//defining point C's x
		double Cy = t.getC().getY();//defining point C's y
		area = ((Ax * (By - Cy)) + (Bx * (Cy - Ay)) + (Cx * (Ay - By))) / 2;//area formula for triangle
		System.out.println(Math.abs(area));//printing area of the triangle
	}
	
	public void center(Triangle t) {
		double Ax = t.getA().getX();//defining point A's x
		double Ay = t.getA().getY();//defining point A's y
		double Bx = t.getB().getX();//defining point B's x
		double By = t.getB().getY();//defining point B's y
		double Cx = t.getC().getX();//defining point C's x
		double Cy = t.getC().getY();//defining point C's y
		double centerx = (Ax + Bx + Cx) / 3;//finding center of the triangle with average of the X's
		double centery = (Ay + By + Cy) / 3;//finding center of the triangle with average of the Y's
		
		Point center = new Point(centerx, centery);//creating new point with name center
		System.out.println(center.toString());//printing center point
		System.out.println("distance to the origin: ");
		System.out.println(Math.sqrt((3 * 3) + (4 * 4)));
		System.out.println(Math.sqrt((centerx * centerx) + (centery * centery)));
	}
	
	public static void main(String[] args) {//main method
		HomeWork2 func = new HomeWork2();//create object
		
		Point p1 = new Point(2.90, 2.30);//creating new first point for triangle tests
		Point p2 = new Point(5.30, 2.29);//creating new second point for triangle tests
		Point p3 = new Point(4.10, 4.37);//creating new third point for triangle tests
		Triangle t1 = new Triangle(p1, p2, p3);//creating new triangle for tests

		
		System.out.println("--Area Test--");//Area Test
		func.area(t1);//Running area method
		
		System.out.println("--Center Test--");//Center Test
		func.center(t1);//Running center method
		
		System.out.println("--Rotate Test--");//Rotate Test
		func.rotate(52, t1);//Running rotate method
	}
}
