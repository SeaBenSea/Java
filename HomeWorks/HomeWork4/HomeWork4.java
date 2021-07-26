//Deniz Günenç 120200078
package HomeWorks;

import java.io.File;//for file opening
import java.io.PrintWriter;//for writing data to files 
import java.util.Scanner;//for reading the files

public class HomeWork4 {

	public void part1(String filename) {//method of part1
		int rowcount = 0;//creating row counter
		int row = 0;//creating row for some of while loops
		int column = 0;//crating column counter
		int index[] = new int[2];//creating index array of *
		double total = 0;//creating total value for sum of the * column's 
		double result = 0;//creating result data for average
		try {//try block for avoiding file open errors
			File file = new File(filename);//defining the file's name
			Scanner scan = new Scanner(file);//reading data inside of the file
			while (scan.hasNextLine()) {//loop for reading line by line
				String line = scan.nextLine();//creating line data for split it to columns
				String[] myarray = line.split(" ");//splitting the lines by spaces for getting the numbers and "*" easily	
				column = myarray.length;//defining the column count
				for (int i = 0; i < myarray.length; i++) {//loop for column
					if (myarray[i].equals("*")) {//if the column contains * 
						index[0] = rowcount;//defining the row of the *
						index[1] = i;//defining the column of the *
					}
				}
				rowcount++;//increasing the row count value
				}
			scan.close();//closing the scanner
		}
		catch (Exception e) {//catch block for catching the errors
			System.out.println(e.getMessage());//printing the catch error
		}
		double temparray[][] = new double[rowcount][column];//creating temporary array for matrix
		try {//try block for avoiding file open errors
			File file = new File(filename);//defining the file's name
			Scanner scan = new Scanner(file);//reading data inside of the file
			while (scan.hasNextLine()) {//loop for reading line by line
				String line = scan.nextLine();//creating line data for split it to columns
				String[] myarray = line.split(" ");//splitting the lines by spaces for getting the numbers and "*" easily		
				if (row != index[0]) {//if block for checking the correct column
					double number = Double.parseDouble(myarray[index[1]]);//defining the numbers from split array
					total += number;//increasing the total with missing column's numbers
				}
				row++;//increasing the row value
				}
			scan.close();//closing the scanner
		}
		catch (Exception e) {//catch block for catching the errors
			System.out.println(e.getMessage());//printing the catch error
		}
		result = total / (rowcount-1);//finding the average
		try {//try block for avoiding file open errors
			row = 0;//setting row 0 for the loop
			File file = new File(filename);//defining the file's name
			Scanner scan = new Scanner(file);//reading data inside of the file
			while (scan.hasNextLine()) {//loop for reading line by line
				String line = scan.nextLine();//creating line data for split it to columns
				String[] myarray = line.split(" ");//splitting the lines by spaces for getting the numbers and "*" easily
				if (line.contains("*")) {//if block for *
					for (int i = 0; i < myarray.length; i++) {//loop for column
						if (myarray[i].contains("*")) {//if the column contains *
							temparray[row][i] = result;//changing to the average
						}else {//if the column contains number
							temparray[row][i] = Double.parseDouble(myarray[i]);//storing the numbers in the temporary array
						}
					}
				}else {//else block for numbers
					for (int i = 0; i < myarray.length; i++) {//loop for column
						temparray[row][i] = Double.parseDouble(myarray[i]);//storing the numbers in the temporary array
					}
				}
				row++;//increasing the row count value
				}
			scan.close();//closing the scanner
		}
		catch (Exception e) {//catch block for catching the errors
			System.out.println(e.getMessage());//printing the catch error
		}
		File file = new File(filename);//selecting the file
		try {//try block for avoiding file open errors
			PrintWriter writer = new PrintWriter(file);//writing the data to file
			for (int i = 0; i < temparray.length; i++) {//row loop
				for (int j = 0; j < temparray[0].length; j++) {//column loop
					writer.write("" + temparray[i][j] + " ");//writing the datas from temporary array to file
				}
				writer.write("\n");//writing new line for every row
			}
			writer.flush();//Flushes the output stream and forces any buffered output bytes to be written out.
			writer.close();//closing writer
		}
		catch (Exception e) {//catch block for catching the errors
			System.out.println(e.getMessage());//printing the catch error
		}
		for (int i = 0; i < temparray.length; i++) {//row loop
			for (int j = 0; j < temparray[0].length; j++) {//column loop
				System.out.print(("" + temparray[i][j] + " "));//printing the datas from temporary array to console
			}
			System.out.println("");//printing new line for every row
		}
		System.out.println("rowcount: " + rowcount + " column: " + column + " index: " + index[0] + "," + index[1] + " result: " + result);
	}
	
