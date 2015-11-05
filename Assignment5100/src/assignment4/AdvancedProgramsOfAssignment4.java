package assignment4;

import java.lang.Character;
import java.util.Random;
import java.util.Scanner;


//This is the program of Assignment4,
//some modifications made according to teacher's advice
public class AdvancedProgramsOfAssignment4 {
	
	//class zeroindex is create for the output of method findZeroGroup
	public class ZeroIndex{
		public int length;//length of zero group
		public int index;//index of zero group in the input array 
		
		public ZeroIndex(int i, int j) {//constructor for class
			index = i;
			length = j;
		}
		
		//method to compare two ZeroIndex objects
		public boolean equals(ZeroIndex comp){
			//return true if the index and length of two zero group is equivalent separately
			if(comp.index == this.index && comp.length == this.length)
				return true;
			else
				return false;
		}
		
	}
	//return a new object of ZeroIndex
	public ZeroIndex to(int i, int j){
			return new ZeroIndex(i, j);
		}
	
	// please re-organize the following comments, do not use two /* ... */
	/* find the groups of two or more zeros
	(00 or 000 or 0000 etc)  in a one dimensional array that has either*/
	/*if the input array is {1, 0, 0 , 1, 0, 1, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0}
	output is a array of ZeroIndex object */
	public ZeroIndex[] findZeroGroup(int[] arrayofzeros){
		// first checkout if the input is null.
		int[] temp = new int[arrayofzeros.length/3+1];
		
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
		ZeroIndex[] result = new ZeroIndex[(parts+1)/2];
		for(int i = 0, l = 0; i <= parts;i+=2, l++)
			result[l] = new ZeroIndex(temp[i],temp[i+1]);

		return result;
	}
	
	
	/*reverse the words in a sentence*/
	public char[] reverseSentence(String Original){
		// the first letter of parameter name please use lower case.
		int start = Original.length(); 
		int end = Original.length()-1;
		char[] temp = Original.toCharArray();
		char[] inversion = new char[temp.length];
		
		for(int i = temp.length - 1, index = 0; i >= 0; ){
			while(temp[i--]!=' ' && i >= 0){
				end--;
			}
			if(i==-1)
				end--;
			for(int l = end+1; l<start; l++)
				inversion[index++] = temp[l];
			start = end;
			end--;
			if(index < temp.length)
				inversion[index++] = ' ';
		}
		
		return inversion;
	}
	
	// print the words that have more than 3 letters in a sentence
	public String findThreeMoreLetters(String sentence){
		
		int length = 0;
		int start = 0;
		int end = 0;
		String result = "";
		for(int i = 0; i<sentence.length(); i++){
			while(i<sentence.length() && (Character.isDigit(sentence.charAt(i))||sentence.charAt(i)=='\''||sentence.charAt(i)=='-'||Character.isLetter(sentence.charAt(i)))){
				length++;
				i++;
			}
			end = start + length;
			if(length>3)
				result += sentence.substring(start, end) + " ";
			start = end+1;
			length = 0;
		}
		System.out.println(result);
		return result;
	}
	
	
	/*Computer will guess a number between 1 and 100. 
	 * We should find that number in less than 5 chances.
	 * Computer will ask the person playing the game to guess the number.
	 * Computer will respond if the guessed number is greater or less than 
	 * or equal to what computer has guessed..*/
	public Boolean playingAGame(){
		
		Random randomGenerator = new Random();
		int number = randomGenerator.nextInt(100);
		
		int guessnumber;
		Scanner input = new Scanner(System.in);
		System.out.println("Please guess a number between 1 and 100 - You have " + 5 + " chances to guess");
		for(int i = 1; i<=5; i++){		
			guessnumber = input.nextInt();
			
			if(guessnumber == number){
				System.out.println("Congratulations! You've guessed it right and you guessed it in " + i + " chances..");
				return true;
			}
			if(guessnumber > number){
				System.out.println(guessnumber + "is greater than what I've guessed - You have " + (5-i) + " chances to guess");
				continue;
			}
			if(guessnumber < number){
				System.out.println(guessnumber + "is less than what I've guessed - You have " + (5-i) + " chances to guess");
				// why do you need continue here?
				continue;
			}
		}
		return false;
	}
	
	public String test(String a){
		a += "asfasdfa";
		
		return a;
	}
	
	
	public static void main(String[] args){
		
		AdvancedProgramsOfAssignment4 execution = new AdvancedProgramsOfAssignment4();
		
		//execution.playingAGame();
	//	System.out.println(test(new String("aaaaaaaaaa")));
	}
	
}
