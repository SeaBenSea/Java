package lectures;

public class w13Rect extends w13AShape {

	private int w,h;
	
	public w13Rect(int x, int y, int w, int h) {
		// TODO Auto-generated constructor stub
		super(x,y);
		this.w = w;
		this.h = h;
		
	}
	
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("this is rectangle x is: " + getX() + " , y is: " + getY());
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return w*h;
	}

	public void myRect() {
		System.out.println("This is a child class");
	}
}
