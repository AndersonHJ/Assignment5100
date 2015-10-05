package Assignment2;

import java.util.*;


public class Execution {
	
	public int[] detectEvenNumber(int number){
		
		int resultEvenNumber[] = new int[(number/2 < 1)? 1 : number/2+1];
		
		for(int i = 0; i < resultEvenNumber.length; i++){
			resultEvenNumber[i] = i*2;
		}
		return resultEvenNumber;
	}

	public boolean isPrime(int number){		

		int is = 1;
		int i = 2;
		
		int limit = (int)(Math.sqrt(number) + 0.5);
		
		while (i <= limit && is == 1){
			if ((number%i) == 0)
				is = 0;
			else
				i++;
	 	}
		
	 	if(number >= 1 && is == 1) 
	    	return true;
	    else
	    	return false;
	}
	
	public int countDigit(int number){
		
		int i = 1;
		while(number/10 > 0){
			if(number/10 >0)
				i++;
			number /= 10;
			
		}
		return i;
	}
	
	public int countSubLetter(String string){
		
		int result = 0;
		for(int i = 0; i < string.length(); i++){
			if(string.charAt(i) == 'a')
				result++;
		}
		return result;
	}
	
	public int countSubLetter(String string, char subchar){

		int result = 0;
		for(int i = 0; i < string.length(); i++){
			if(string.charAt(i) == subchar)
				result++;
		}
		return result;
	}
	
	public int findMaxMinNum(int[] numberarray, boolean option){
		
		int i = 0;
		int temp = 0;
		
		if(option){
			while(i < numberarray.length){
				if(temp <= numberarray[i])
					temp = numberarray[i];
				i++;
			}
		}
		else{
			while(i < numberarray.length){
				if(temp >= numberarray[i])
					temp = numberarray[i];
				i++;
			}
		
		}
			
		return temp;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Execution execution = new Execution();
		
		//execution.detectEvenNumber();
		//execution.isPrime(111);
		//execution.countDigit();
		//execution.countSubLetter();
		//execution.findMaxMinNum();
	}

}
