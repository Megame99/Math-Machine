/*
 * Assessment: Assignment 03
 * Student Name: Megan Machkouri
 * Due Date: November 13th 2020
 * Description: A driver class that contains method main which enables program testing and method implementation. Requires user input
 * also checks and validates user input using decision loops + conditional statements + method calls. Method calls 
 * are used to output results. 
 * Professor Name: Carolyn MacIsaac
 */
public class Program {

	public static void main(String[] args) {
	
		MathMachine math = new MathMachine();//Object Instantiation, used on operand values 
		UserInput user = new UserInput();//Object Instantiation, used to output information and validate user input
		int inputTest1 = 1;
		boolean continueMenu = false; //used as parameter for Menu System function 
		boolean changeOperands = inputTest1 == 1; //used as parameter for operands input 
	
		
		//Initializing first loop, used for modification of operands 
		outer:
			while(changeOperands) {
				double inputTest2 = user.input(-1000.0, 1000.0);
				System.out.println("User entered: " + inputTest2);

				double inputTest3 = user.input(-1000.0, 1000.0);
				System.out.println("User entered: " + inputTest3);
				
				// if else decision structure to assign input to correct operand
				if(inputTest2 > inputTest3) {
					math.setRightOperand(inputTest2);
					math.setLeftOperand(inputTest3);
				} else {
					math.setLeftOperand(inputTest2);
					math.setRightOperand(inputTest3);
				}

				changeOperands = false;// exit outer while
				continueMenu = true;// enter inner while
				//Initializing second loop which enables user to perform multiple calculations if necessary 
				while(continueMenu){
					inputTest1 = user.input(0, 8);//METHOD CALL + INSTANCE OF USERINPUT OBJECT
					System.out.println("user entered: " + inputTest1);
					// IF - ELSE DECISION STRUCTURE TO CALL CORRECT MATH MACHINE METHOD OR EXIT PROGRAM
					if(inputTest1 == 1) {
						System.out.println("Please re-enter values!");
						changeOperands = true;// re-enter outer while
						continueMenu = false;// exit inner while
					} else if(inputTest1 == 2) {
						System.out.println(math.reportStatus());
					} else if(inputTest1 == 3) {
						System.out.println("Add Operands: " + math.add()); // METHOD CALL
					} else if(inputTest1 == 4) {
						System.out.println("Subtract Operands: " + math.subtract());//METHOD CALL 
					} else if(inputTest1 == 5) {
						System.out.println("Multiply Operands: " + math.multiply());//METHOD CALL 
					} else if(inputTest1 == 6) {
						System.out.println("Divide Operands: " + math.divide());// METHOD CALL
					} else if(inputTest1 == 7) {
						System.out.println("Remainder: " + math.remainder());// METHOD CALL
					} else if(inputTest1 == 8) {
						System.out.println("Program Terminated");
						changeOperands = false;// exit outer loop
						continueMenu = false;// exit inner loop
					} else {
						System.out.println("Outside of Input Range");
						//default statement in the case user input's value outside of accepted range 
					}
				}
			}
	}
}	

		
	

	

