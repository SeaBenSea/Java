import java.util.Iterator;

public class Test implements IOne, ITwo, IThree {

	@Override
	public void printArray(int[] data) {
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i]);
		}
		
	}

	@Override
	public int[] commonArray(int[] one, int[] two) {
		// TODO Auto-generated method stub
		int temp[] = new int[one.length + two.length];
		for (int i = 0; i < one.length; i++) {
			for (int j = 0; j < one.length; j++) {
				if (one[i]==two[j]) {
					temp[i]=one[i];
				}
			}
		}
		return temp;
	}

	@Override
	public int[] unionArray(int[] one, int[] two) {
		// TODO Auto-generated method stub
		int temp[] = new int[one.length + two.length];
		for (int i = 0; i < one.length; i++) {
			temp[i]=one[i];
		}
		for (int i = 0; i < two.length; i++) {
			temp[i + one.length]=two[i];
		}
		return temp;
	}
	
	public static void main(String[] args) {
		Test obj = new Test();
		int array1[]= {1,2,3};
		int array2[]= {3,4,5};
		obj.printArray(obj.unionArray(array1, array2));
		System.out.println("\n");
		obj.printArray(array2);
		System.out.println("\n");
		obj.printArray(obj.commonArray(array1, array2));
	}

}
