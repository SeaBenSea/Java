package lectures;

public class w14Car {//"Car" is the outer class
	
	
	
	public static class ModelTwo{
		public static int z = 40;
		public static void helloStatic() {
			System.out.println("Hello static method inner class");
		}
	}
	
	
	//"Model" is inner class
	private class Model{
		public String brand;
		public int year;
		
		
		
		public Model(int year, String brand) {
			super();
			this.brand = brand;
			this.year = year;
		}

		public String getBrand() {
			return brand;
		}

		public void setBrand(String brand) {
			this.brand = brand;
		}

		public int getYear() {
			return year;
		}

		public void setYear(int year) {
			this.year = year;
		}

		@Override
		public String toString() {
			return "Model [brand=" + brand + ", year=" + year + "]";
		}
		
	}//end of the inner class
	
	
	
	private double price;
	private String color;
	private Model model;
	
	public w14Car(double price, String color, int year, String brand) {
		super();
		this.price = price;
		this.color = color;
		model = new Model(year, brand);
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "w14Car [price=" + price + ", color=" + color + ", model=" + model + "]";
	}
	
	
	
	public Model getModel() {
		return model;
	}

	public void setModel(Model model) {
		this.model = model;
	}

	//calculate total price
	public double totalprice() {
		if (model.year>2000) {
			return price*0.5 + ModelTwo.z;
		}
		else {
			return price + ModelTwo.z;
		}
	}
	
	
}
