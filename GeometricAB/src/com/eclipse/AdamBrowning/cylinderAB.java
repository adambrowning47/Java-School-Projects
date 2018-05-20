package com.eclipse.AdamBrowning;

/**
 * 
 * @author Adam Browning
 * @version 6.7
 * @since 11-27-2017
 */


//cylinder class that extends to circleAB
public class cylinderAB extends circleAB  {
	private double height;//private double for height
	private java.util.Date dateCreated; //date creating function
	//constructor
	public cylinderAB() {
		super(); //invokes the superclass constructor circleAB()
		this.height = 1.0;//declared height for cylinder
		dateCreated = new java.util.Date();//date created
	}
	
	
	//constructor
	public cylinderAB(double height, double radius) {
		super(radius); //invoked superclass for circleAB(radius)
		this.height = height;//declared height.
		dateCreated = new java.util.Date();
		
	}
	//constructor
	public cylinderAB(double height, double radius, String color, boolean filled) {
		super(radius, color, filled);//invokes superclass from circleAB(radius, color, and boolean filled)
		this.height = height;
		
		
	}
	//getter for height
	public double getHeight() {
		return this.height; //returns height
		
		
	}
	//setter for height
	public void setHeight(double height) {
		this.height = height;
		
		
	}
	//function for figuring out the volume of cylinder
	public double getVolume() {
		return getArea() * height;
		
		
	}
	//return storing the date created
	public java.util.Date getDateCreated() {
		return dateCreated;
	}
	//string to display when cylinder is created.
	public String toString() {
		return "created on " + dateCreated;
		
	}

}
