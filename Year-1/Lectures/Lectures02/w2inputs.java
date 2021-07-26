package lectures;

import java.util.Scanner;

public class w2inputs {
	public static void main(String[] args) {
		System.out.println("Test inputs...");
		System.out.println("What is your name?");
		
		String name;
		Scanner inputs = new Scanner(System.in); // "System.in" console input
		name = inputs.nextLine();
		
		System.out.println("My name is: " + name);
		
		System.out.println("How old are you?");
		
		int age = inputs.nextInt();
		System.out.println("I am " + age + " years old.");
		
		if (age >= 18) {
			System.out.println("You are young!");			
		}
		
	}
}
