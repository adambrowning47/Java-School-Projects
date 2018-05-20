package com.eclipse.AdamBrowning;
/**
 * 
 * @author Adam Browning
 * @version 6.7
 * @since 11-27-2017
 */
//public class for geometric object
public class geometricObjectAB {

	private String color = "blue"; //declared color of objects
	private boolean filled;//boolean declaring object filled
	private java.util.Date dateCreated;//declared method for date
	
	//constructor for date
	public geometricObjectAB() {
		dateCreated = new java.util.Date();
		
		
}
	//constructor for geometric objects
	public geometricObjectAB(String color, boolean filled) {
		
		
		this.color = color;//declared color
		this.filled = filled;//declared filled.
		
		
	}
	//getter for color
	public String getColor() {
		return color;
	}
	//setter for color
	public void setColor(String color) {
		this.color = color;
	}
	//return for filled
	public boolean isFilled() {
		return filled;
	}
	//setter for filled
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	//return for date created.
	public java.util.Date getDateCreated() {
		return dateCreated;
	}
	
	//string to display date and color and if object is filled.
	public String toString() {
		
		return "created on " + dateCreated + "\ncolor: " + color + " and filled: " + filled;
		
		
	}
	
}

