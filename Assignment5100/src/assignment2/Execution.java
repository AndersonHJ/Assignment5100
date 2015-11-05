package assignment2;


public class Execution {
	
	//To find even numbers from 2 to the number passed as input number
	public int[] detectEvenNumber(int number){
		
		int resultEvenNumber[] = new int[number/2];
		
		for(int i = 0; i < resultEvenNumber.length; i++){
			resultEvenNumber[i] = (i+1)*2;
		}
		return resultEvenNumber;
	}

	//To find if the number is prime or not
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
	
	//To find how many digits does a number
	public int countDigit(int number){
		
		int i = 1;
		while(number/10 > 0){
			if(number/10 >0)
				i++;
			number /= 10;
			
		}
		return i;
	}
	
	//To find how many 'a' characters are in a String
	public int countSubLetter(String string){
		
		int result = 0;
		for(int i = 0; i < string.length(); i++){
			if(string.charAt(i) == 'a')
				result++;
		}
		return result;
	}
	
	//To find how many characters are in the String
	public int countSubLetter(String string, char subchar){

		int result = 0;
		for(int i = 0; i < string.length(); i++){
			if(string.charAt(i) == subchar)
				result++;
		}
		return result;
	}
	
	/*To find the maximum or minimum number in an array of numbers
	the method would return max number if option is true 
	and it would return min number if option is false*/
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
		
	}

}
