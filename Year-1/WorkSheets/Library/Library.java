//Deniz Günenç 120200078
package worksheets;

import java.util.Arrays;

public class Library {

	private Scroll s[];
	
	public Library(Scroll s[]) {//library class
		this.s = s;
	}

	@Override
	public String toString() {//toString method returns list of scrolls
		return "Library [s=" + Arrays.toString(s) + "]";
	}

	public Scroll[] getS() {//get scroll method
		return s;//returns scrolls
	}

	public void setS(Scroll[] s) {//set scroll method
		this.s = s;//updates scroll array with new scroll array
	}
	
	public static void CalculateSize(Library l) {//CalculateSize method
		int total = 0;//defining total for total size
		for (int j = 0; j < l.getS().length; j++) {//loop for the find length and run the code length times
			if (l.getS()[j].getPreserveTime() >= 100) {//if preserveTime more than 100 sum the sizes
				total += l.getS()[j].getSize(); //sum the sizes and add them to the total value
			}
		}
		System.out.println(total);//print total
	}
	
	public static void main(String[] args) {
		Paper p1 = new Paper(150, 52);//creating paper 1
		System.out.println("Scroll 1 Test");
		Scroll s1 = new Scroll(200, 20);//creating scroll 1
		System.out.println(s1);
		System.out.println("Scroll 2 Test");
		Scroll s2 = new Scroll(p1);//creating scroll 2 from paper 1
		System.out.println(s2);
		
		Scroll s3 = new Scroll(160, 70);//creating scroll 3
		Scroll s4 = new Scroll(64, 33);//creating scroll 4
		Scroll s5 = new Scroll(999, 99);//creating scroll 5
		Scroll s6 = new Scroll(1, 1);//creating scroll 6
		Scroll s7 = new Scroll(50, 100);//creating scroll 7
		Scroll s8 = new Scroll(123, 12);//creating scroll 8
		Scroll s9 = new Scroll(35, 69);//creating scroll 9
		Scroll s10 = new Scroll(47, 78);//creating scroll 10
		
		System.out.println("Library Test");
		Scroll d[] = {s1,s2,s3,s4,s5,s6,s7,s8,s9,s10};//scroll array
		Library l1 = new Library(d);//creating library 1
		CalculateSize(l1);//calculating size of the scrolls which's preserveTime is more than 100
	}
}
