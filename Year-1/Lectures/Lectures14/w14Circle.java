package lectures;

public class w14Circle extends w14AShape {

	private int r;
	
	public w14Circle(int x, int y, int r) {
		super(x, y);
		// TODO Auto-generated constructor stub
		this.r = r;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("This is a circle x is: " + getX()+ " y is: " + getY());
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return Math.PI*r*r;
	}
	
	public void myLast() {
		System.out.println("my last circle");
	}
}
