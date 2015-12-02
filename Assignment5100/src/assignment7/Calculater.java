package assignment7;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

/** The class of calculater */
public class Calculater extends JFrame{
	JButton number[] = new JButton[10];//the buttons for number 0-9
	JButton sum;// the button of + operation
	JButton minus;// the button of - operation
	JButton point;// the button of .
	JButton multiply;// the button of * operation
	JButton divide;// the button of / operation
	JButton equals;// the button of = operation
	JTextField showResult;// the textfield to show the number and operation
	
	double firstNumber;// the first number for calculating
	double secondNumber;// the second number for calculating
	double result;// the result of the calculating
	
	public Calculater() {
		create();
		add();
		addListeners();
		display();
	}
	
	/** create the buttons and textfield and initiating the numbers */
	private void create() {
		for(int i=0; i<10; i++)
			number[i] =  new JButton(i+"");
		sum = new JButton("+");
		minus = new JButton("-");
		multiply = new JButton("*");
		divide = new JButton("/");
		point = new JButton(".");
		equals = new JButton("=");
		showResult = new JTextField(5);
		
		firstNumber = 0.0;
		secondNumber = 0.0;
		result = 0.0;
	}

	/** add the components to the screen */
	private void add() {
		Container ccon = getContentPane();
		ccon.setLayout(new BorderLayout());
		JPanel con = new JPanel();
		con.setLayout(new GridLayout(4,4));
		ccon.add(con, BorderLayout.SOUTH);
		ccon.add(showResult, BorderLayout.NORTH);
		for(int i = 0; i<10;i++)
			con.add(number[i]);
		con.add(sum);
		con.add(minus);
		con.add(multiply);
		con.add(divide);
		con.add(point);
		con.add(equals);
	}

	/** add the listeners for each button */
	private void addListeners() {
		CalculateActionListener listener = new CalculateActionListener();
		for(int i = 0; i<10;i++)
			number[i].addActionListener(listener);
		sum.addActionListener(listener);
		minus.addActionListener(listener);
		multiply.addActionListener(listener);
		divide.addActionListener(listener);
		point.addActionListener(listener);
		equals.addActionListener(listener);
	}
	
	/** class of action listener */
	class CalculateActionListener implements ActionListener {
		int state = 0;//Recording the state of this calculating process
		double cash = 1;//recording number of zeros after the point
		String command = "";//recording the operation
		
		@Override
		public void actionPerformed(ActionEvent e) {
//			System.out.println(state);
			
			if(state == 0){
				firstNumber = generateNumber(e, firstNumber);
			}
			if(state == 2){
				secondNumber = generateNumber(e, secondNumber);
			}
			if(state == 3){
				firstNumber = generatePointNumber(e, firstNumber);
			}
			if(state == 4){
				secondNumber = generatePointNumber(e, secondNumber);
			}
			if(state == 1){
				chooseCommand(e);
			}
		}

		/** Computing the result */
		private void calculateResult() {
			switch(command){
			case "+":
				result = firstNumber + secondNumber;
				break;
			case "-":
				result = firstNumber - secondNumber;
				break;
			case "*":
				result = firstNumber * secondNumber;
				break;
			case "/":
				result = firstNumber / secondNumber;
				break;
			}
			showResult.setText((result+"").format("%.2f", result));
			state = 0;
			cash = 1;
			command = "";
			firstNumber = 0.0;
			secondNumber = 0.0;
			result = 0.0;
		}

		/** 
		 * Getting the number behind the point, generate the float number
		 * 
		 * @param e the object of actionevent
		 * @param inumber the integer number before the point
		 * 
		 * @return inumber float number generated
		 *  */
		private double generatePointNumber(ActionEvent e, Double inumber) {
			if(e.getSource() == number[0])
				;
			else if(e.getSource() == number[1])
				inumber = inumber + 1.0/cash;
			else if(e.getSource() == number[2])
				inumber = inumber + 2.0/cash;
			else if(e.getSource() == number[3])
				inumber = inumber + 3.0/cash;
			else if(e.getSource() == number[4])
				inumber = inumber + 4.0/cash;
			else if(e.getSource() == number[5])
				inumber = inumber + 5.0/cash;
			else if(e.getSource() == number[6])
				inumber = inumber + 6.0/cash;
			else if(e.getSource() == number[7])
				inumber = inumber + 7.0/cash;
			else if(e.getSource() == number[8])
				inumber = inumber + 8.0/cash;
			else if(e.getSource() == number[9])
				inumber = inumber + 9.0/cash;
			else if(e.getSource() == point){
				System.out.println("The command is not correct! " + "3.1");
			}
			else if(e.getSource() == equals){
				calculateResult();
				return 0;
			}
			else
				state = 1;
			showResult.setText((inumber+"").format("%.2f", inumber));
			cash *= 10;
			return inumber;
		}

		/** 
		 * Checking the command 
		 * 
		 * @param e the object of actionevent
		 * */
		private void chooseCommand(ActionEvent e) {
			if(e.getSource() == sum)
				command = "+";
			else if(e.getSource() == minus)
				command = "-";
			else if(e.getSource() == multiply)
				command = "*";
			else if(e.getSource() == divide)
				command = "/";
			showResult.setText(command);
			cash = 1.0;
			state = 2;
		}

		/** 
		 * Getting the number before the point, generate the integer number
		 * 
		 * @param e the object of actionevent
		 * @param inumber the integer number before the point
		 * 
		 * @return inumber integer number generated
		 *  */
		private double generateNumber(ActionEvent e, Double inumber) {
			if(e.getSource() == number[0])
				inumber = inumber*10;
			else if(e.getSource() == number[1])
				inumber = inumber*10 + 1;
			else if(e.getSource() == number[2])
				inumber = inumber*10 + 2;
			else if(e.getSource() == number[3])
				inumber = inumber*10 + 3;
			else if(e.getSource() == number[4])
				inumber = inumber*10 + 4;
			else if(e.getSource() == number[5])
				inumber = inumber*10 + 5;
			else if(e.getSource() == number[6])
				inumber = inumber*10 + 6;
			else if(e.getSource() == number[7])
				inumber = inumber*10 + 7;
			else if(e.getSource() == number[8])
				inumber = inumber*10 + 8;
			else if(e.getSource() == number[9])
				inumber = inumber*10 + 9;
			else if(e.getSource() == point){
				if(state == 0)
					state = 3;
				else if(state == 2)
					state = 4;
			}
			else if(e.getSource() == equals){
				calculateResult();
				return 0;
			}
			else{
				if(state == 0)
					state = 1;
				else
					System.out.println("The command is not correct! " + "0");
			}
			showResult.setText(inumber+"");
			return inumber;
		}
		
	}

	/** display the screen */
	private void display() {
		setSize(200, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Calculater();

	}

}
