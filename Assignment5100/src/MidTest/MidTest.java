package MidTest;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;


public class MidTest {

	
	public String printFizzBuzz(int n){
		String result = "";
		if(n%3 == 0)
			result += "fizz ";
		if(n%5 == 0)
			result += "buzz";
		return result;
	}
	
	
	public int[] moveZeros(int[] nums){
		
		if(nums == null)
			return null;
		else{
			int startOfZero = nums.length-1;
			int index = 0;
			int i = 0;
			
			while(i<startOfZero){
				if(nums[i] == 0){
					for(int l = index; l<startOfZero; l++){
						nums[l] = nums[l+1];
					}
				nums[startOfZero--] = 0;
				}
				else
					index++;
				i = index;
			}
			
			return nums;
		}
	}
	
	
	public boolean isAnagram(String s, String t){
		
		if(s.length()!=t.length())
			return false;
		else{
			HashMap <Character, Integer> numberOfCharS = new HashMap<Character, Integer>();
			HashMap <Character, Integer> numberOfCharT = new HashMap<Character, Integer>();
			
			for (int i = 0; i<s.length(); i++) {
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
	}
	
	
	public boolean containsDuplicate(int[] nums){
		if(nums == null)
			return false;
		else{
			HashSet<Integer> numberOfInt = new HashSet<Integer>();	
			
			int i = 0;
			for(i = 0; i<nums.length; i++){
				if(numberOfInt.contains(nums[i]))
					break;
				else
					numberOfInt.add(nums[i]);
			}
			
			if(i == nums.length)
				return false;
			else
				return true;
		}
	}
	
	
	public boolean twoSum(int[] nums, int target){
		HashSet<Integer> numbers = new HashSet<Integer>();
		
		for(int i = 0; i<nums.length; i++)
			if(!numbers.contains(nums[i]))
				numbers.add(nums[i]);
		
		int i = 0;
		for(int temp; i<nums.length; i++){
			temp = nums[i];
			if(target>temp)
				if(numbers.contains(target-temp))
					break;
		}
		
		if(i==nums.length)
			return false;
		else
			return true;
	}
	
	public static void main(String[] args) {

		
		
		//execution.printFizzBuzz(0);
		//execution.moveZeros(null);
		//System.out.println(execution.isAnagram("", ""));
		//System.out.println(execution.containsDuplicate(new int[]{0, 23, 234 , 45, 34, 0}));
		//System.out.println(execution.twoSum(new int[]{2, 7, 11, 15}, 20));
	}

}
