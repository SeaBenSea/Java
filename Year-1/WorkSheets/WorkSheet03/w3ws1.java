//Deniz Günenç 120200078
package worksheets;

import java.util.Scanner;

public class w3ws1 {
	public static void main(String[] args) {
		
		//Part 1
		System.out.println("Part 1 Test 1");
		//defining x and y
		int x = 11;
		int y = 6;
		
		if (x >= 7 && x <= 12) {	//x E [7, 12]
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
		
		if (y > 9 && y < 23) {	//y E (9, 23)
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
		
		if (x >= 8 && x < 20 && y >= 8 && y < 20 && x > y) {	//x, y E [8, 20) and x > y
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
		
		System.out.println("Part 1 Test 2");
		x = 12;
		y = 10;
		
		if (x >= 7 && x <= 12) {	//x E [7, 12]
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
		
		if (y > 9 && y < 23) {	//y E (9, 23)
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
		
		if (x >= 8 && x < 20 && y >= 8 && y < 20 && x > y) {	//x, y E [8, 20) and x > y
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
		
		
		//Part 2
		Scanner input = new Scanner(System.in);	//getting input from user
		int hour = input.nextInt(); //defining input to hour variable
		
		switch (hour) {	//creating switch cases
		case 1:
			System.out.println("Morning");
			break;
		case 2:
			System.out.println("Morning");
			break;
		case 3:
			System.out.println("Morning");
			break;
		case 4:
			System.out.println("Morning");
			break;
		case 5:
			System.out.println("Morning");
			break;
		case 6:
			System.out.println("Morning");
			break;
		case 7:
			System.out.println("Morning");
			break;
		case 8:
			System.out.println("Morning");
			break;
		case 9:
			System.out.println("Morning");
			break;
		case 10:
			System.out.println("Noon");
			break;
		case 11:
			System.out.println("Noon");
			break;
		case 12:
			System.out.println("Noon");
			break;
		case 13:
			System.out.println("Noon");
			break;
		case 14:
			System.out.println("Noon");
			break;
		case 15:
			System.out.println("Noon");
			break;
		case 16:
			System.out.println("Noon");
			break;
		case 17:
			System.out.println("Afternoon");
			break;
		case 18:
			System.out.println("Afternoon");
			break;
		case 19:
			System.out.println("Afternoon");
			break;
		case 20:
			System.out.println("Night");
			break;
		case 21:
			System.out.println("Night");
			break;
		case 22:
			System.out.println("Night");
			break;
		case 23:
			System.out.println("Night");
			break;
		case 24:
			System.out.println("Night");
			break;
		default:	//if the hour is not exist
			System.out.println("Not defined...");
			break;
			
		}
		
		//Part 3
		System.out.println("Part 3 Test 1");
		x = 30;
		y = 26;
		int x2;
		int y2;
		int x3;
				
		x2 = (x > 20)? x - 5 : x + 7;	//If x is bigger than 20 decrease with 5 else increase with 7
		System.out.println("The result is: " + x2);
		
		y2 = (y > 10 && y < 30)? y * 2 : y / 3;	//If y is in between 10 and 30 multiply with 2 else divide with 3
		System.out.println("The result is: " + y2);
		
		x3 = (x > 25)? x = y : x * 7;	//If x is bigger than 25 assign y else multiply with 7
		System.out.println("The result is: " + x3);
		
		
		System.out.println("Part 3 Test 2");
		x = 10;
		y = 9;
				
		x2 = (x > 20)? x - 5 : x + 7;	//If x is bigger than 20 decrease with 5 else increase with 7
		System.out.println("The result is: " + x2);
		
		y2 = (y > 10 && y < 30)? y * 2 : y / 3;	//If y is in between 10 and 30 multiply with 2 else divide with 3
		System.out.println("The result is: " + y2);
		
		x3 = (x > 25)? x = y : x * 7;	//If x is bigger than 25 assign y else multiply with 7
		System.out.println("The result is: " + x3);
	}
}
