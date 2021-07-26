
public class Ssd extends AComponents implements IComponents{

	double priceUSD;//official price
	double length, width;//some properties
	double electricneed;//electric need for run
	int capacity;//capacity of storage
	
	public Ssd(double priceUSD, double length, double width, double electricneed, int capacity) {
		super();
		this.priceUSD = priceUSD;
		this.length = length;
		this.width = width;
		this.electricneed = electricneed;
		this.capacity = capacity;
	}
	
	@Override
	public double area() {//area calculation
		// TODO Auto-generated method stub
		return length * width;
	}

	@Override
	public double electricusage() {//electric usage calculation
		// TODO Auto-generated method stub
		return capacity * electricneed + (capacity / 64);
	}

	@Override
	public double priceTRY() {//finding the price
		// TODO Auto-generated method stub
		return priceUSD * 8.48;
	}

	@Override
	public String toString() {//to string method
		return "Ssd [priceUSD=" + priceUSD + ", length=" + length + ", width=" + width
				+ ", electricneed=" + electricneed + ", capacity=" + capacity + ", area()=" + area()
				+ ", electricusage()=" + electricusage() + ", priceTRY()=" + priceTRY() + "]";
	}
	
	
}
