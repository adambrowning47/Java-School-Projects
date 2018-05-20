package com.eclipse.AdamBrowning;
import java.util.Scanner;
//Author: Adam Browning
//Date: 9 OCT 2017
/*Purpose: the purpose of this program is for the user to select a type of math question from the menu by entering a number. 
The user will then be looped back to the main menu after they have entered the correct answer.*/

//Main public class
public class MathtutorAB {
	public static void main(String[] args){
		
		//Scanner utility for inputs.
		Scanner input = new Scanner(System.in);
		
		//Defined random number generators for the various areas.
		int number1 = (int) (Math.random() * 10);
		int number2 = (int) (Math.random() * 10);
		
		//Makes sure that there will not be a negative answer.
		if (number1 < number2) {
			int temp = number1;
			number1 = number2;
			number2 = temp;
		}
		
		//defined loops for the various areas
		boolean conLoop = true;
		boolean stopLoop = false;
		
		System.out.println("Welcome to the ultimate math tutor program(Trademark pending)!\n"
				+ "This prgram will help you prepare for an upcoming math test.\n"
				+ "Just follow the instruction that in the main menu.\n");
		
		//System main menu with instruction on what to press for where the user wants to go.
		do {
		System.out.print("--------------------\n");
		System.out.print("Main Menu\n");
		System.out.print("Addition = 1\n");
		System.out.print("Subtraction = 2\n");
		System.out.print("Multiplication = 3\n");
		System.out.print("Division = 4\n");
		System.out.print("Exit = 5\n");
		System.out.print("--------------------");
		
		//input for user to go where they would like to go.
		System.out.print("\nPlease select where you want to go: ");
		int choice = input.nextInt();
		

		//if user enters 1 they will be taken to an addition question.
		if (choice == 1) {
			System.out.print("What is " + number1 + " + " + number2 + " = ");
			int answer = input.nextInt();
			{
			while (number1 + number2 != answer){
				System.out.print("Wrong try again. What is " + number1 + " + " + number2 + " ? ");//will repeat question till the user enters the right answer
				answer = input.nextInt();
		
				
			} 
			System.out.println("correct answer.");
			
			}
		}
		//If they enter 2 they will be given a subtraction question.
		else if (choice == 2){
			System.out.print("What is " + number1 + " - " + number2 + " ? : ");
			int answer = input.nextInt();
			while (number1 - number2 != answer) {
				System.out.print("Wrong answer. Try again. What is " + number1 + " - " + number2 + " ?");//will repeat question till the user enters the right answer
				answer = input.nextInt();
			}
			System.out.println("Correct answer.");
		}
		//If the user enters a 3, they are given a multiplication problem.
		else if (choice == 3) {
			System.out.print("What is " + number1 + " * " + number2 + " ? ");
			int answer = input.nextInt();
			while (number1 * number2 != answer){
				System.out.println("Wrong answer. Try again what is " + number1 + " * " + number2 + " ? ");//will repeat question till the user enters the right answer
				answer = input.nextInt();
			}
			System.out.println("Correct answer.");
			
		}
		//User enters 4 and are given a division question.
		else if (choice == 4){
			System.out.print("What is " + number1 + " / " + number2 + " ? ");
			int answer = input.nextInt();
			while (number1 / number2 != answer){
				System.out.println("Wrong answer Try again. What is " + number1 + " / " + number2 + " ? ");//will repeat question till the user enters the right answer
				answer = input.nextInt();
				
			}
		
		System.out.println("Correct answer");
		} 	
		//if user enters 5, the program exits.
		if (choice == 5){
			while (stopLoop == false) {
			System.out.println("Thanks for using this program.");
			break;
		}break;
		
		}
		}while (conLoop == true);	
		
	}	
}			

		
		
	


