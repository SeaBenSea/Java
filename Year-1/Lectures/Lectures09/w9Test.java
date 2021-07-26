package lectures;

public class w9Test {

	public static void main(String[] args) {
		w9Person p1 = new w9Person("Deniz", "Günenç", 18);
		System.out.println(p1);
		
		System.out.println("Test the Student class");
		
		w9Student s1 = new w9Student("CMPE");
		System.out.println(s1.toString());
		
		w9Student s2 = new w9Student("CE");
		System.out.println(s2.toString());
		
		w9Student s3 = new w9Student("Deniz", "Günenç", 18, "CMPE");
		System.out.println(s3);
		
		w9Student s4 = new w9Student(p1, "CE");
		System.out.println(s4);
		
		System.out.println("Test the graduate class");
		
		w9Graduate g1 = new w9Graduate(p1, "CMPE", "PhD");
		System.out.println(g1);
		
		w9Graduate g2 = new w9Graduate("Ahmet", "Çelik", 20, "CE", "Msc");
		System.out.println(g2);
		
		System.out.println("Test the Telephone class");
		
		w9Telephone t1 = new w9Telephone("05555", "3213", "032325");
		System.out.println(t1);
		
		System.out.println("Test the address class");
		w9Address a1 = new w9Address("Izmir", 444, t1);
		System.out.println(a1);
		
		w9Address a2 = new w9Address("Ankara", 666, new w9Telephone("5135146356", "654632", "4143565"));
		System.out.println(a2);
		
		System.out.println("Test the final version");
		
		w9Graduate g4 = new w9Graduate(p1, "CMPE", "PhD");
		System.out.println(g4);
		
		w9Person p3 = new w9Person("Erhan", "Çelik",45, a1);
		w9Graduate g5 = new w9Graduate(p3, "CE", "Mcs");
		System.out.println(g5);
		
		//update objects
		System.out.println("update object properties");
		
		g5.getAddress().setCity("Ankara");
		System.out.println(g5);
		
		g5.getAddress().getTelephone().setMobile("054233333");
		System.out.println(g5);
		g5.setName("Gamze");
		System.out.println(g5);
		
		System.out.print("The fax of g45 is:");
		System.out.println(g5.getAddress().getTelephone().getFax());
		
	}
}
