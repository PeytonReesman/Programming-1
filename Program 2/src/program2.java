//Project:  Program 2
//Author:   Peyton A Reesman
//Date:     Sep. 20, 2019
//Version:  1.0

import java.util.Scanner;

public class program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declare variables
		int number1;
		int number2;
		int number3;

		Scanner keyboard = new Scanner(System.in);
		
		//Collect input for number one, two, and three
		System.out.println("What is your first number?");
		number1 = keyboard.nextInt();
		System.out.println("What is your second number?");
		number2 = keyboard.nextInt();
		System.out.println("What is your third number?");
		number3 = keyboard.nextInt();
		
		//Declare variable
		int choice;
		
		//Display menu and get user input
		System.out.println("========="); //Added this to separate the menu from the question above
		System.out.println("Main Menu");
		System.out.println("=========");
		System.out.println("What would you like to do with your first two numbers?");
		System.out.println("1. Add");
		System.out.println("2. Subtract");
		System.out.println("3. Multiply");
		System.out.println("4. Divide");
		System.out.println("5. Exit");
		System.out.print("6. Please make a selection (1-5):");
			choice = keyboard.nextInt();
		System.out.println("========="); //Added this to separate the choices from the solution

		
		
		 
		//Have the outputs for the selected number from the main menu
		switch(choice)
		{
		case 1:
			System.out.println(number1 + "+" + number2 + "=" + (number1+number2));
			if ((number1+number2) > number3) //Greater than statement. All the same for the rest of them
			{
				System.out.println((number1+number2) + " is greater than " + number3);
			}
			else if ((number1+number2) == number3) //Equal to statement. All the same for the rest of them
			{
				System.out.println((number1+number2) + " is equal to " + number3);
			}
			else //Less than statement. All the same for the rest of them
			{
				System.out.println((number1+number2) + " is less than " + number3);
			}
			break;
		case 2:
			System.out.println(number1 + "-" + number2 + "=" + (number1-number2));
			if ((number1-number2) > number3)
			{
				System.out.println((number1-number2) + " is greater than " + number3);
			}
			else if ((number1-number2) == number3)
			{
				System.out.println((number1-number2) + " is equal to " + number3);
			}
			else
			{
				System.out.println((number1-number2) + " is less than " + number3);
			}
			break;
		case 3:
			System.out.println(number1 + "*" + number2 + "=" + (number1*number2));
			if ((number1*number2) > number3)
			{
				System.out.println((number1*number2) + " is greater than " + number3);
			}
			else if ((number1*number2) == number3)
			{
				System.out.println((number1*number2) + " is equal to " + number3);
			}
			else
			{
				System.out.println((number1*number2) + " is less than " + number3);
			}
			break;
		case 4:
			System.out.println(number1 + "/" + number2 + "=" + (number1/number2));
			if ((number1/number2) > number3)
			{
				System.out.println((number1/number2) + " is greater than " + number3);
			}
			else if ((number1/number2) == number3)
			{
				System.out.println((number1/number2) + " is equal to " + number3);
			}
			else
			{
				System.out.println((number1/number2) + " is less than " + number3);
			}
			break;
			//if they would like to exit 
		case 5: 
			System.out.println("Thank you for stopping by, have a great day!");
			break;
		default:
			System.out.println("You made an invalid choice.");
			
	//There needs to be a much easier way to write all of this^^
			//I found an easier way from a friend but haven't worked out all the kinks, so I'm submitting this one
		
		//Close keyboard
		keyboard.close();
		
		}
		
	}
}



