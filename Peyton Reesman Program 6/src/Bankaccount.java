//Project:  Program 6
//Author:   Peyton A Reesman
//Date:     Oct. 28, 2019
//Version:  1.0

public class Bankaccount {

	double balance = 0.00;
	
	
	//this method returns a double with the value of bal+dep
		public void deposit(double depositAmount)
		{	
			balance = balance + depositAmount;
		}
		//this method returns a double with the value of bal-wit
		public void withdrawal( double withdrawalAmount)	
		{
			balance = balance - withdrawalAmount;
		}
		//this method will display a balance when called upon
		public void displayBalance()
		{
			System.out.println("Your balance is: $" + balance);
			if (balance <0)
				System.out.println("You are at a negative balance.");
		}
		
}