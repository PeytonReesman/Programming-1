//Project:  Program 8
//Author:   Peyton A Reesman
//Date:     Nov. 11, 2019
//Version:  1.0

import java.io.*;
import java.util.Scanner;

public class program8 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		//file then give it a name next word and file () within the parenthesis is the location
		//open file for use
		File fw = new File("/Users/peytonreesman/Desktop/grades.txt");
		Scanner inputFile = new Scanner(fw);

		//open/create output file
		//tempFile is where we are putting the settings the outputFile is what is actually opening it and is what the name is
		FileWriter tempFile = new FileWriter("/Users/peytonreesman/Desktop/gradesTotal.txt", true);
		PrintWriter outputFile = new PrintWriter(tempFile);


		int total = 0;
		int gradeCounter = 0;
		

		//loop through the input file
		while(inputFile.hasNext())
		{ //below is the inputFile name and then the next character that will read in
			//char category = inputFile.next().charAt(0);
			int grade = inputFile.nextInt();
			total+=grade; //goes to each grade and adds it to the total
			gradeCounter++; //count through each number and creates a total of all of the numbers
		}
		//output the stats 
		outputFile.println("Grade Statistics");
		outputFile.println("================");
		outputFile.println("Total: " + total);
		outputFile.println("Numbers of Grades: " + gradeCounter);
		outputFile.println("Average: " + total/gradeCounter + "%");

		//close the files
		outputFile.close();
		inputFile.close();


	}

}
