package Assignment2;

import java.util.*;


public class Run {
	
	public void evennum_display(){
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Input your number:");
		
		long EndNum = input.nextLong();
		
		System.out.print(0);
		for(long i = 1; i <= EndNum; i += 2){
			System.out.print(", " + i);
		}
	}

	public void is_primenum(){
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Input your number:");
		
		long EndNum = input.nextLong();
		
		long i = 2;
		int is = 1;
		long limit = (long)(Math.sqrt(EndNum) + 0.5);
		while (i <= limit && is == 1){
			if ((EndNum%i) == 0)
				is = 0;
			else
				i++;
	 	};

	 	if(EndNum > 1 && is == 1) 
	    	System.out.println(EndNum + " is a prime");
	    else
	    	System.out.println(EndNum + " is not a prime");
	}
	
	public void digit_count(){
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Input your number:");
		
		long EndNum = input.nextLong();
		
		int i = 1;
		while(EndNum/10 > 0){
			if(EndNum/10 >0)
				i++;
			EndNum /= 10;
			
		}
		System.out.println(EndNum + " has " + i + "digits");
	}
	
	public void a_count(){
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Input your string:");
		
		String EndStr = new String(input.nextLine());
		
		int result = 0;
		for(int i = 0; i<EndStr.length(); i++){
			if(EndStr.charAt(i) == 'a')
				result++;
		}
		if(result == 0)
			System.out.println(EndStr + " has " + "no" + " 'a'");
		else
			System.out.println(EndStr + " has " + result + " 'a'");
	}
	
	public void charstr_count(){
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Input your string and character:");
		
		String EndStr = new String(input.next());
		String charac = new String(input.next());

		int result = 0;
		for(int i = 1; i<EndStr.length()-1; i++){
			if(EndStr.charAt(i) == charac.charAt(1))
				result++;
		}
		if(result == 0)
			System.out.println(EndStr + " has " + "no " + charac);
		else
			System.out.println(EndStr + " has " + result + " " + charac);
	}
	
	public void maxnum(){
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Input your array:");
		
		ArrayList<Integer> EndNum  = new ArrayList();
		int i = 0;
		int l = 0;
		Integer maxnum = new Integer(0);

		String result = input.nextLine();
		String[] end = result.substring(1, result.length()-1).split(", ");
		
		while(l < end.length){
			EndNum.add(Integer.parseInt(end[l]));
			
			if(maxnum.intValue() <= EndNum.get(i).intValue())
				maxnum = EndNum.get(i++);
			l++;
		}
		System.out.println(maxnum);
	}
	
	
	
	public void maxminnum(){
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Input your array:");
		
		ArrayList<Integer> EndNum  = new ArrayList();
		int i = 0;
		int l = 0;
		Integer maxnum = new Integer(0);
		Integer minnum = new Integer(0);
		int temp = 0;
		String result = input.nextLine();
		String[] end = result.substring(1, result.length()-1).split(", ");
		
		while(l < end.length){
			EndNum.add(Integer.parseInt(end[l]));
			
			if(maxnum.intValue() <= EndNum.get(i).intValue()){
				maxnum = EndNum.get(i);
				temp = 1;
			}
			if(minnum.intValue() >= EndNum.get(i).intValue()){
				minnum = EndNum.get(i);
				temp = 1;
			}
			l++;
			if(temp == 1){
				i++;
				temp = 0;
			}
		}
		System.out.println("Max is " + maxnum + " and Min is " + minnum);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Run run = new Run();
		
		//run.evennum_display();
		//run.is_primenum();
		//run.digit_count();
		//run.a_count();
		//run.charstr_count();'
		//run.maxnum();
		run.maxminnum();
	}

}
