//Deniz Günenç 120200078
package Test;

import StringArrayOps.Operations;//importing the operations class from the StringArrayOps package

public class Test {
	/*
	 	Encapsulation: It is basically data hiding. If you create private variables they can not be accessible from outside of the class.
	 But if you create get and set methods. They are now accessible from outside of the class.
	 	Packaging: There are two types of packaging 1) Built-in packages, 2)User-defined packages.
	 A package is ideal for grouping the related types of works. Packages are good for the avoid name conflicts.
	 */
	public static void main(String[] args) {//main method
		String a[]= {"deniz", "günenç", "Bilgi"};//creating string array
		String b[]= {"günenç", "deniz", "Istanbul"};//creating string array
		Operations ops = new Operations();//creating object
		System.out.println("--Test Op1--");
		System.out.println(ops.Op1(a, b));//testing method 1
		System.out.println("--Test Op2--");
		System.out.println(ops.Op2(a, b));//testing method 2
		System.out.println("--Test Op3--");
		System.out.println(ops.Op3(a, b));//testing method 3
		System.out.println("--Test Op4--");
		System.out.println(ops.Op4(a, b));//testing method 4
		System.out.println("--Test Op5--");
		System.out.println(ops.Op5(a, b));//testing method 5		
	}
}
