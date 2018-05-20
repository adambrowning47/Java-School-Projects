package com.eclipse.AdamBrowning;

/**
 * 
 * @author Adam Browning
 * @version 6.7
 * @since 11-27-2017
 */



//public class for circle that extends from geometricObjectAB
public class circleAB extends geometricObjectAB {


private double radius;//declared variable for radius
//constructor for circle
public circleAB() {
	
	this.radius = 1.0;//
	
}
//constructor
public circleAB(double radius) {
	super();
	this.radius = radius;
	
	
}
//constructor
public circleAB(double radius, String color, boolean filled) {
	
	super(color, filled);
	this.radius = radius;
	
}
//getter for radius
public double getRadius() {
	return radius;
}
//setter for radius
public void setRadius(double radius) {
	this.radius = radius;
}
//getter for area with equation
public double getArea() {
	
	return radius * radius * Math.PI;
	
}

//getter for diameter with equation
public double getDiameter() {
	return 2 * radius;
	
}
//getter for perimeter with equation.
public double getPerimeter() {
	return 2 * radius * Math.PI;
	
	
}
}

	

