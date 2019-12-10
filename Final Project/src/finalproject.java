//Project:  Final Project
//Author:   Peyton A Reesman
//Date:     Dec. 9, 2019
//Version:  1.0

import java.util.Scanner;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Random;
import java.io.*;

public class finalproject {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Random randomNumbers = new Random();
		//two teams that play 9 innings. so 2 columns and 9 rows
		int[][] scores = new int[2][9];

		Scanner keyboard = new Scanner(System.in);
		Scanner teamOneName = new Scanner(System.in);
		Scanner teamTwoName = new Scanner(System.in);

		int teamOneTotal = 0;
		int teamTwoTotal = 0;
		String teamOne = "";
		String teamTwo = "";

		FileWriter tempFile = new FileWriter("/Users/peytonreesman/Desktop/finalResults.txt", true);
		PrintWriter outputFile = new PrintWriter(tempFile);

		//Collect team names and the game they are playing. essentially the menu
		System.out.println("Welcome to the Baseball Game! \nWhat are the names of the teams playing? \nPress enter after each team name");
		String teamOneTitle = teamOneName.nextLine();
		String teamTwoTitle = teamOneName.nextLine();
		//loop through and collect random number between 0-5 for each inning for team one
		for(int row = 0; row < 2; row++)
		{

			for(int col = 0; col < 9; col++) //switch these two because you do each column for a baseball game not each row
			{

				//innings [row][col] = randomNumber.nextInt(10);


				//collect info for team 1
				if(row==0)
				{
					scores[row][col] = randomNumbers.nextInt(5);
					teamOneTotal += scores[row][col];
					teamOne = teamOne + scores [row][col] + "\t" ; //only need teamOneTotal += innings[row][col];
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
					outputFile.println(teamOneTitle + " Score: " + scores[row][col] + "\t");
				}
				else if(row==1)
				{
					outputFile.println(teamTwoTitle + " Score: " + scores[row][col] + "\t");
				}
			}

		}	
		//output the final Score
		outputFile.println("\nFinal Score Results");
		outputFile.println("===================");
		outputFile.println("Team " + teamOneTitle +": " + teamOneTotal);
		outputFile.println("Team " + teamTwoTitle + ": " + teamTwoTotal);

		//display the winner based off of the score shown


		if(teamOneTotal>teamTwoTotal)
		{
			outputFile.println("\n" + teamOneTitle + " has won!");
		}
		else
		{
			outputFile.println("\n" + teamTwoTitle + " has won!");
		}


		//close the files
		outputFile.close();
		keyboard.close();
		teamOneName.close();
		teamTwoName.close();

	}

}
