import java.util.Scanner;




public class Exercise02_05 {
    public static void main(String[] args) {
        
    	Scanner input = new Scanner(System.in);
        
    	System.out.print("Please enter the subtotal: ");
        double subTotal = input.nextDouble();
        
        System.out.print("Please enter the gratuity rate: ");
        double gratuityRate = input.nextDouble();
       
        double gratuity = subTotal + (gratuityRate / 100);
        double total = subTotal + gratuity;
        
        System.out.println("The gratuity is $" + gratuity + " with the total being $" + total);           
             
  }
    
} 
