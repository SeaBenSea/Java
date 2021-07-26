package lectures;

public class w9Worker extends w9Person {
	
	private int salary;

	public w9Worker(String name, String lastName, int age, int salary) {
		super(name, lastName, age);
		this.salary = salary;
	}

	@Override
	public String toString() {
		return super.toString() + " w9Worker [salary=" + salary + "]";
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
}
