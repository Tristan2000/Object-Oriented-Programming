
interface Colorable{
	public void howToColor();
}

public abstract class GeometricObject {
	protected String color = "white";
	protected boolean filled;

	public static void main(String[] args) {
			
		}

	//default constructor
	protected GeometricObject(String color, boolean filled) {
		this.color = color;
		this.filled = filled;
		}
		
	//return color
	public String getColor() {
		return color;
	}

	//set color
	public void setColor(String color) {
		this.color = color;
		}

	//return filled
	public boolean isFilled() {
		return filled;
	}

	//set filled
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	//declare abstracts
	public abstract double getArea();
	public abstract double getPerimeter();
}