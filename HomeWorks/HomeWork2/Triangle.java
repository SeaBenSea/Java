//Deniz Günenç 120200078
package HomeWorks;

public class Triangle {

	private Point a;//triangles first point
	private Point b;//triangles second point
	private Point c;//triangles third point
	
	public Triangle(Point a, Point b, Point c) {//triangle method for creating triangle
		this.a = a;//defining triangles first point
		this.b = b;//defining triangles second point
		this.c = c;//defining triangles third point
	}

	public Point getA() {//get method for first point 
		return a;//returns first point 
	}

	public void setA(Point a) {//set method for first point 
		this.a = a;//updating first point with new first point
	}

	public Point getB() {//get method for second point 
		return b;//returns second point
	}

	public void setB(Point b) {//set method for second point 
		this.b = b;//updating second point with new second point
	}

	public Point getC() {//get method for third point 
		return c;//returns third point
	}

	public void setC(Point c) {//set method for third point 
		this.c = c;//updating second point with new second point
	}

	@Override
	public String toString() {//creating to string method
		return "Triangle [a=" + a + ", b=" + b + ", c=" + c + "]";//returns first, second and third points
	}
	
	
}
