//Project:  Program 6
//Author:   Peyton A Reesman
//Date:     Oct. 28, 2019
//Version:  1.0

import java.util.Scanner;

public class program6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner keyboard = new Scanner(System.in);
		
		int menuChoice;
		double balance = 0.00;
		double withdrawalAmount = 0.00;
		double depositAmount = 0.00;
		
		Bankaccount acc = new Bankaccount();
		
		
	
	do {
		System.out.println("Main Menu");
		System.out.println("=========");
		System.out.println("1.) Make Deposit");
		System.out.println("2.) Withdrawal Funds");
		System.out.println("3.) View Balance");
		System.out.println("4.) Exit");
		System.out.println("What would you like to do? ");
		menuChoice = keyboard.nextInt();
		
		switch (menuChoice)
		{
		case 1:
			System.out.println("How much would you like to deposit? ");
			depositAmount = keyboard.nextDouble();
			acc.deposit(depositAmount);
			break;
		case 2:
			System.out.println("How much would you like to withdrawal? ");
			withdrawalAmount = keyboard.nextDouble();
			acc.withdrawal(withdrawalAmount);
			break;
		case 3:
			acc.displayBalance();
			break;
		case 4:
			System.out.println("Thank you - Have a great day! :)");
			break;
		default:
			System.out.println("That is an invalid choice. Please re-enter an option.");
		}
		
	}while(menuChoice !=4);
		
		keyboard.close();
		
		
	}

}
