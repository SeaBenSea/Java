package lectures;

import java.util.ArrayList;

public class w15Bilgi {
	public static void main(String[] args) {
		
		String names[]= {"ali", "fatma", "erhan"};
		int data[] = {1,2,3,4};
		
		int data2[] = new int[100];
		
		ArrayList mydata = new ArrayList();
		
		System.out.println("size of the array is: " + data.length);
		System.out.println("size of the arraylist is: " + mydata.size());
		
		data[2] = 300;
		mydata.add("Bilgi"); //index is "zero"
		System.out.println("size of the arraylist is: " + mydata.size());
		mydata.add("Bilgi");
		System.out.println("size of the arraylist is: " + mydata.size());
	
		//data[3]="bilgi";
		mydata.add(222);
		System.out.println("size of the arraylist is: " + mydata.size());
		
		mydata.add(new Person());
		System.out.println("size of the arraylist is: " + mydata.size());
		
		mydata.add(new Double(34.6));
		System.out.println("size of the arraylist is: " + mydata.size());
		
		//mydata.remove(3);
		System.out.println("after remove");
		System.out.println("size of the arraylist is: " + mydata.size());
		
		int one = data[0];
		
		String bilgi =(String)mydata.get(0);
		System.out.println(bilgi);
		
		Person p = (Person)mydata.get(3);
		p.hiPerson();
		
		ArrayList<String> listnames= new ArrayList<String>();
		listnames.add("Bilgi");
		//listnames.add(33);
		//listnames.add(new Person());
		listnames.add("Istanbul");
		listnames.add("Istanbul2");
		listnames.add("Istanbul3");
		listnames.add("Istanbul4");
		listnames.add("Istanbul5");
		
		String mybilgi = listnames.get(0);
		
		ArrayList<Person> myPerson = new ArrayList<Person>();
		myPerson.add(new Person());
		myPerson.add(new Person());
		
		for (int i = 0; i < listnames.size(); i++) {
			System.out.println(listnames.get(i));
		}
		
		System.out.println("The second type outout is: ");
		for (String kkk:listnames) {
			System.out.println(kkk);
		}
		
		System.out.println("Search element");
		int k =listnames.indexOf("Istanbul");
		
		if (k > -1) {
			System.out.println("We have this element");
			System.out.println(listnames.get(k));
		}
		else {
			System.out.println("We don't have");
		}
		
		listnames.add(0, "Bursa");
		listnames.add(4, "Izmir");
		for (String kkk:listnames) {
			System.out.println(kkk);
		}
		
		System.out.println("Current size is: " + listnames.remove("Bursa"));
		System.out.println("Remove Bursa");
		for (String kkk:listnames) {
			System.out.println(kkk);
		}
		
		listnames.clear();
		System.out.println("empty, size is: " + listnames.size());
		for (String kkk:listnames) {
			System.out.println(kkk);
		}
		
		
		
		
	}
}

class Person{
	public void hiPerson() {
		System.out.println("hi person");
	}
}