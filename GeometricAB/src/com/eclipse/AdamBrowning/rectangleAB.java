package com.eclipse.AdamBrowning;
/**
 * 
 * @author Adam Browning
 * @version 6.7
 * @since 11-27-2017
 */
//public class for rectangle that extends from geometricObjectAB
public class rectangleAB extends geometricObjectAB{

	private double width;//declared width
	private double height;//declared height


	//Constructor for rectangle
	public rectangleAB(double width, double height) {
		
		this.width = width;//declared width as this.width
		this.height = height;//declared height as this.height
		
		
	}
	//constructor for rectangle with declared width height color and if object is filled.
	public rectangleAB(double width, double height, String color, boolean filled) {
		
		this.width = width;//declared width as this.width
		this.height = height;//declared height as this.height
		setColor(color);//color set.
		setFilled(filled);//filler set
		
	}
	//getter for width
	public double getWidth() {
		return width;
	}
	//setter for width
	public void setWidth(double width) {
		this.width = width;
	}
	//getter for height
	public double getHeight() {
		return height;//height returned
	}
	//setter for height
	public void setHeight(double height) {
		this.height = height;
	}
	//getter for area with equation 
	public double getArea() {
		
		return width * height;
		
		
	}
	//getter for perimeter with equation
	public double getPerimeter() {
		return 2 * (width + height);
		
	}
	
}
