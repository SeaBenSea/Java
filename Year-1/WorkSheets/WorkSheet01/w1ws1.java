package worksheets;

public class w1ws1 {
	public static void main(String [] args) {

		
		//PART 1
		
		System.out.println("Hello World");
		System.out.println("Welcome Deniz ASD:asd:");
		
		int u = 20;
		System.out.println(u);
		int v = u + 5; //This is a comment line and y is addition of x and 5
		System.out.println("v is " + v);
		
		
		System.out.println("Hello World!");
		// define some variables..	
		int k;
		k=16;
		int p=22;
		int c= k+p;
		System.out.println("The result is: "+ c);
		int m;	
		m = k*6;
		System.out.println(m);
		double zz=8.9;
		double xx= zz*m;
		System.out.println(xx);
		// double m =4.5; wrong, re-defined...
		// mixed data types

		double n = k+5;
		System.out.println(n);
		int t= (int)(zz+xx);
		System.out.println(t);
		float d =2.469f;
		d = d+(float)n;
		System.out.println(d);

		double g= k+d;
		System.out.println(g);

	
		// division "/"
		int d1=8;
		int h1= 3;
		int p1= d1/h1;
		System.out.println(p1);
		double k1= d1/h1;
		System.out.println("k1: "+k1);
		double m1= d1*2.0/h1;
		System.out.println("m1: "+m1);
		double x1=m1;

		boolean x2=true;
		x2=false;
		char x3='9';
		x3='b';
		String name="Deniz"; // String name= new String("Deniz");
		System.out.println("My name is: "+name);

		String lastName = new String ("Günenç");
		System.out.println("Last name is: "+lastName);

		// modular operator
		int k3=7;
		System.out.println("The reminder is: "+ k3 % 2); //ans:1

		int s=10;
		s=s+2;
		s+=2;
		System.out.println("New value of s is: " + s);
		int r=10;
		int w=0;
		System.out.println("default:"+r);
		w=r++; // r++= meaning is: r=r+1
		System.out.println("updated:"+r);
		System.out.println("W is:"+w);	

		System.out.println("decrease...");
		int r1=100;
		int w1=0;
		System.out.println("default:"+r1);
		w1=--r1; // r1--= meaning is: r=r-1
		System.out.println("updated:"+r1);
		System.out.println("W is:"+w1);	


	
		// String example
		String name1="Ali";
		String name2= "Veli";
		String name3= name1+"   "+name2;
		System.out.println(name3);
		System.out.println(2+3+name1);
		System.out.println(name1+2+3);
		System.out.println((name1+2+3).length());		
		
		//PART 2
		//Definition
		
		int x;
		double y;
		float z;
		
		//Test 1
		x = 4;
		y = 6.99;
		z = 3.456789f;
		
		System.out.println("--Part 2 Test 1--");
		System.out.println(3 * x);
		System.out.println((3 * x )+ y);
		System.out.println((x + y) / 7);
		System.out.println(((3 * x )+ y) / (z + 2));
		
		//Test 2
		x = 6;
		y = 7.65;
		z = 4.4268423f;
		
		System.out.println("--Part 2 Test 2--");
		System.out.println(3 * x);
		System.out.println((3 * x )+ y);
		System.out.println((x + y) / 7);
		System.out.println(((3 * x )+ y) / (z + 2));

		//PART 3
		//Definition is already done at Part 2.  x is integer, y is double, and z is float
		
		//Test 1
		x = 4;
		y = 6.99;
		z = 3.456789f;
		
		System.out.println("--Part 3 Test 1--");
		System.out.println(((x * x) + (y * y * y) - (z * z)) / (1 - (x * x * x)));

		
		//Test 2
		x = 6;
		y = 7.65;
		z = 4.4268423f;
		
		System.out.println("--Part 3 Test 2--");
		System.out.println(((x * x) + (y * y * y) - (z * z)) / (1 - (x * x * x)));


		  } // end of the main method
}// end of the class
