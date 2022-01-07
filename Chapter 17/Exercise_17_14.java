import java.io.*;
import java.util.Scanner;

public class Exercise_17_14 {
	public static void main(String[] args) throws Exception{
		Scanner getInput = new Scanner(System.in);
		
		System.out.println("Enter 1 to encrypt or 2 to decrypt");
		
		int action = getInput.nextInt();
		getInput.nextLine();
		
		System.out.println("Enter the input file name: ");
		File inputFileName = new File(getInput.nextLine());
		System.out.println("Enter the output file name: ");
		File outputFileName = new File(getInput.nextLine());
		
		try(
		BufferedInputStream in = new BufferedInputStream(new FileInputStream(inputFileName));
		BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(outputFileName));)
		{
			if (action == 1) {
				encrypt(in, out);
			}
			else if (action == 2) {
				decrypt(in, out);
			}
			else {
				System.out.println("What are you trying to do?");
			}
		}
	}
	public static void encrypt(BufferedInputStream in, BufferedOutputStream output){
		try{
			int value;
			while ((value = in.read()) != -1) {
				output.write(value + 5);
				//System.out.println(value + 5);
			}
		}
		catch(IOException ex){
			System.out.println("Files could not be opened");
		}
	}
	
	public static void decrypt(BufferedInputStream in, BufferedOutputStream output){
		try{
			int value;
			while ((value = in.read()) != -1) {
				output.write(value - 5);
				//System.out.println(value - 5);
			}
		}
		catch(IOException ex){
			System.out.println("Files could not be opened");
		}
	}
}