package lectures;

public abstract class w13AShape {

	private int x;
	private int y;
	
	public w13AShape(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	
	
	public int getX() {
		return x;
	}



	public int getY() {
		return y;
	}



	public void moveToNewLocation(int x2, int y2) {
		x = x2;//update locations with given parameters
		y = y2;
	}
	
	public abstract void draw();//we don't know what to draw at this point
	
	public abstract double area(); //is it circle or a rectangle?
	
}
