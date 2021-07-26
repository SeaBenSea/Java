package bursa;

public class A {

	protected String name;
	protected int z;
	private int age;
	boolean old;
	public int sum;
	public A(String name, int age, boolean old, int sum) {
		super();
		this.name = name;
		this.age = age;
		this.old = old;
		this.sum = sum;
	}
	
	public int sum(int k) {
		return k + sum + z;
	}
}
