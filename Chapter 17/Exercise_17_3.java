import java.io.*;
class Untitled {
	public static void main(String[] args) {
		int total = 0;
		try(
			DataOutputStream output = new DataOutputStream(new FileOutputStream("Exercise_17_03.dat", true));
			
		){
			for(int i = 0; i <= 99; i ++){
			//Create a random int
			int randomInt = (int)(Math.random() * 50);
			output.writeInt(randomInt);
			}
		}
		catch(IOException ex){
			ex.printStackTrace();
		}
		
		try(
			DataInputStream input = new DataInputStream(new FileInputStream("Exercise_17_03.dat"));
		){
			while(true){
				int read = input.readInt();
				total = total + read;
			}
		}
		catch(EOFException ex){
			System.out.println("End reached");
		}
		catch(IOException ex){
			ex.printStackTrace();
		}
		System.out.print(total);
	}
}