//Deniz Günenç 120200078
package StringArrayOps;

import java.util.Arrays;

public class Operations {
	
	private String a[];//String array "a"
	private String b[];//String array "b"

	public String Op1(String a[], String b[]) {
		return a[0] + " " + b[0];//method for taking first strings from the arrays
	}
	
	public int Op2(String a[], String b[]) {
		return a[0].length() + b[0].length();//method for total sum of first string's lengths from the arrays
	}
	
	public int Op3(String a[], String b[]) {//method for the sum all the strings lengths in the arrays
		int total = 0;//value for the total sum
		for (int i = 0; i < a.length; i++) {//for loop to sum all strings lengths in array a
			total += a[i].length();
		}
		for (int i = 0; i < b.length; i++) {//for loop to sum all strings lengths in array b
			total += b[i].length();
		}
		return total;//returning total value
	}
	
	public String Op4(String a[], String b[]) {
		return a[1] + " " + b[1];//method for taking second strings from the arrays
	}
	
	public int Op5(String a[], String b[]) {
		return a[1].length() + b[1].length();//method for total sum of first string's lengths from the arrays
	}

	public String[] getA() {//gets a array
		return a;//returns a array
	}

	public void setA(String[] a) {//sets a array
		this.a = a;//updates a array with new inputs
	}

	public String[] getB() {//gets b array
		return b;//returns b array
	}

	public void setB(String[] b) {//sets b array
		this.b = b;//updates b array with new inputs
	}

	@Override
	public String toString() {//toString method
		return "Operations [a=" + Arrays.toString(a) + ", b=" + Arrays.toString(b) + "]";
	}
	
	
	
}
