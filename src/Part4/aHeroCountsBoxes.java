package Part4;

import java.text.NumberFormat;
import java.util.Scanner;

public class aHeroCountsBoxes {

	public static void main(String[] args) {
final double boxPrice = 3.25;
var keyboard = new Scanner(System.in);
NumberFormat currrency = NumberFormat.getCurrencyInstance();


System.out.println("How many boxes do we have? ");
String numBocxesIn = keyboard.next();


try {
	
	int numBoxes = Integer.parseInt(numBocxesIn);
	System.out.println("The value is : ");
	System.out.println(currrency.format(numBoxes * boxPrice));
} catch (NumberFormatException e ) {
	System.out.println(e.getMessage());
	System.out.println(" . . . connot interput the inout.");
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
keyboard.close();
	}

}
