import java.util.Scanner;
//Author: Adam Browning
//Date: 25 Sept. 2017.
//Purpose: Word game where the computer draws a random number, and the user inputs a number.

public class RockPaperScissorsLizardSpockAB {
	public static void main(String[] args) {
		
		
		//Random number generator where the computer pick a number.
		int comp = (int) (Math.random() * 4);
		
	
		//Into telling the user how to play the game. and giving them the definitions for each number.
		System.out.println("Welcome to Rock, Paper, Scissor, Lizard, Spock(TM). You will be prompted to input a number.");
		System.out.println("The definitions are: 0 = Rock, 1 = paper, 2 = scissors, 3 = lizard and 4 = Spock.  ");
		
		//user enters the number
		System.out.print("Please enter your number: ");
		Scanner input = new Scanner(System.in);
		int user = input.nextInt();
		
		//The if/else statements depending on what number the computer generates and what number the user enters.
		if (user == 0 && comp == 1) { 
			System.out.print("Your are rock. the computer is Paper. Computer win. ");}
			
		else if (user == 0 && comp == 2)
				System.out.print("Your are rock, computer is scissors. Computer wins.");
			
		else if (user == 0 && comp == 3)
				System.out.print("You are rock, computer is lizard. You win.");
			
		else if (user == 0 && comp == 4)
				System.out.print("You are rock, computer is Spock. Computer wins.");
			
		else if (user == 1 && comp == 0)
				System.out.print("You are paper. Computer is rock. You win.");
			
		else if (user == 1 && comp == 3)
				System.out.print("You are paper. Computer is lizard. Computer win");
			
		else if (user == 1 && comp == 4)
				System.out.print("you are paper. Computer is spock. You win.");
			
		else if (user == 2 && comp == 0)
				System.out.print("you are scissors. computer is rock. You win");
			
		else if (user == 2 && comp == 3)
				System.out.print("You are scissors. computer is Lizard. You win");
			
		else if (user == 2 && comp == 4)
				System.out.print("You are scissors. Computer is spock. Computer win.");
			
		else if (user == 3 && comp == 0)
				System.out.print("You are lizard. Compter is rock. Computer wins.");
			
		else if (user == 3 && comp == 1)
				System.out.print("You are Lizard. Computer is paper. You win.");
			
		else if (user == 3 && comp == 2)
				System.out.print("you are lizard. computer is scissors. Computer wins.");
			
		else if (user == 3 && comp == 4)
				System.out.print("You are lizard. computer is Spock. You win.");
			
		else if (user == 4 && comp == 0)
				System.out.print("You are spock. computer is rock. You win.");
			
		else if (user == 4 && comp == 1)
				System.out.print("You are Spock. Computer is paper. Computer win.");
			
		else if (user == 4 && comp == 2)
				System.out.print("You are Spock. Computer is Scissors. You win.");
			
		else if (user == 4 && comp == 3)
				System.out.print("you are Spock. comp is Lizard. Computer wins.");
			
		else if (user == 0 && comp == 0)
				System.out.print("You are rock. computer is rock. tie");
			
		else if (user == 1 && comp == 1)
				System.out.print("You are paper. computer is paper. tie");
			
		else if (user == 3 && comp == 3)
				System.out.print("You are scissors. computer is scissors. tie");
			
		else if (user == 4 && comp == 4)
				System.out.print("You are spock. computer is spock. tie");
		
		
		
		
	}

}
