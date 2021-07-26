package lectures;

public class w14SquareTwo extends w14Rect{
	
	private int w;
	
	public w14SquareTwo(int x, int y, int w) {
		// TODO Auto-generated constructor stub
		super(x,y,w,w);
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
}
