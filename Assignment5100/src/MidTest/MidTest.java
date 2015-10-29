package MidTest;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;


public class MidTest {

	/**If number is divided by 3 print "fizz"
	 * if number is divided by 5 print "buzz"
	 * if number is divided by both 3 and 5 print"fizz buzz"
	 * 
	 * @param n int number should be judged
	 * @return result String can be "" or "fizz " or "buzz" or both of them 
	 * */
	public String printFizzBuzz(int n) {
		String result = "";
		if(n%3 == 0)
			result += "fizz ";
		if(n%5 == 0)
			result += "buzz";
		return result;
	}
	
	/**Move all zeros to the end of input int array
	 * 
	 * @param  nums the int array contains int number
	 * @return nums the int array which the 0s all at the end of array
	 * @throws if array nums is null, throw exception
	 * */
	public int[] moveZeros(int[] nums) throws NullPointerException {
		
		int index = 0;//the end position of non-zero subarray
		
		for(int i = 0; i<nums.length; i++) {
			if(nums[i] == 0 && i<nums.length-1) {
				if(nums[i+1] != 0) {//if nums[i]==0 and nums[i+1]!=0,
								//move the nums[i+1] to the end of non-zero subarray
					nums[index] = nums[i+1];
					nums[i+1]=0;
					index++;
					i++;
				}
			}
			else if(nums[i] != 0)
				index++;
		}
		
		return nums;

	}
	
	/**Determine if the string t is an anagram of string s
	 * 
	 * @param s origin string would be compared
	 * @param t another string to compare with origin string
	 * @return true if t is an anagram of s, false if not
	 * */
	public boolean isAnagram(String s, String t) throws ArrayIndexOutOfBoundsException, NullPointerException {
		
		//hashmap would store a string, Character is the character of string,
		//Integer is the number of every Character
		HashMap <Character, Integer> numberOfCharS = new HashMap<Character, Integer>();
		HashMap <Character, Integer> numberOfCharT = new HashMap<Character, Integer>();
		
		for (int i = 0; i<s.length(); i++) {//store the two strings into hashmap
			if(numberOfCharS.containsKey(s.charAt(i)))
				numberOfCharS.put(s.charAt(i), numberOfCharS.get(s.charAt(i))+1);
			else
				numberOfCharS.put(s.charAt(i), 1);
			
			if(numberOfCharT.containsKey(t.charAt(i)))
				numberOfCharT.put(t.charAt(i), numberOfCharT.get(t.charAt(i))+1);
			else
				numberOfCharT.put(t.charAt(i), 1);
		}
		
		if(numberOfCharS.equals(numberOfCharT))
			return true;
		else
			return false;
	}
	
	/**Judging if the array contains any duplicates
	 * 
	 * @param nums int array of unsorted integers
	 * @return true if any value appears at least twice in the array, false if every element is distinct
	 * @throws if array nums is null, throw exception
	 * */
	public boolean containsDuplicate(int[] nums) throws NullPointerException {
	
		HashSet<Integer> numberOfInt = new HashSet<Integer>();	
		
		int i = 0;
		for(i = 0; i<nums.length; i++) {
			if(numberOfInt.contains(nums[i]))//break from for loop if there is any duplicate
				break;
			else
				numberOfInt.add(nums[i]);
		}
		
		if(i == nums.length)//if i equals to length of nums, it means every element is distinct
			return false;
		else
			return true;
	}
	
	/**If there exist any two numbers of array can add up to a target number
	 * 
	 * @param target the int number we want to get from the sum of two numbers of array
	 * @param nums the input number array
	 * @return true if there exist any two numbers of array can add up to a target number, false if not
	 * @throws if array nums is null, throw exception
	 * */
	public boolean twoSum(int[] nums, int target) throws NullPointerException {
		
		if(nums.length<2)
			return false;
		else {
			HashSet<Integer> numbers = new HashSet<Integer>();
			
			for(int i = 0; i<nums.length; i++)
				if(!numbers.contains(nums[i]))
					numbers.add(nums[i]);
			
			int i = 0;
			for(int temp; i<nums.length; i++) {
				temp = nums[i];
				if(target>temp)
					if(numbers.contains(target-temp))
						//if the array contains the difference of target and one number of array,then break from loop
						break;
			}
			
			if(i==nums.length)
				return false;
			else
				return true;
		}
	}
	
	public static void main(String[] args) {

		MidTest execution = new MidTest();
		
		execution.printFizzBuzz(0);
		//execution.moveZeros(new int[]{0, 12, 0, 34, 0, 55, 0, 7, 0});
		//System.out.println(execution.isAnagram("", ""));
		//System.out.println(execution.containsDuplicate(new int[]{0, 23, 234 , 45, 34, 0}));
		//System.out.println(execution.twoSum(new int[]{2, 7, 11, 15}, 20));
	}

}
