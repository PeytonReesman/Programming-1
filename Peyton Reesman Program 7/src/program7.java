//Project:  Program 7
//Author:   Peyton A Reesman
//Date:     Oct. 31, 2019
//Version:  1.0

import java.util.Scanner;
import java.util.Random;

public class program7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random randomNumbers = new Random();
		
		int[][] scores = new int[2][9];
				
		Scanner keyboard = new Scanner(System.in);
		Scanner teamOneName = new Scanner(System.in);
		Scanner teamTwoName = new Scanner(System.in);
			
		int teamOneTotal = 0;
		int teamTwoTotal = 0;
		String teamOne = "";
		String teamTwo = "";
		
		System.out.println("Welcome to the Baseball Game! \nWhat are the names of the teams playing? \nPress enter after each team name");
		String teamOneTitle = teamOneName.nextLine();
		String teamTwoTitle = teamOneName.nextLine();
		
		for(int row = 0; row < 2; row++)
		{
			
			for(int col = 0; col < 9; col++)
			{
				//collect info for team 1
				if(row==0)
				{
					scores[row][col] = randomNumbers.nextInt(5);
					teamOneTotal += scores[row][col];
					teamOne = teamOne + scores [row][col] + "\t" ;
				}
				
				//collect info for team 2
				if(row==1)
				{
					scores[row][col] = randomNumbers.nextInt(5);
					teamTwoTotal += scores[row][col];
					teamTwo = teamTwo + scores[row][col] + "\t" ; 
				}
			}
			
		}
		
		for(int row = 0; row < 2; row ++)
		{
			for(int col = 0; col < 9; col++)
			{
				if(row==0)
				{
					System.out.println(teamOneTitle + " Score: " + scores[row][col] + "\t");
				}
				else if(row==1)
				{
					System.out.println(teamTwoTitle + " Score: " + scores[row][col] + "\t");
				}
			}
			
		}
		
		System.out.println("\nFinal Score: \t" + teamOneTitle + ": " + teamOneTotal + "\t" + teamTwoTitle + ": " + teamTwoTotal + "\t");
		
		if(teamOneTotal>teamTwoTotal)
		{
			System.out.println("\n" + teamOneTitle + " has won!");
		}
		else
		{
			System.out.println("\n" + teamTwoTitle + " has won!");
		}
		
		
		keyboard.close();
		teamOneName.close();
		teamTwoName.close();
		
	}

}
