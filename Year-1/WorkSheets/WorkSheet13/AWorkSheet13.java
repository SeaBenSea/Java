
public abstract class AWorkSheet13 implements IWorkSheet13 {

	@Override
	public abstract void employee(int[] ageofemployees);//for getting employee information

	@Override
	public void book(int tablecount, int personcount, int whattime) {
		//Printing booked information
		System.out.println("Booked " + tablecount + " table for " + personcount + " person at " + whattime + " o'clock.");
	}//for booking method

	@Override
	public abstract void welcome(String branchname);//for printing welcome message
	
	@Override
	public void bill(int numberoforder, double unitperorder) {//for getting bill
		// TODO Auto-generated method stub
		double total = unitperorder * numberoforder;//calculating bill
		System.out.println("U need to pay: " + total);//printing the bill
		
	}

}
