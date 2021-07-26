package lectures;

import java.util.Vector;

public class w15Test {
	
	public static void main(String[] args) {
		
		w15Students s = new w15Students();
		
		w15Student s1 = new w15Student("Ali", 3333, "CE");
		w15Student s2 = new w15Student("Fatma", 444, "EEEN");
		w15Student s3 = new w15Student("Erhan", 5555, "ME");
		w15Student s4 = new w15Student("Ayse", 6666, "CMPE");
		w15Student s5 = new w15Student("Murat", 7777, "CMPE");
		
		s.addStudent(s1);
		s.addStudent(s2);
		s.addStudent(s3);
		s.addStudent(s4);
		s.addStudent(s5);
		
		s.printStudents();
		s.searchName("AliKara");
		
		System.out.println("CMPE Students");
		s.printStudents("CMPE");
		
		System.out.println("Vector");
		
		Vector<w15Student> vStudents = new Vector<w15Student>();
		
		vStudents.add(s5);
		vStudents.add(s4);
		vStudents.add(s3);
		vStudents.add(s2);
		vStudents.add(s1);
		
		for (int i = 0; i < vStudents.size(); i++) {
			System.out.println(vStudents);
		}
		
	
	}
}
