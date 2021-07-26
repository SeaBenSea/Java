package lectures;

public class w9Student extends w9Person {

	private String dept;
	
	public w9Student(String dept) {
		super("Fatma", "Karahan", 23);//bad example
		this.dept = dept;
	}
	
    public w9Student(String name, String lastName, int age, String dept) {
		super(name, lastName, age);
		this.dept = dept;
	}
    
    public w9Student(w9Person p, String dept) {
    	super(p.getName(), p.getLastName(), p.getAge(), p.getAddress());
    	this.dept = dept;
    }

	public w9Student(String name, String lastName, int age, w9Address address, String dept) {
		super(name, lastName, age, address);
		this.dept = dept;
	}

	@Override
	public String toString() {
    	//String info = getName() + " " + getLastName()+ " " + getAge();
		//return info + " w9Student [dept=" + dept + "]";
		return super.toString() + " w9Student [dept=" + dept + "]";
    }

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
	
}
