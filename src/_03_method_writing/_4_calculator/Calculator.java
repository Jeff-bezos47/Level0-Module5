package _03_method_writing._4_calculator;

import javax.swing.JOptionPane;

public class Calculator {

	//GOAL: MAKE A CALCULATOR
	public static void main(String[] args) {
		String input1 = JOptionPane.showInputDialog("Enter a number");
		String input2 = JOptionPane.showInputDialog("Enter another number");
		int number1 = Integer.parseInt(input1);
		int number2 = Integer.parseInt(input2);
		int task = JOptionPane.showOptionDialog(null, "What do you choose?", "Calculator", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "divide", "multiply", "subtract", "add" }, null);

		// 3) Call the correct method depending on what option the user chooses
		if(task == 3) {
			int sum = add(number1, number2);
			String answer = result(sum);
			JOptionPane.showMessageDialog(null, answer);
		}
		if(task == 2) {
			int difference = subtract(number1, number2);
			String answer = result(difference);
			JOptionPane.showMessageDialog(null, answer);
		}
		if(task == 1) {
			int product = multiply(number1, number2);
			String answer = result(product);
			JOptionPane.showMessageDialog(null, answer);
		}
		if(task == 0) {
			int quotient = divide(number1, number2);
			String answer = result(quotient);
			JOptionPane.showMessageDialog(null, answer);
		}
		
		// 4) Call the result() method and put the answer in a pop-up
	}
	
	// 1) Make 4 static methods (add, subtract, multiply, divide)
	//		They should each take 2 numbers as parameters
	//		and return the answer.
	 static int add(int a, int q) {
		 return a + q;
	 }
	 static int subtract(int s, int w) {
		 return s - w;
	 }
	 static int multiply(int m, int j) {
		 return m * j;
	 }
	 static int divide(int d, int e) {
		 return d / e;
	 }
	
	// 2) Make a static method called " result" that takes a number
	//		as a parameter and returns the number in a string
	//		EX: "Your answer is " + number;
	 static String result(int n) {
		 return "your result is " + n;
	 }
	
}
