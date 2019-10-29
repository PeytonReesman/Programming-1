//Project:  Program 5
//Author:   Peyton A Reesman
//Date:     Oct. 22, 2019
//Version:  1.1

import java.util.Scanner;

public class peytonreesmanprogram5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Start keyboard and declare variables
		
		Scanner keyboard = new Scanner(System.in);
		
		int menuChoice;
		//double amountDue = 0.00; don't need this anymore
		double paymentAmount = 0.00;
		double changeBack = 0.00;
		
		
		do //add a do-while loop to make sure the menu shows up at least once
		{
			displayMenu();
			menuChoice = keyboard.nextInt();
			
			switch(menuChoice)
			{
			//what is done on the first case will be repeated throughout all of them
			case 1: 
				System.out.println("You ordered a Hamburger. The amount due is $" + costOne() + ". How much will you be paying with?");
				paymentAmount = keyboard.nextDouble(); //this is asking for your input for how much you will be paying your bill with
				changeBack = change(paymentAmount, costOne()); //this is the equation for subtracting the payment amount from the price of the bill
				displayChange(changeBack); //this will display your change back after you pay
				break;
			case 2:
				System.out.println("You ordered a Cheeseburger. The amount due is $" + costTwo() +  ". How much will you be paying with?");
				paymentAmount = keyboard.nextDouble();
				changeBack = change(paymentAmount, costTwo());
				displayChange(changeBack);
				break;
			case 3:
				System.out.println("You ordered Fries. The amount due is $" + costThree() + ". How much will you be paying with?");
				paymentAmount = keyboard.nextDouble();
				changeBack = change(paymentAmount, costThree());
				displayChange(changeBack);
				break;
			case 4:
				System.out.println("You ordered a Drink. The amount due is $" + costFour() +  ". How much will you be paying with?");
				paymentAmount = keyboard.nextDouble();
				changeBack = change(paymentAmount, costFour());
				displayChange(changeBack);
				break;
			case 5: System.out.println("Thank you for ordering from Peyton's Greasepit - Have a Great Day :)");
				break;
			default:
				System.out.println("Thnak you for stopping by, Have a great day!");	//default print when numbers are not between 1 and 5
			}
			
		}while(menuChoice !=5); //this allows the menu to repeat for numbers between 1 - 4 and not 5
		
		//close keyboard
		keyboard.close();
		
	}

	public static void displayMenu() //this is a method that receives information
	{
	System.out.println("Main Menu");
	System.out.println("=~=~=~=~=");
	System.out.println("What would you like to order? ");
	System.out.println("1.) Hamburger");
	System.out.println("2.) Cheeseburger");
	System.out.println("3.) Fries");
	System.out.println("4.) Drink");
	System.out.println("5.) Exit");
	}
	
	public static double change(double pay, double cos) //this is a method that receives and returns information
			{
		return (pay-cos);
			}		
			
	public static double costOne() //these methods are simply returning the price of each menu item
	{
		return 3.99;
	}
	
	public static double costTwo()
	{
		return 4.99;
	}
	
	public static double costThree()
	{
		return 1.99;
	}
	
	public static double costFour()
	{
		return .99;
	}
	
	public static void displayChange(double cha) //this method is taking in information and then returning some as well
	{
		System.out.println("Your change is: $" + cha);
	}
	

	
	

}
