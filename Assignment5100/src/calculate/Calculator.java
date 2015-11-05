package calculate;

import java.util.*;

public class Calculator {

	private  double first;
	private double second;

	private String act;
	
	public double calculate(){
		
		Getinput();
		
		switch(act){
			case("+"):
				return first + second;
			case("-"):
				return first - second;
			case("/"):
				return first/second;
			case("*"):
				return first*second;
			default:
				return 0;
		}
		
	}


	private void Getinput() {
		Scanner input = new Scanner(System.in);
		System.out.println("input your first num:");
		first = input.nextDouble();
		System.out.println("input your second num:");
		second = input.nextDouble();
		System.out.println("input your action:");
		act = input.next();
	}
	
	
	public static void main(String[] args){
		
		Calculator cal = new Calculator();
		
		System.out.println(cal.calculate());
		
		
		
	}
}
