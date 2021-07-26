package lectures;

public class w6YourClass {
	private int number;
	public static double price;
	
	public w6YourClass(){
		
	}
	
	public w6YourClass(int number, double p){
		price = p;
	}
	
	//static total price
	public static double total() {
		return price;
	}
	
	//static total price
	public static double total2(int discount) {
		w6YourClass w = new w6YourClass();//how to use non static member in a static method
		return price + discount + w.number;
	}
	
	
	//total numbers
	public int myNumbers() {
		return number;
	}
	
	//total numbers
	public double myNumbers2(int m) {
		return number + m + price;
	}
	
	//non static method
	public double mix(int p) {
		return total2(p) + myNumbers2(p);
	}
	
	//non static method
	public static double mix2(int p) {
		w6YourClass m = new w6YourClass();
		return total2(p) + m.myNumbers2(p);// you must create an object to access non static method
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Number is: " + number + " price is: " + price;
	}
}
