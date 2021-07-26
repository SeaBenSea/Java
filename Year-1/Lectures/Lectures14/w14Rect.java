package lectures;

public class w14Rect extends w14AShape {

	private int w,h;
	
	public w14Rect(int x, int y, int w, int h) {
		super(x, y);
		// TODO Auto-generated constructor stub
		this.w=w;
		this.h=h;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("This is a rect x is: " + getX()+ " y is: " + getY());
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return w*h;
	}
	
	public void myRect() {
		System.out.println("This method is for Rectangle only.");
	}
	
	public void myLast() {
		System.out.println("my last rectangle");
	}
}
