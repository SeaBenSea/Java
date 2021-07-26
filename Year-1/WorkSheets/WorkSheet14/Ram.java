
public class Ram extends AComponents implements IComponents{

	double priceUSD;//official price
	double length, width, height;//some properties
	double electricneed;//electric need for run
	int capacity;//capacity of storage
	
	public Ram(double priceUSD, double length, double width, double height, double electricneed, int capacity) {
		super();
		this.priceUSD = priceUSD;
		this.length = length;
		this.width = width;
		this.height = height;
		this.electricneed = electricneed;
		this.capacity = capacity;
	}


	@Override
	public double area() {//area calculation
		// TODO Auto-generated method stub
		return length * width * height;
	}

	@Override
	public double electricusage() {//electric usage calculation
		// TODO Auto-generated method stub
		return capacity * electricneed + (capacity / 10);
	}

	@Override
	public double priceTRY() {//finding the price
		// TODO Auto-generated method stub
		return priceUSD * 8.48;
	}
	
	@Override
	public String toString() {//to string method
		return "Ram [priceUSD=" + priceUSD + ", length=" + length + ", width=" + width + ", height="
				+ height + ", electricneed=" + electricneed + ", capacity=" + capacity + ", area()=" + area()
				+ ", electricusage()=" + electricusage() + ", priceTRY()=" + priceTRY() + "]";
	}
	
	
}
