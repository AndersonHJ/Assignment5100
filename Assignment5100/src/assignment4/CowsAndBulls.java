package assignment4;

import java.util.Random;
import java.util.Scanner;


public class CowsAndBulls {

	int cows;//cow's number
	int bulls;//bull's number
	
	//initiate cow and bull to zero
	public void init(){
		cows = 0;
		bulls = 0;
	}
	
	//judge whether player is win
	public boolean isWon(){
		if( bulls == 4 )
			return true;
		else
			return false;
	}
	
	
	public String toString(){
		return bulls + " Bulls and " + cows + " Cows";
	}
	
	
	public void addCows(){
		cows ++; 
	}
	
	
	public void addBulls(){
		bulls++; 
		
	}
	
	//find cows and bulls from input number
	public void findCowsAndBulls(char x, char y, int a, int b ){
		if(x == y){
			if(a == b){
				addBulls();
				return;
			}
			else
				addCows();
		}
	}
	
	public String getRandomNumber(){
		Random randomGenerator = new Random();
		int number = randomGenerator.nextInt(8999) + 1000;
		
		return "".valueOf(number);
	}

	
	public static void main(String[] args) {
		
		CowsAndBulls oneGame = new CowsAndBulls();
		
		String number = oneGame.getRandomNumber();
		
		Scanner input = new Scanner(System.in);
		
		while(!oneGame.isWon()){
			System.out.print("Input: ");
			String num = input.nextLine();
			oneGame.init();
			for(int l = 0; l<4; l++){
				for(int i = 0; i<4; i++)
					oneGame.findCowsAndBulls(number.charAt(i), num.charAt(l), i, l);
				
			}
			System.out.println(oneGame.toString());
		}
		System.out.println("The number is "+ number);
		
	}
	

}
