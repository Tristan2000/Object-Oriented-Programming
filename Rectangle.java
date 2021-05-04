/*
Author: Tristan Jones
Date: 4/28/2021
*/
import java.util.Scanner;
public class Rectangle {
	public static void main(String[] args) {
		SimpleRectangle rectangle1 = new SimpleRectangle();
		SimpleRectangle rectangle2 = new SimpleRectangle(3.5, 35.9);
		System.out.println("The width of the rectangle is: " + rectangle1.width + " The height of the rectangle is: " + rectangle1.height + " The area of the rectangle is: " + rectangle1.getArea() + " The perimeter of the rectangle is: " + rectangle1.getPerimeter());
		System.out.print("The width of the rectangle is: " + rectangle2.width + " The height of the rectangle is: " + rectangle2.height + " The area of the rectangle is: " + rectangle2.getArea() + " The perimeter of the rectangle is: " + rectangle2.getPerimeter());
	}
}

class SimpleRectangle{
	double width;
	double height;
	
	SimpleRectangle(){
		width = 4;
		height = 40;
	}
	SimpleRectangle(double newWidth, double newHeight){
		width = newWidth;
		height = newHeight;
	}
	
	double getArea(){
		return width * height;
	}
	
	double getPerimeter(){
		return 2 * width + 2 * height;
	}
}
