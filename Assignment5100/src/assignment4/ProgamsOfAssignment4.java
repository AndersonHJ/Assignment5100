package assignment4;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class ProgamsOfAssignment4 {
	
/**	 find the groups of two or more zeros
	(00 or 000 or 0000 etc)  in a one dimensional array that has either
	if the input array is {1, 0, 0 , 1, 0, 1, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0}
	 the output would be {1, 2, 7, 6, 14, 2}
	 the first number of output array is the index of zeros
	 and the second number of output array is the number of zero in this zero group*/
	public int[] findGroups(int[] arrayofzeros){
		
		int[] temp = new int[(arrayofzeros.length/3)+1];
		/**and the second number of output array is the number of zero in this zero group*/
		int index = 0;
		int length = 0;
		int parts = -1;
		for(int i = 0; i<arrayofzeros.length;){
			if(arrayofzeros[i]==0){
				index = i;
				length = 0;
				while(i<arrayofzeros.length && (arrayofzeros[i++]==0))
					length++;
				if(length>=2){
					temp[++parts] = index;//take the even terms of array equals to first index of zeros group
					temp[++parts] = length;//take the odd terms of array equals to length of zeros group
				}
			}
			else
				i++;
		}
		int[] results = new int[parts+1];
		for(int i = 0; i<=parts; i++)
			results[i] = temp[i];
		return results;
	}
	
	
	/*reverse the words in a sentence*/
	public String reverseSentence(String Original){
		
		String inversion = "";
		int start = Original.length(); 
		int end = Original.length()-1;
		
		for(int i = Original.length()-1; i >= 0; ){
			while(Original.charAt(i--)!=' ' && i >= 0)
				end--;
			if(i < 0)
				inversion += " ";
			inversion += Original.substring(end, start);
			start = end;
			end--;
		}
		
		return inversion.substring(1);
	}
	
	
	//print a pyramid of numbers
	public void printPyramid(int rows){
		
		int num = 1;
		for(int row = 1; row <= rows; row++){
			for(int col = rows-row; col>0; col--)
				System.out.print(" ");
			for(int col = 1; col<= row; col++){
				System.out.print(num + " ");
				num++;
			}
			for(int col = rows-row; col>0; col--)
				System.out.print(" ");
			System.out.println("");
		}
			
	}
	
	
	//generate Fibonacci number
	public ArrayList findFibonacci(int number){
		
		int first = 1;
		int second = 1;
		
		ArrayList results = new ArrayList();
		
		//Maximum number upto which you need to generate the Fibonacci numbers
		while(first <= number && second <= number){
			results.add(first);
			results.add(second);
			first = first + second;
			second = second + first;
		}
		
		return results;
	}
	
	//Capitalize every first letter of a word in the sentence
	public char[] capitalizeFirstLetter(String sentences){
		
		char[] sentence = sentences.toCharArray();
		for(int i = 0; i<sentence.length; i++)
			if(sentence[i]==' ' || i == 0){
				if(i==0)
					sentence[i] = Character.toUpperCase(sentence[i]);
				else
					sentence[i+1] = Character.toUpperCase(sentence[i+1]);
			}
		return sentence;
	}
	
	// print the words that have more than 3 letters in a sentence
	public String findThreeMoreLetters(String sentence){
		
		int length = 0;
		int start = 0;
		int end = 0;
		String result = "";
		for(int i = 0; i<sentence.length(); i++){
			while(i<sentence.length() && ((sentence.charAt(i)>='a' && sentence.charAt(i)<='z') || (sentence.charAt(i)>='A' && sentence.charAt(i)<='Z'))){
				length++;
				i++;
			}
			end = start + length;
			if(length>3)
				result += sentence.substring(start, end) + " ";
			start = end+1;
			length = 0;
		}
		return result;
	}
	
	
	/*Computer will guess a number between 1 and 100. 
	 * We should find that number in less than 5 chances.
	 * Computer will ask the person playing the game to guess the number.
	 * Computer will respond if the guessed number is greater or less than 
	 * or equal to what computer has guessed..*/
	public void playingAGame(){
		
		Random randomGenerator = new Random();
		int number = randomGenerator.nextInt(100);
		
		int guessnumber;
		System.out.println("Please guess a number between 1 and 100 - You have " + 5 + " chances to guess");
		for(int i = 0; i<5;){	
			Scanner input = new Scanner(System.in);
			guessnumber = input.nextInt();
			
			if(guessnumber == number){
				System.out.println("Congratulations! You've guessed it right and you guessed it in " + i + " chances..");
				i = 5;
			}
			else if(guessnumber > number)
				System.out.println(guessnumber + "is greater than what I've guessed - You have " + (5-(++i)) + " chances to guess");
			else
				System.out.println(guessnumber + "is less than what I've guessed - You have " + (5-(++i)) + " chances to guess");
		}
	}
	
	//Playing a Game named Cows and Bulls
	public void playingCowsAndBulls(){
		
		Random randomGenerator = new Random();
		int number = randomGenerator.nextInt(8999) + 1000;
		String temp = "".valueOf(number);
		int[] result = new int[2];
		Scanner input = new Scanner(System.in);
		while(result[1] != 0 || result[0] != 4){
			System.out.print("Input: ");
			String num = input.nextLine();
			result[0] = 0;
			result[1] = 0;
			for(int i = 0; i<4; i++){
				for(int l = 0; l<4; l++)
					if(temp.charAt(l) == num.charAt(i)){
						if(l == i){
							result[0]++;
							break;
						}
						else
							result[1]++;
					}
			}
			System.out.println(result[1] + "Cow and " + result[0] + "Bull");
		}
		System.out.println(temp);
	}
	
	
}
