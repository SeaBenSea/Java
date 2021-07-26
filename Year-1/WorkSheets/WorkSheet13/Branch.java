
public class Branch extends AWorkSheet13 {
	
	String branchname;//branch's name
	double unitperorder;//branch's food price
	int[] ageofemployees;//branch's employee's ages

	public Branch(String branchname, double unitperorder, int[] ageofemployees) {//branch class
		super();
		this.branchname = branchname;//setting branch name
		this.unitperorder = unitperorder;//setting branch's food price
		this.ageofemployees = ageofemployees;//setting branch's employee's ages
	}

	@Override
	public void employee(int[] ageofemployees) {//calculating employee information
		// TODO Auto-generated method stub
		double total = 0;//defining total for sum of all ages
		for (int i = 0; i < ageofemployees.length; i++) {//getting ages from array list
			total += ageofemployees[i];//updating total with sum of all ages
		}
		double average = total / ageofemployees.length;//dividing total to number of employee for getting average
		System.out.println("Number of employees: " + ageofemployees.length + " Average: " + average);//printing employee information
	}

	@Override
	public void book(int tablecount, int personcount, int whattime) {//for booking
		// TODO Auto-generated method stub
		super.book(tablecount, personcount, whattime);//getting variables from abstract
	}

	@Override
	public void welcome(String branchname) {//welcome message
		// TODO Auto-generated method stub
		System.out.println("Welcome to the " + branchname);	//printing the welcome message with branch name	
	}
	
	@Override
	public void bill(int numberoforder, double unitperorder) {//for calculating bill
		// TODO Auto-generated method stub
		super.bill(numberoforder, unitperorder);//getting variables from abstract
	}

}
