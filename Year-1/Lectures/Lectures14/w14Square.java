package lectures;

public class w14Square extends w14AShape {

	private int w;
	
	public w14Square(int x, int y, int w) {
		super(x, y);
		// TODO Auto-generated constructor stub
		this.w=w;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("This is a square x is: " + getX()+ " y is: " + getY());
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return w*w;
	}
	
	public void myLast() {
		System.out.println("my last square");
	}

}
