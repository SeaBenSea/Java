package lectures;

public class w3WhileLoop {
	public static void main(String[] args) {
		/*
		for (int i = 0; i < 10; i++) {
			System.out.println("Bilgi");			
		}
		*/
		
		int i = 0;
		while (i < 10) {
			System.out.println("Bilgi " + i);
			i++;
		}
		
		System.out.println("Decrasing numbers");
		
		int y = 10;
		while (y > 0) {
			System.out.println("Bilgi decrease: " + y);
			y = y - 2;
		}
	}
}
