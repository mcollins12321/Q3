package main;

public class Triangle extends GeometricObject {
	private double side1 = 1.0;
	private double side2 = 1.0;
	private double side3 = 1.0;
	//defaults all triangle sides to 1.0

	public Triangle() {
		// TODO Auto-generated constructor stub

	}
	public Triangle (double side1, double side2, double side3) {
		this.side1=side1;
		this.side2=side2;
		this.side3=side3;
		//creates an instance of triangle with specified sides
	}
	

	/**
	 * @return the side1
	 */
	public double getSide1() {
		return side1;
	}
	/**
	 * @return the side2
	 */
	public double getSide2() {
		return side2;
	}
	/**
	 * @return the side3
	 */
	public double getSide3() {
		return side3;
	}
	
	public double getArea() {
		return (side1 + side2)/2; //calculates the area of the triangle
	}
	
	public double getPerimeter() {
		return side1 + side2 + side3; //calaculates the perimeter of the triangle
	}
	
	public String toString() {
		return "The triangle has sides of "+side1+", "+side2+", and "+side3+".  It has an area of "+getArea()+" and a perimeter of "+getPerimeter();
		//returns a string description of the triangle
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
