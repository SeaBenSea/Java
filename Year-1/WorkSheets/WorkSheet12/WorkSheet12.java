import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class WorkSheet12 {
	
	public String converter(double meter) {//converter method
		double yard = 1.094 * meter;//formula for meter to yard
		double foot = 3.281 * meter;//formula for meter to foot
		double inch = 39.37 * meter;//formula for meter to inch
		
		//printing the all of conversion results
		return "\n------------------------------\n" + meter + " Meter" + "\nto Yard: " + yard + "\nto Foot: " + foot + "\nto Inch: " + inch;		
	}
	
	public void writetofile(double meter) throws IOException {//writing the conversion result to file "conversionresults.txt"
		FileWriter file = new FileWriter("conversionresults.txt" , true);//choosing file
		try {//try block for exceptions
			PrintWriter writer = new PrintWriter(file);//helper method for the writing 
			writer.write(converter(meter));//writes the input to file
			writer.flush();//forces data to be written
			writer.close();//closes the file
			
		} catch (Exception e) {//catch block for exceptions
			System.out.println(e.getMessage());//printing the error message
		}
	}
	
	public void readfromfile() {//reads the result from file "conversionresults.txt"
		
		try {//try block for exceptions
			File file = new File("conversionresults.txt");//choosing file
			Scanner scan = new Scanner(file);//reads file with using scanner
			
			while (scan.hasNextLine()) {//loop for scan all the lines
				String k = scan.nextLine();//scanning the line
				System.out.println(k);//printing the scanned line in the console
			}
		}catch (Exception e) {//catch block for exceptions
			System.out.println(e.getMessage());//printing the error message
		}
	}
	
	public static void main(String[] args) throws IOException {
		WorkSheet12 obj = new WorkSheet12();//creating object for reaching the methods
		
		System.out.println("Converter method");
		System.out.println(obj.converter(5));//running the converter method
		System.out.println("Writing the result to file");
		obj.writetofile(5);//running the write to file method
		System.out.println("Writing is done");
		System.out.println("------------------------------");
		System.out.println("Reading from file method");
		obj.readfromfile();//running the read from file method
	}
}
