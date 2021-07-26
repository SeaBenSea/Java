package lectures;

public class w9Graduate extends w9Student {
	
	private String degree;

	public w9Graduate(String name, String lastName, int age, String dept, String degree) {
		super(name, lastName, age, dept);
		this.degree = degree;
	}

	public w9Graduate(w9Person p, String dept, String degree) {
		super(p, dept);
		this.degree = degree;
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	@Override
	public String toString() {
		return super.toString() + " w9Graduate [degree=" + degree + "]";
	}
	
	
	

}
