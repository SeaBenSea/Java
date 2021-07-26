package lectures;

public class w13Circle extends w13AShape {

	private int r;
	
	public w13Circle(int x, int y, int r) {
		// TODO Auto-generated constructor stub
		super(x,y);
		this.r = r;
		
		
	}
	
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("this is circle x is: " + getX() + " , y is: " + getY());
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return Math.PI*r*r;
	}

	public void myCircle() {
		System.out.println("This is a child class of w13AShape class");
	}
}
