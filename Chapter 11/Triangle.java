/*
Tristan Jones
9/27/2021
*/
import java.util.Scanner;
public class Triangle extends SimpleGeometricObject 
	{
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the length of each side of the triangle: ");
		double side1 = input.nextDouble();
		double side2 = input.nextDouble();
		double side3 = input.nextDouble();
		String color = "white";
		String fill = " ";
		System.out.print("Enter the color of the triangle: ");
		color = input.next();
		boolean filled = false;
		System.out.print("Is the Triangle filled? Yes or No: ");
		fill = input.next();
		
		SimpleTriangle newTriangle = new SimpleTriangle(side1, side2, side3, color, filled);
		newTriangle.setColor(color);
		newTriangle.setFilled(filled);
		if(fill.compareToIgnoreCase("Yes") == 0){
			filled = true;
		}
		System.out.println(newTriangle.color);
		System.out.println(newTriangle.getPerimeter());
		System.out.println(newTriangle.getArea());
		System.out.println(newTriangle.toString());
		System.out.println(newTriangle.dateCreated);
		
	}
}
class SimpleTriangle extends SimpleGeometricObject{
	double side1 = 1.0;
	double side2 = 1.0;
	double side3 = 1.0;
	//default constructor
	SimpleTriangle(){

	}
	//set the sides
	SimpleTriangle(double newSide1, double newSide2, double newSide3, String color, boolean filled){
		super(color, filled);
		side3 = newSide3;
		side2 = newSide2;
		side1 = newSide1;
		setColor(color);
		setFilled(filled);
	}
	//return area
	double getArea(){
		double s = (side1 + side2 + side3) / 2;
		double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
		return area;
	}
	//return perimeter
	double getPerimeter(){
		return side1 + side2 + side3;
	}
	// to string method
	public String toString(){
		return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
	}
}