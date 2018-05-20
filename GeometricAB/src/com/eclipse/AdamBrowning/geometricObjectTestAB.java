package com.eclipse.AdamBrowning;
/**
 * 
 * @author Adam Browning
 * @version 6.7
 * @since 11-27-2017
 */

// main class that test the geometry of 
public class geometricObjectTestAB {
	//main method
	public static void main(String[] args) {
		circleAB circle = new circleAB(3);//circle with a radius of 3.
		System.out.println("A circle " + circle.toString()); //Pulls the string for geometricObjectAB
		System.out.println("The radius is " + circle.getRadius()); //pulls radius from circleAB. displays radius
		System.out.println("The area is " + circle.getArea()); //pulls area from circleAB. Displays area.
		System.out.println("The diameter is " + circle.getDiameter()); //pulls the diameter from cricleAB. Displays diameter
		
		
		rectangleAB rectangle = new rectangleAB(5, 7); //rectangle with a width of 5 and a height of 7
		System.out.println("\nA Rectangle " + rectangle.toString());//displays string from rectangleAB. 
		System.out.println("the area is " + rectangle.getArea()); //pulls area from rectangleAB. Displays area.
		System.out.println("The perimeter is " + rectangle.getPerimeter()); //pulls perimeter from rectangleAB. Displays the Perimeter.
		
		cylinderAB cylinder = new cylinderAB(3, 6); //cylinder with a radius of 3 and a height of 6.
		System.out.println("\nA cylinder " + cylinder.toString()); //displays string from cylinderAB
		System.out.println("The height is " + cylinder.getHeight()); //pulls height from cylinderAB. displays the height
		System.out.println("The radius is " + cylinder.getRadius());//pulls radius from cylinderAB. displays radius
		System.out.println("The area is " + cylinder.getArea()); //pulls area equation from cylinderAB. Displays area
		System.out.println("The volume is " + cylinder.getVolume()); //shows volume of cylinder.
		
		
		
		
	}
}