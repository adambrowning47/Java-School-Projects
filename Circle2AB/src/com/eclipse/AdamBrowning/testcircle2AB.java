package com.eclipse.AdamBrowning;
import java.util.Scanner;
/**
 * 
 * @author Adam Browning
 * purpose: Calculates the area of a circle, but will bring up an exception of user inputs a negative number.
 *
 */
public class testcircle2AB {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);//Input Scanner.
		
		circle2AB circle = new circle2AB();//circle2AB has a circle declared.
		System.out.print("Please enter the radius of a circle :");//user inputs a radius
		try {
			circle.setRadius(input.nextDouble());//users entered radius is stored.
			
		}
		catch (IllegalArgumentException ex) {
			System.out.println(ex);//if user enters less the 0 IllegalArgumentException message appears
		}
		
		System.out.println("With a radius of " + circle.getRadius() + " The Area of the circle is " + circle.findArea());//print statement that displays the radius user entered and area.
		
		
	}
}
