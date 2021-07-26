package lectures;

public abstract class w14AShape implements w14IShape {

	
	private int x, y;

	public w14AShape(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	@Override
	public String toString() {
		return "w14AShape [x=" + x + ", y=" + y + "]";
	}

	@Override
	public void move(int x, int y) {
		// TODO Auto-generated method stub
		this.x=x;
		this.y=y;
	}

	@Override
	public abstract void draw();

	@Override
	public double distance() {
		// TODO Auto-generated method stub
		double k= Math.pow(x,2)-Math.pow(y, 2);
		
		return Math.sqrt(k);
	}

	@Override
	public abstract double area();

}
