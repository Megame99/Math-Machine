/*
 * Assessment: Assignment 03
 * Student Name: Megan Machkouri
 * Due Date: November 25th 2020
 * Description:  A Java class that handles user input for our Math Machine Calculator. 
 * This class is designed to output user prompts as well as evaluate and validate user input.
 * It is capable of evaluating user input by validating data type as well as ensuring user input 
 * does not violate minimum and maximum constraints. There are two different input methods, one for validating
 * the operand double values and the other for validating the menu option integer value. Both these methods are 
 * implemented in the driver class of our program. 
 * Professor Name: Carolyn MacIsaac
 */

import java.util.Scanner;

public class UserInput {
	private Scanner keyboard = new Scanner(System.in);
	public double inputTest3;
	

	// Input validation method and user output prompt worker method, handles operand(double) values
	public int input(int minValue, int maxValue) {
		int userInput = 0;
		boolean isInputBad = true;
		MenuSystem menu = new MenuSystem(); //Object Instantiation called in our int input worker method 
		
		while(isInputBad) { //INTIALIZE WHILE LOOP IN ORDER TO EVALUATE AND HANDLE INVALID INPUT SITUATIONS
			System.out.println(menu.optionsList());
			if(keyboard.hasNextInt()) { // CORRECT DATA TYPE CHECK
				userInput = keyboard.nextInt();
				if(userInput < minValue || userInput > maxValue) {
					System.out.println("Invalid Input! Please try again!");
					isInputBad = true;
				}else {
					return userInput;
					}	
			} else
				System.out.println("Invalid Input");
				keyboard.nextLine(); // REPEAT LOOP
				keyboard.nextLine();// CLEAR STREAM
		}
		return userInput;
	}
// Input validation method and user output prompt worker method, handles operand(double) values
	public double input(double minValue, double maxValue) {
		double userInput2 = 0.0;	
		boolean isInputBad2 = true;
		while(isInputBad2) {
			System.out.println("Enter any numerical value between -1000.0 to 1000.0");
			if(keyboard.hasNextDouble()) { //CORRECT DATA TYPE CHECK
				userInput2 = keyboard.nextDouble();
				if(userInput2 < minValue || userInput2 > maxValue) { // MIN MAX CONSTRAINT CHECK 
					System.out.println("Invalid Input! Please try again!");
					isInputBad2 = true; // REPEAT LOOP
				}else {
					return userInput2; //EXIT LOOP(ONLY WHEN INPUT VALUE IS VALID
					}
			} else
				System.out.println("Invalid Input"); 
				keyboard.nextLine(); // REPEAT LOOP CLEAR STREAM
		}

		return userInput2;// ONLY WHEN INPUT VALUE IS VALIDATED AND EVALUATED
	}
	
}
