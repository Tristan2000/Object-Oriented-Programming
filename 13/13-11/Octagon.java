public class Octagon {
	public static void main(String[] args) {
		double side = 1;
		String color = "white";
		String fill = " ";
		boolean filled = false;
		
		
		
		
		SimpleOctagon newOctagon = new SimpleOctagon(side, color, filled);
		newOctagon.setColor(color);
		if(fill.compareToIgnoreCase("Yes") == 0){
			filled = true;
		}
		//newOctagon.setFilled(filled);

		SimpleOctagon newOctagon2 = ((SimpleOctagon)newOctagon.clone());
		System.out.println(newOctagon.compareTo(newOctagon2));
		
	}
}
class SimpleOctagon extends GeometricObject implements Comparable<SimpleOctagon>, Cloneable{
	double side = 1;
	//compareTo override
	@Override
	public int compareTo(SimpleOctagon o) {
		if (this.side > o.side) {
			return 1;
		}
		else if (this.side < o.side){
			return -1;
		}
		else
			return 0;
	}
	//clone override
	@Override
	public Object clone(){
		try{
			return super.clone();
		}
		catch(CloneNotSupportedException ex){
			return null;
		}
		
	}
	//constructor
	SimpleOctagon(double newSide, String color, boolean filled){
		super(color, filled);
		side = newSide;
	}
	//abstract from GeometricObject
	public double getArea(){
		double area = (2 + (4 / Math.sqrt(2)) * side * side);
		return area;
	}
	public double getPerimeter(){
		return side * 8;
	}
	
}