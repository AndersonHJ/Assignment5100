package assignment5;


import java.util.HashMap;
import java.util.HashSet;


public class CodesOfAssignment5 {
	
	/**
	 * Return that single number of an int array, every element appears twice except for that one. 
	 * 
	 * @param nums the array of integer
	 * @return the int number which appears only once
	 * @throws NullPointerException if input array is null
	 * */
	public int singleNumber(int[] nums) throws NullPointerException {
		
		if(nums == null)
			throw new NullPointerException();
		else{
			HashSet<Integer> numbers = new HashSet<>();
			
			for(int i = 0; i<nums.length; i++){
				if(numbers.contains(nums[i])) // delete the element if it appears twice in the array
					numbers.remove(nums[i]);
				else
					numbers.add(nums[i]);
			}
			
			return numbers.hashCode();
		}
	}
	
	/**
	 * Given a pattern and a string str, find if str full match the same pattern.
	 * 
	 * @param pattern the string that indicate the pattern of str should match
	 * @param str     the string that would be judged
	 * @return true if str matchs the pattern, false if not match
	 * */
	public boolean wordPattern(String pattern, String str) throws ArrayIndexOutOfBoundsException, NullPointerException {
		
		if(pattern == null || str == null)
			throw new NullPointerException();
		
		String[] strII = str.split(" ");
		if(pattern.length() != strII.length)
			throw new ArrayIndexOutOfBoundsException();
		else{
			HashMap<Character, String> mapOfPatternAndString = new HashMap<>();
			
			int i = 0;
			for(i = 0; i<pattern.length(); i++){
				if(!mapOfPatternAndString.containsKey(pattern.charAt(i))){
					if(!mapOfPatternAndString.containsValue(strII[i]))
						mapOfPatternAndString.put(pattern.charAt(i), strII[i]);
					else
						break;
				}
				else
					if(!mapOfPatternAndString.get(pattern.charAt(i)).equals(strII[i]))
						break;	
			}
			
			if(i == pattern.length())
				return true;
			else
				return false;
		}
	}
	
	/**
	 * Determine if the input string is valid
	 * 
	 * @param s the string would be judged which contains '(', ')', '{', '}', '[' and ']'
	 * @return true if string is valid, false if not
	 * @throws UnavailableException if the string s contains unavailable character
	 * */
	public boolean isValid(String s) throws UnavailableException{
		
		if(s.length()%2 != 0)
			throw new UnavailableException("Uneven");
		else if(s.length() == 0)
			throw new UnavailableException("Empty string");
		else{
			HashMap<Character, Character> brackets = new HashMap<>();
			brackets.put('(', ')');
			brackets.put('[', ']');
			brackets.put('{', '}');
			
			int i = 0;
			while(i<s.length()){
				if(brackets.containsKey(s.charAt(i))){
					if(brackets.get(s.charAt(i)) != s.charAt(i+1)){
						if(brackets.containsKey(s.charAt(i+1)))
							break;
						else
							throw new UnavailableException("Unvalid character");
					}
					else
						i += 2;
				}
				else if(brackets.containsValue(s.charAt(i)))
					break;
				else
					throw new UnavailableException("Unvalid character");
			}
			if(i == s.length())
				return true;
			else
				return false;
		}
	}
	
}
