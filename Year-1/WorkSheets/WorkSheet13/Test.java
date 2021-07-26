
public class Test {
	public static void main(String[] args) {//main method
		int[] ageofemployees = {16,17,18,19,20,21,22,23};//age of employees for SBS branch
		Branch b = new Branch("SBS", 2.50, ageofemployees);//creating branch object
		b.welcome(b.branchname);//testing welcome method
		b.bill(10, b.unitperorder);//testing bill method
		b.employee(ageofemployees);//testing employee information method
		b.book(2, 8, 20);//testing booking method
	}
}
