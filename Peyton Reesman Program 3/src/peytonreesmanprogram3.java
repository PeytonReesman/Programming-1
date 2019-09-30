//Project:  Program 3
//Author:   Peyton A Reesman
//Date:     Sep. 30, 2019
//Version:  1.0

//import scanner
import java.util.Scanner;

public class peytonreesmanprogram3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner keyboard = new Scanner(System.in);
		
		//input variables
		int number1;
		String name;
		
		
		//collect variables
		System.out.println("What is your name? ");
		name = keyboard.next();
		System.out.println("Please enter a number between 0 and 100: ");
		number1 = keyboard.nextInt();
		
		//the while loop that loops until they put in the correct number
		while(number1<0||number1>100)
		{
			System.out.println("That number is invalid");
			System.out.println("Please enter a number between 0 and 100: ");
			number1 = keyboard.nextInt();
		}
		//Adding this to say thank you once they put in the correct number
		if(number1>0||number1<100)
		{
			System.out.println("Thank you for your input, " + name + ".\n");
		}
		
		for(int i = number1; i >= 0; i--)
		{
			if(i>0) //This is the output message as it counts down
				System.out.println("Count with me, " + (i-0));
			else //once it reaches 0 it should output this message
				System.out.println("\nCongrats! You have finally learned how to count down to 0!");
		}
		
		//close keyboard
		keyboard.close();
		
		
		
		
	}

}
