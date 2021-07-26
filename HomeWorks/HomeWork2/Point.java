//Deniz Günenç 120200078
package HomeWorks;

public class Point {

	private double x;//point x
	private double y;//point x
	
	public Point(double x, double y) {//point method for creating points
		this.x = x;//defining point x
		this.y = y;//defining point y
	}
	

	public double getX() {//get method for point x
		return x;//returns point x
	}

	public void setX(double x) {//set method for point x
		this.x = x;//updating point x with new x
	}

	public double getY() {//get method for point y
		return y;//returns point y
	}

	public void setY(double y) {//set method for point y
		this.y = y;//updating point y with new y
	}



	@Override
	public String toString() {//creating to string method
		return "Point [x=" + x + ", y=" + y + "]";//returns x and y
	}
	
}
