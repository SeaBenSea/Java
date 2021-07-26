package bursa;

public class C extends B {

	private int zz;

	public C(String name, int age, boolean old, int sum, int z) {
		super(name, age, old, sum);
		this.zz = z;
	}
	
	public int mul() {
		return z * sum * zz;
	}
	
}
