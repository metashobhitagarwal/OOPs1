package Assgn2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*This class contains two methods; 
 * 1.actionPerformed: to perform a function corresponding to that event
 * 2.calPerform: Performs the calculations and displays the result
 */
class Calculator implements ActionListener {

	private Layout lay;
	private Operator opr;
	private Display display;

	double result;

	public Calculator() {
		// Constructor
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		// logic for action when the buttons are clicked
	}

	public void calPerform(double num1, double num2, char opration) {
		Operation obr = new Operation();
		Display dis = new Display();
		switch (opration) {
		case '+':
			obr.addition(num1, num2);
			dis.displayResult(obr.getResult());
			break;
		case '-':
			obr.substraction(num1, num2);
			dis.displayResult(obr.getResult());
			break;
		case '*':
			obr.multiplication(num1, num2);
			dis.displayResult(obr.getResult());
			break;
		case '/':
			if (num2 != 0) { // divide by zero handling
				obr.divide(num1, num2);
				dis.displayResult(obr.getResult());
			}
			break;
		}
	}
}