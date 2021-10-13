public class SimpleGeometricObject {
	String color = "white";
	boolean filled;
	java.util.Date dateCreated;

	public static void main(String[] args) {
			
		}
	
	/** Construct a default geometric object */
	public SimpleGeometricObject() {
	dateCreated = new java.util.Date();
	}

	/** Construct a geometric object with the specified color 
	*  and filled value */
	public SimpleGeometricObject(String color, boolean filled) {
		dateCreated = new java.util.Date();
		this.color = color;
		this.filled = filled;
		}
		
	/** Return color */
	public String getColor() {
		return color;
	}

	/** Set a new color */
	public void setColor(String color) {
		this.color = color;
		}

	/** Return filled. Since filled is boolean, 
		its getter method is named isFilled */
	public boolean isFilled() {
		return filled;
	}

	/** Set a new filled */
	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	/** Get dateCreated */
	public java.util.Date getDateCreated() {
		return dateCreated;
	}
	
	/** Return a string representation of this object */ 
	public String toString() {
		return "created on " + dateCreated + "\ncolor: " + color + 
			" and filled: " + filled;
	}
}