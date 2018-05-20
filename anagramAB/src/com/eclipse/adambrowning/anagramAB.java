package com.eclipse.adambrowning;
import java.util.Scanner;
// Important statements.

/**
 * @author Adam Browning
 * @version 1.0
 *
 */

public class anagramAB {
	//boolean method for String 1 and string 2. 
	private double radius; 
	
	public Circle() {
		radius = 0;
		
		
		
		
	}
		public Circle(double newRadius) {
			this.radius = newRadius;
			
		}
	
		double getArea() {
			return Math.PI * radius * radius;
		}
		
		double getPerimeter() {
			
			return 2 * Math.PI * radius;
			
		}
		
		public void setRadius(double newRadius) {
			this.radius = newRadius;
			}

}

