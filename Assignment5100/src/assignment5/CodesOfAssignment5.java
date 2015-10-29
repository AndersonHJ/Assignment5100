package assignment5;

import java.util.HashMap;
import java.util.HashSet;

public class CodesOfAssignment5 {
	
	
	/**Return that single number of an int array, every element appears twice except for that one. 
	 * 
	 * @param nums the array of integer
	 * @return the int number which appears only once
	 * @throws NullPointerException if input array is null
	 * */
	public int singleNumber(int[] nums) throws NullPointerException {
		
		HashSet<Integer> numbers = new HashSet<>();
		
		for(int i = 0; i<nums.length; i++){
			if(numbers.contains(nums[i])) // delete the element if it appears twice in the array
				numbers.remove(nums[i]);
			else
				numbers.add(nums[i]);
		}
		
		return numbers.hashCode();
	}
	
	/**Given a pattern and a string str, find if str full match the same pattern.
	 * 
	 * @param pattern the string that indicate the pattern of str should match
	 * @param str     the string that would be judged
	 * @return true if str matchs the pattern, false if not match
	 * */
	public boolean wordPattern(String pattern, String str) throws ArrayIndexOutOfBoundsException, NullPointerException {
		
		String[] strII = str.split(" ");
		HashMap<Character, String> mapOfPatternAndString = new HashMap<>();
		
		int i = 0;
		for(i = 0; i<pattern.length(); i++){
			
			if(!mapOfPatternAndString.containsKey(pattern.charAt(i)))
				mapOfPatternAndString.put(pattern.charAt(i), strII[i]);
			else
				if(!mapOfPatternAndString.get(pattern.charAt(i)).equals(strII[i]))
					break;
			
		}
		
		if(i == pattern.length())
			return true;
		else
			return false;
	}
	
	/** */
	public boolean isValid(String s){
		
	}
	
	
	public static void main(String[] args){
		
		CodesOfAssignment5 exec = new CodesOfAssignment5();
		
		//System.out.println(exec.singleNumber(new int[]{0,0,0}));
		//System.out.println(exec.wordPattern("aaaa", "cat cat cat cat"));
		
	
	}
}
