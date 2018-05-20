import java.util.Scanner;

public class additionquiz {
	public static void main(String[] args) {
		
		int number1 = (int) (System.currentTimeMIllis() % 10);
		int number2 = (int) (System.currentTimeMIllis() * 7 % 10);
		
		System.out.print("What is " + number1 + " + " + number2 + " ?");
		
		int answer = input.nextInt();
		
		System.out.println( number1 + " + " + number2 + " = " + answer + " is " + (number1 + number2 == answser));
		
		
		
		
	}

}
