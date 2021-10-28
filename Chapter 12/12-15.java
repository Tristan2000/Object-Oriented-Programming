/*
Tristan Jones
10/27/2021
*/
import java.util.Scanner;
import java.io.*;
import java.sql.*;

class Untitled {
	public static void main(String[] args) throws IOException{
		//create file
		java.io.File file = new java.io.File("Exercise12_15.txt");
		//Check if the file exists
		if (file.exists()){
			System.out.println("File already exists");
			System.exit(1);
		}
		//create random integers
		double[] random = new double[100];
		for (int i = 0; i < random.length; i++){
			random[i] = Math.random() * 100;
		}
		
		//Sort integers
		java.util.Arrays.sort(random);
		//write into file
		java.io.PrintWriter output = new java.io.PrintWriter(file);
		for (int j = 0; j < random.length; j++){
			output.print(random[j] + " ");
		}
		output.close();
	
		
		//Reading data
		Scanner input = new Scanner(file);
		for(int m = 0; m < random.length; m++){
			double print = input.nextDouble();
			System.out.print(print + " ");
		}

		input.close();
		
	}
	
	
}