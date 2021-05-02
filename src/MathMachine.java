/*
 * Assessment: Assignment 03
 * Student Name: Megan Machkouri
 * Due Date: November 13th 2020
 * Description:The Math Machine Class that contains all mathematical operation methods(all double): add, subtract,
 * multiply, divide, remainder and report status. It also contains two private double fields; rightOperand and leftOperand which are
 * used in all class methods. The class also contains an overloaded and default constructor as well as accessor and mutators for the
 * class fields. There is an instance of this object within our main method, as well as various method calls.
 * Professor Name: Carolyn MacIsaac
 */
public class MathMachine {
	private double leftOperand = 0;
	private double rightOperand = 0;
	//DEFAULT CONSTRUCTOR
	public MathMachine() {
		
	}
	//OVERLOADED CONSTRUCTOR
	public MathMachine(double leftOperand, double rightOperand) {
		this.leftOperand = leftOperand;
		this.rightOperand = rightOperand;
	}
	//ACCESSOR FOR LEFTOPERAND
	public double getLeftOperand() {
		return leftOperand;
	}
	//MUTATOR FOR LEFTOPERAND
	public void setLeftOperand(double leftOperand) {
		this.leftOperand = leftOperand;
	}
	//ACCESSOR FOR RIGHTOPERAND
	public double getRightOperand() {
		return rightOperand;
	}
	//MUTATOR FOR RIGHTOPERAND
	public void setRightOperand(double rightOperatnd) {
		this.rightOperand = rightOperatnd;
	}
	//WORKER METHOD FOR ADDITION OF OPERANDS
	public double add() {
		return leftOperand + rightOperand;
	}
	//WORKER METHOD FOR SUBTRACTION OF OPERANDS
	public double subtract() {
		return leftOperand - rightOperand;
	}
	//WORKER METHOD FOR MULTIPLICATION OF OPERANDS
	public double multiply() {
		return leftOperand * rightOperand;
	}
	//WORKER METHOD FOR DIVISION OF OPERANDS
	public double divide() {
		return leftOperand / rightOperand;
	}
	//WORKER METHOD FOR REMAINDER OF OPERANDS
	public double remainder() {
		return leftOperand % rightOperand;
	}
	//WORKER METHOD FOR STATUS OF OPERANDS
	public String reportStatus() {
		return String.format("Left Operand: %f, Right Operand: %f", leftOperand, rightOperand);
	}

}


