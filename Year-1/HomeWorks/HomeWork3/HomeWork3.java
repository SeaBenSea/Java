package HomeWorks;

import java.lang.Math;//importing math library for sin. cos. etc.

public class HomeWork3 {
	
	public double[][] mult(double a[][], double b[][]){//matrix multiplication method
		
		double [][] temp = new double[a.length][b[0].length];//creating temporary array for store the multiplication results
		
		for (int i = 0; i < a.length; i++) {//loop for a array's row 
		    for (int j = 0; j < b[0].length; j++) { //loop for b array's column
		        for (int k = 0; k < a[0].length; k++) { //loop for a array's column
		            temp[i][j] += a[i][k] * b[k][j];//multiplying and summing the results (matrix multiplication)
		        }
		    }
		}
		return temp;//returning temporary array
	}
	
	public void printTable(double a[][]) {//method for printing table
		for (int i = 0; i < a.length; i++) {//table row for loop
			for (int j = 0; j < a[0].length; j++) {//table column for loop
				System.out.print(a[i][j] + " ");//printing the table
			}
			System.out.println();//for next line
		}
	}
	
	
	public void rotate(double degree, double e[][]) {//rotate method
		double radian = Math.toRadians(degree);//converting degree to radians for math library
		double [][] temp = new double[2][1];//creating a new temp array for store points in a correct way
		double rotationarray[][] = {{Math.cos(radian), -Math.sin(radian)},{Math.sin(radian),Math.cos(radian)}};//creating rotation matrix array formula
		
		for (int i = 0; i < e.length; i++) {//loop for a array's row 
			temp[0][0] = e[i][0] ;//defining temp arrays elements from given point array
			temp[1][0] = e[i][1] ;//defining temp arrays elements from given point array
			System.out.print(mult(rotationarray, temp)[0][0]);//printing the rotated point's x
			System.out.println("	" +mult(rotationarray, temp)[1][0]);//printing the rotated point's x
		}
	}
	
		
	public double[][] equationsolver(double x[][], double y[]) {//equation solver method

		double a = x[0][0];//defining a for readability of the code
		double b = x[0][1];//defining b for readability of the code
		double c = x[1][0];//defining c for readability of the code
		double d = x[1][1];//defining d for readability of the code
		double y2[][] = {{y[0]},{y[1]}};//defining y2 for readability of the code
		
		double determinant = 1 / ((a * d) - (b * c));//formula of determinant
		double inverse[][] = {{d, -b},{-c, a}} ;//finding inverse of the matrix
		
		double result[][] = mult(mult2(inverse, determinant), y2);//solving the equation with inverse matrix method
		
		return result;//returning result array
	}
	
	public double[][] mult2(double a[][], double b){//multiplication 2 method
		double[][] result=new double[a.length][a[0].length];//creating result array with same length of tables row and column
			
		for (int i = 0; i < a.length; i++) {//table row for loop
			for (int j = 0; j < a[0].length; j++) {//table column for loop
				result[i][j]= a[i][j] * b;//multiplying the table variables with number
			}
		}
		return result;//returns result array table
	}
	
	public static void main(String[] args) {//main
		
		HomeWork3 obj = new HomeWork3();//creating object for reaching methods
		
		double b[][] = {{1,4,-2}, {2,6,3}};//example matrix a
		double a[][] = {{1,2},{4,6},{-2,3}};//example matrix b
		
		double c[][] = {{6, -2},{5, 3},{4, 8},{-2, 3}};//example matrix e
		
		double x[][] = {{0.82,0.53}, {4.34,4.38}};//example matrix c
		double y[] = {7.42,6.30};//example matrix d
		
		
		
		System.out.println("-----------");
		obj.printTable(obj.mult(a, b));//running matrix multiplication
		System.out.println("-----------");
		obj.rotate(72, c);//running matrix rotation
		System.out.println("-----------");
		obj.printTable(obj.equationsolver(x, y));//running equation solver
	}
}
