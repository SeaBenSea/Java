package lectures;

public class w14TestInnerClass {

	public static void main(String[] args) {
		w14Car c = new w14Car(4.5, "Red", 2000, "Fiat");
		System.out.println(c);
		System.out.println(c.totalprice());
		System.out.println(c.getColor());
		System.out.println(c.getModel());
		
		System.out.println(w14Car.ModelTwo.z);
		w14Car.ModelTwo.helloStatic();
		
	}
}
