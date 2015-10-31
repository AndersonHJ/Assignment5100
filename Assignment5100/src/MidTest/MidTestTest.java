package MidTest;
import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class MidTestTest {

	MidTest execution = new MidTest(); 
	
	@Test
	public void testPrintFizzBuzz() { 
//		fail("Not yet implemented"); // TODO 
		Assert.assertEquals("fizz buzz", execution.printFizzBuzz(0));
		Assert.assertEquals("fizz buzz", execution.printFizzBuzz(15));
		Assert.assertEquals("buzz", execution.printFizzBuzz(5000));
		Assert.assertEquals("fizz ", execution.printFizzBuzz(111111));
	}

	@Test
	public void testMoveZeros() {
//		fail("Not yet implemented"); // TODO	
		try {
			Assert.assertArrayEquals(new int[]{}, execution.moveZeros(new int[]{}));
			Assert.assertArrayEquals(new int[]{1, 0, 0, 0, 0}, execution.moveZeros(new int[]{0, 0, 0, 0, 1}));
			Assert.assertArrayEquals(new int[]{12, 34, 55, 7, 0, 0, 0, 0, 0}, execution.moveZeros(new int[]{0, 12, 0, 34, 0, 55, 0, 7, 0}));
		} catch (NullPointerException e) {
			System.out.println("The array is null");
			e.printStackTrace();
		}
	}

	@Test
	public void testIsAnagram() {
//		fail("Not yet implemented"); // TODO
		try {
			Assert.assertTrue(execution.isAnagram("asdfasdf", "ffsasadd"));
			Assert.assertTrue(execution.isAnagram("f", "ff"));
			Assert.assertTrue(execution.isAnagram("f", "f"));
			Assert.assertFalse(execution.isAnagram("asdfasdf", "ffsassdd"));
			Assert.assertTrue(execution.isAnagram("", ""));
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("The length of String s and String t must be the same");
			e.printStackTrace();
		} catch (NullPointerException e) {
			System.out.println("String can't be null");
			e.printStackTrace();
		}
	}

	@Test
	public void testContainsDuplicate() {
//		fail("Not yet implemented"); // TODO	
		try {
			Assert.assertFalse(execution.containsDuplicate(new int[]{}));
			Assert.assertFalse(execution.containsDuplicate(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 0}));
			Assert.assertTrue(execution.containsDuplicate(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 1}));
			Assert.assertTrue(execution.containsDuplicate(new int[]{1,1}));
			Assert.assertFalse(execution.containsDuplicate(new int[]{1}));
		} catch (NullPointerException e) {
			System.out.println("The array is null");
			e.printStackTrace();
		}
	}

	@Test
	public void testTwoSum() {
//		fail("Not yet implemented"); // TODO	
		try {
			Assert.assertFalse(execution.twoSum(new int[]{2}, 3));
			Assert.assertTrue(execution.twoSum(new int[]{2, 2, 7, 10, 23, 0}, 9));
			Assert.assertTrue(execution.twoSum(new int[]{2, 2, 7, 10, 23, 0}, 4));
			Assert.assertTrue(execution.twoSum(new int[]{2, 2, 7, 10, 23, 0}, 9));
			Assert.assertTrue(execution.twoSum(new int[]{2, 2, 7, 10, 23, 0}, 33));
			Assert.assertTrue(execution.twoSum(new int[]{2, 2, 2, 2, 0}, 2));
			Assert.assertTrue(execution.twoSum(new int[]{2, 0, 0, 1, 1}, 3));
		} catch (NullPointerException e) {
			System.out.println("The array is null");
			e.printStackTrace();
		}
	
	}

}
