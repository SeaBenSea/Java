package lectures;

import java.util.ArrayList;

public class w15Students {

	private ArrayList<w15Student> students;
	
	public w15Students() {
	
		students = new ArrayList<w15Student>();
	}
	
	public void addStudent(w15Student s) {
		if (!students.contains(s)) {
			students.add(s);
		}
	}
	
	//search student
	
	public void searchId(int id) {
		for (int i = 0; i < students.size(); i++) {
			if (id==students.get(i).getId()) {
				System.out.println("Yes we have this student");
				System.out.println(students.get(i));
				break;
			
			}
		}
		System.out.println("The student not exist");
	}
	
	public void searchName(String name) {
		for (int i = 0; i < students.size(); i++) {
			if (students.get(i).getName().equals(name)) {
				System.out.println("Yes we have this student");
				System.out.println(students.get(i));
				return;
			
			}
		}
		System.out.println("The student not exist");
	}
	
	public void printStudents() {
		for(w15Student s: students)
			System.out.println(s);
	}
	
	public void printStudents(String dept) {
		for(w15Student s: students)
			if (s.getDept().equals(dept)) {
				System.out.println(s);
			}
	}
	
	
}
