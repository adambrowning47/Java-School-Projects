package com.eclipse.AdamBrowning;

public class circle2AB {
	  private double radius;//declared double for radius

	  
	 

	//constructor for circle
	  public circle2AB() {
	    this(0);
	  }

	//constructor for circle.
	  public circle2AB(double newRadius) {
	    setRadius(newRadius);
	 
	  }

	  //getter for the radius
	  public double getRadius() {
	    return radius;
	  }

	  //setter for radius with exceptions.
	  public void setRadius(double newRadius)
	      throws IllegalArgumentException {
	    if (newRadius >= 0)//if radius is greater then zero
	      radius = newRadius;
	    else
	      throw new IllegalArgumentException(
	        "I'm sorry, a radius cannot be a negative. Try agian."); //else IllegalArgumentException message appears.
	  }

	
	

	  //findArea method for finding the area of the users inputed radius
	  public double findArea() {
	    return radius * radius * Math.PI;
	  }
}
