import java.util.Scanner; 

public class saleTax {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the price of the product: ");
		double price = input.nextDouble();
		
		System.out.print("Please enter the sales tax rate: ");
		double taxRate = input.nextDouble();
		
		double salesTax = price * (taxRate / 100);
		double total = price + salesTax;
		
		System.out.println("The price of your item is $" + price + " with the sales tax being $" + salesTax + " with the total being $" + total);
	}

}
