package loops;

import java.util.Scanner;

public class Whileloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Use Case: Unknown iterations, condition first
		//Key Feature: Loops as long as the condition is true.
	    Scanner sc = new Scanner(System.in);
	    int positiveNumber=0;

		while (positiveNumber<=0) {
		  
			System.out.println("Enter the positive number:");
			  sc.nextInt();
			 if (positiveNumber<=0) {
				 System.out.println("It is positive number");
				
			}else
				System.out.println("Please try again");
		
			
		}
		

	}

}
