package lectures;

public class w8Table {

	public static void main(String[] args) {
		int a[];//One dimensional
		int b[][];//Two dimensional
		
		a = new int [5];//only 5 elements
		b = new int [3][5]; // 3 * 5 elements
		
		a[0] = 4;
		b[0][0] = 4;
		
		/*
		 * 1 3 4 4 5
		 * 2 3 5 1 4
		 * 1 2 3 4 3
		 */
		
		
		int c[] = {1, 2, 3, 4};
		int y[][] = {{1,2,4,4,5}, {2,3,5,1,4}, {1,2,3,4,5}};
		
		for (int i = 0; i < 3; i++) {//i is for "row" index
			//inner loop prints elements on row
			for (int j = 0; j < 5; j++) {//j is for "column" index
				System.out.print(y[i][j] + " ");
			}
			System.out.println();//move to next line
		}
		
		
		
	}
}
