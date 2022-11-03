package studio7;

public class Rectangle {
	double length,width,area,perimeter;
	
	public Rectangle(double length, double width) {
	this.length = length;
	this.width = width;
	this.area=this.length*this.width;
	this.perimeter=(this.length+this.width)*2.0;
	}
	
	public double GetArea() {
		return this.area;
	}

	public double GetPerimeter() {
		return this.perimeter;
	}
	
	public boolean SmallerOrBigger(Rectangle Rectangle) {
		return this.area<Rectangle.area;
	}
	
	public boolean SquareOrNot() {
		return this.length==this.width;
		
	}
}
