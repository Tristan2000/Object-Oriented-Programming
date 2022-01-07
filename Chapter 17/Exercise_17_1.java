import java.io.*;

class Untitled {
	public static void main(String[] args) throws IOException{
		//Create the writer
		PrintWriter output = new PrintWriter(new FileOutputStream("Exercise17_01.txt", true));
		//Create string
		String randomString;
		//for loop to print out the integers
		for(int i = 0; i <= 99; i ++){
			//Create a random int
			int randomInt = (int)(Math.random() * 50);
			randomString = String.valueOf(randomInt);
			output.print(randomString + " ");
			
		}
		output.close();
		
	}
}