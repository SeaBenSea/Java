package lectures;

public class w5Student {
	
	private String name;
	private double gpa;
	
	public w5Student(String name, double gp) {
		// TODO Auto-generated constructor stub
		this.name=name;
		
		if (gp < 0) {
			System.out.println("Not valid");
			System.exit(1);//terminate
		}
		else {
			gpa=gp;
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	
	
}
