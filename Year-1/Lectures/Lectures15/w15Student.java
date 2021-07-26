package lectures;

public class w15Student {
	private String name;
	private int id;
	private String dept;
	
	public w15Student(String name, int id, String dept) {
		super();
		this.name = name;
		this.id = id;
		this.dept = dept;
	}
	
	public w15Student(String name, int id) {
		super();
		this.name = name;
		this.id = id;
		this.dept = "CMPE";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
	
	@Override
	public String toString() {
		return "w15Student [name=" + name + ", id=" + id + ", dept=" + dept + "]";
	}
	
	
}
