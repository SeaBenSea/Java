package lectures;

public class w8ArrayMethods {

	//implement a method that prints integer array elements
	public void printArray(int []myArray) {
		for(int i = 0; i < myArray.length; i++) {
			System.out.println(myArray[i]);
		}
	}
	
	//input: a[] = 1, 2, 3, 4
	//input: b[] = 10, 20, 30, 40
	//return an array holds sum of "a" and "b" arrays
	
	public static int[] sumArray(int a[], int b[]) {
		int []temp = new int [a.length];
		for (int i = 0; i < a.length; i++) {
			temp[i]= a[i] + b[i];
		}
		return temp;//return array name
	}
	
	public int[] sumArray2(int a[], int b[]) {
		//int []temp = new int [a.length];
		for (int i = 0; i < a.length; i++) {
			//temp[i]= a[i] + b[i];
			a[i] = a[i] + b[i];
		}
		return a;//return array name
	}
	
	
	//merge arrays
	//input a[] = 1 2 3
	//input b[] = -1 -4 -6 -8 9 0
	//return an array = 1 2 3 -1 -4 -6 -8 9 0
	
	public int []merge(int a[], int b[]){
		int []temp = new int[a.length + b.length];
		int p = 0;
		for(int i = 0; i < a.length; i++) {
			temp[p] = a[i];
			p++;
		}
		for(int i = 0; i < b.length; i++) {
			temp[p] = b[i];
			p++;
		}
		
		return temp;
	}
	
	//find the max number of an array
	
	public int max(int []a) {
		int myMax = a[0]; //assume a[0] is the biggest number of the "a" array
		int i = 1;
		while (i < a.length) {
			if (myMax < a[i]) {
				myMax = a[i];
			}
			i++;
		}
		return myMax;
	
	}
	
	
	//sum of even numbers of a given array
	
	public int sumEven(int []a) {
		int sum = 0;
		for(int data:a) {//look at here how we access array elements
			if(data%2 == 0) {
				sum += data;
			}
		}
		return sum;
	}
	
	//search a number from an array
	//search the "k" number from the array "a", and return it's location if exist
	public int location(int []a, int k) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] == k) {
				return i;
			}
		}
		return -1;
	}
	
	//a method calculates average of all odd numbers an array
	
	public double average(int []a) {
		double sum = 0.0;
		int count = 0;
		int i = 1;
		while (i < a.length) {
			if (a[i]%2 ==1) {
				sum += a[i];
				count++;
			}
			i++;
		}//end of the loop
		return sum / count;
	}
	
	
	
	
	public static void main(String[] args) {
		int p[] = {200, 1, 2, 3, 4, 5, 9000, 8, 7, 6, -4, -40, 600};
		w8ArrayMethods myArrayMethods = new w8ArrayMethods();
		myArrayMethods.printArray(p);
		
		int x[] = {1, 2, 3, 4};
		int y[] = {1, 2, 3, 4};
		
		int c[] = sumArray(x, y);
		System.out.println("Size of c is: " + c.length);
		
		myArrayMethods.printArray(c);
		System.out.println("Test the Sum 2");
		myArrayMethods.printArray(myArrayMethods.sumArray2(y, x));
		System.out.println("Test the merge array");
		myArrayMethods.printArray(myArrayMethods.merge(p, x));
		System.out.println("Test the max method:");
		System.out.println(myArrayMethods.max(p));
		
		int []w = {1, 2, 4, 6, 8, 10};
		
		System.out.println("Test sum of even numbers:");
		System.out.println(myArrayMethods.sumEven(x));
		
		System.out.println("Test location for 5: ");
		System.out.println(myArrayMethods.location(p, 5));
		
		System.out.println("Test location for -1: ");
		System.out.println(myArrayMethods.location(p, -1));
	
		System.out.println("Test average: ");
		System.out.println(myArrayMethods.average(p));
		
		
	}
}