	public String part2(String filename, int shift) {//method of part2
		String secretmsg = "";//creating secret message value for appending the decrypted chars
		String alphabet = "abcdefghijklmnopqrstuvwxyz";//alphabet string for decryption
		char ch;//creating ch variable for getting message char by char
		int realshift = shift % 26;//creating real shift value for bigger shift numbers
		try {//try block for avoiding file open errors
			File file = new File(filename);//defining the file's name
			Scanner scan = new Scanner(file);//reading data inside of the file
			while (scan.hasNextLine()) {//loop for reading line by line
				String message = scan.nextLine();//reading the encrypted messages from file
				for(int i = 0; i < message.length(); ++i){//loop for reaching all the characters in the file
					ch = message.charAt(i);//defining the char to a variable for the readability
					if(alphabet.contains("" + ch)){//checking for the lower characters
						if (alphabet.indexOf(ch) < realshift) {//if block
							ch = alphabet.charAt(( alphabet.indexOf(ch) + 26 - realshift));//if the index of char in the alphabet is less than shift adding 26 
							secretmsg += ch;//adding the decrypted char to message string
						}else {//else block
							ch = alphabet.charAt(( alphabet.indexOf(ch) - realshift));//if the index of the char in the alphabet is more than shift decrypting normally
							secretmsg += ch;//adding the decrypted char to message string
						}	
			        }
					else {//else block
						secretmsg += ch;//if the input char is not a lower case alphabet character doesn't changing anything
			        }
				}
				secretmsg += "\n";//creating new line for every lines
			}				
			scan.close();//closing the scanner
		}
		catch (Exception e) {//catch block for catching the errors
			System.out.println(e.getMessage());//printing the catch error
		}
		return secretmsg;//returning the decrypted message
	}
	
	public void part3(String filename) {//part3 method
		int number =0;
		String emptystring = "";//crating empty string for append the wrong operations easily
		try {//try block for avoiding file open errors
			File file = new File(filename);//defining the file's name
			Scanner scan = new Scanner(file);//reading data inside of the file
			while (scan.hasNextLine()) {//loop for reading line by line
				double result;//crating result variable for store only the results of the operations
				String line = scan.nextLine();//creating line data for split it two operation part and result part
				String[] myarray1 = line.split("=");//splitting the operation and crating an array for store it
				result = Double.parseDouble(myarray1[1]);//getting the result part and storing it in the result variable
				if (myarray1[0].contains("+")) {//checking operation
					String[] myarray2 = myarray1[0].split("\\+");//splitting the operation for getting numbers easily using "\\" for escape (causes error regular expression)
					if (( Double.parseDouble(myarray2[0]) +  Double.parseDouble(myarray2[1])) != result) {//checking the equation
						emptystring += (line + "\n");//if it is wrong appending it to empty string for returning end of the method
					}
				}else if (myarray1[0].contains("-")) {//checking operation
					String[] myarray2 = myarray1[0].split("-");//splitting the operation for getting numbers easily
					if (( Double.parseDouble(myarray2[0]) -  Double.parseDouble(myarray2[1])) != result) {//checking the equation
						emptystring += (line + "\n");//if it is wrong appending it to empty string for returning end of the method
						number++;
					}
				}else if (myarray1[0].contains("*")) {//checking operation
					String[] myarray2 = myarray1[0].split("\\*");//splitting the operation for getting numbers easily using "\\" for escape (causes error regular expression)
					if (( Double.parseDouble(myarray2[0]) *  Double.parseDouble(myarray2[1])) != result) {//checking the equation
						emptystring += (line + "\n");//if it is wrong appending it to empty string for returning end of the method
					}
				}else if (myarray1[0].contains("/")) {//checking operation
					String[] myarray2 = myarray1[0].split("/");//splitting the operation for getting numbers easily
					if (( Double.parseDouble(myarray2[0]) /  Double.parseDouble(myarray2[1])) != result) {//checking the equation
						emptystring += (line + "\n");//if it is wrong appending it to empty string for returning end of the method
					}
				}else if (myarray1[0].contains("%")) {//checking operation
					String[] myarray2 = myarray1[0].split("%");//splitting the operation for getting numbers easily
					if (( Double.parseDouble(myarray2[0]) %  Double.parseDouble(myarray2[1])) != result) {//checking the equation
						emptystring += (line + "\n");//if it is wrong appending it to empty string for returning end of the method
					}
				}else {//unknown operation symbol
					emptystring += "Unknown operation\n";//if it is unknown operation appending it to empty string for returning end of the method
				}
			}
			scan.close();//closing the scanner
		} catch (Exception e) {//catch block for catching the errors
			System.out.println(e.getMessage());//printing the catch error
		}
		System.out.println(emptystring);//returning the only wrong equations
		System.out.println(number);
	}
	
	public static void main(String[] args) {
		HomeWork4 obj = new HomeWork4();//creating object for reaching methods
		System.out.println("\n- PART 1 TEST -\n");
		obj.part1("example_question01.txt");//method part1 test
		System.out.println("------------------------------");
		System.out.println("\n- PART 2 TEST WITH SHIFT: 19 -\n");
		System.out.println(obj.part2("example_question02.txt", 19));//method part2 test
		System.out.println("------------------------------");
		System.out.println("\n- PART 3 TEST -\n");
		obj.part3("example_question03.txt");//method part3 test
		System.out.println("------------------------------");
	}
}