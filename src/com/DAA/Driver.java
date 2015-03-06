/*
 * Purpose: Design and Analysis of Algorithms Assignment 2
 * Status: Complete and thoroughly tested
 * Last update: 01/20/15
 * Submitted:  03/06/15
 * Comment: I decided to this project in Eclipse so that I can upload it to Github to build a portfolio
 * there as well as practice using it. Also, I experimented using Eclipse's run configurations 
 * presetting the args parameter in main to have the data I need for each run.
 * @author: Albert Rynkiewicz
 * @version: 2015.03.06
 */

package com.DAA;

import java.io.*;

public class Driver {

	//Set up instance variables
	static BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
	
	static int numPeople;
	static int board[][];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Please enter the number of People (n): ");
		System.out.println(args[0]);
		numPeople = Integer.parseInt(args[0]);
		initialize(args);
		printBoard();
	}
	
	
	
	/*
	 * This methods sets up and initialized the job board
	 */
	
	public static void initialize(String[] args){
		board = new int[numPeople][numPeople];
		
		int i = 0;
		int j = 0;
		
		//Convert args to ints
		int size = args.length;
		int[] argsNums = new int[size-1];
		//start at 1 because first int specifies size
		for(i = 1; i<size;i++){
			argsNums[i-1] = Integer.parseInt(args[i]);
			//System.out.println(argsNums[i-1]);
		}
		
		
		//Row Counter
		for(i = 0; i < numPeople; i++){
		
			//Column Counter
			for(j = 0; j<numPeople;j++){
				board[i][j] = argsNums[numPeople* i + j];
			}
			
		}
	
		
	}
	/*
	 * This metho prints the people/job board cleanly
	 */
	public static void printBoard(){
		int i = 0;
		int j = 0;
		
		
		//Row Counter
		for(i = 0; i < numPeople; i++){
		
			//Column Counter
			for(j = 0; j<numPeople;j++){
				System.out.print(board[i][j]+"\t");
			}
			System.out.println("");
			
		}
		
	}

}
