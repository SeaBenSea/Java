package lectures;

public class w9Person {
	
	private String name;
	private String lastName;
	private int age;
	private w9Address address;
	
	public w9Person(String name, String lastName, int age) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.age = age;
	}
	
	public w9Person(String name, String lastName, int age, w9Address address) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.age = age;
		this.address = address;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "w9Person [name=" + name + ", lastName=" + lastName + ", age=" + age + ", address=" + address + "]";
	}

	public w9Address getAddress() {
		return address;
	}

	public void setAddress(w9Address address) {
		this.address = address;
	}
	
	

}
