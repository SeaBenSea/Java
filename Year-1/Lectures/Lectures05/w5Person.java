package lectures;

public class w5Person {
	private String name;
	private int age;
	private String gender;
	
	public String getName() {
		return name;
	}
	
	public void setAge(int age) {
		this.age=age;
	}
	
	
	public void hello() {
		System.out.println("Hello");
	}
	
	
	public w5Person() {//default constructor
		name="Ben";
		age=20;
	}

	public w5Person(String name, int age, String gender) {//overloaded constructor
		this.name=name;
		this.age=age;
		this.gender=gender;
	}
	
	public w5Person(String name, int age) {//overloaded constructor
		this.name=name;
		this.age=age;
	}
	
	
	public String toString() {
		return name + " " + age + " " + gender;
	}
	
	public static void main(String[] args) {
		w5Person p1 = new w5Person();//p1 object
		String lastName = new String();
		p1.hello();
		w5Person p2 = new w5Person();
		p1.name="Deniz";
		p1.age=19;
		p1.gender="Male";
		
		p2.name="Sea";
		p2.age=18;
		p2.gender="Male";
		
		System.out.println("Name is: " + p1.name);
		System.out.println("Name is: " + p2.name);
		
		w5Person p3 = new w5Person();
		System.out.println("Name is: " + p3.name);
		System.out.println("Gender is: " + p3.gender);
		
		w5Person p4 = new w5Person("Erdem", 18, "male");
		System.out.println("Name if the 4th person is: " + p4.name);
		
		w5Person p5= new w5Person("Selman", 38);
		System.out.println("Name if the 5th person is: " + p5.name + " gender is: " + p5.gender);
		
		//w5Person p6= new w5Person(40, "Fatma");  we do not have such a constructor 
		
		int data = 1000;
		System.out.println("Data is: " + data);
		//System.out.println(p4);//hex code
		System.out.println(p4.toString());//hex code
		
		p4.name ="Ankara";
		System.out.println(p4.toString());//hex code
		
	}//end of the main method
	
}//end of the class
