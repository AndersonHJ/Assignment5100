package Assignment2;

import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;


public class ExecutionTest {

	Execution execution = new Execution();
	
	@Test
	public void testDetectEvenNumber() {
		fail("Not yet implemented"); // TODO
		int[] testnumbers = execution.detectEvenNumber(10);
		Assert.assertArrayEquals(testnumbers, new int[]{2, 4, 6, 8, 10});
		testnumbers = execution.detectEvenNumber(2);
		Assert.assertArrayEquals(testnumbers, new int[]{2});
		testnumbers = execution.detectEvenNumber(0);
		Assert.assertArrayEquals(testnumbers, new int[]{});
		testnumbers = execution.detectEvenNumber(1);
		Assert.assertArrayEquals(testnumbers, new int[]{});
	}

	@Test
	public void testIsPrime() {
		fail("Not yet implemented"); // TODO
		boolean testnum = execution.isPrime(1);
		Assert.assertTrue(testnum);
		testnum = execution.isPrime(97);
		Assert.assertTrue(testnum);
		testnum = execution.isPrime(13);
		Assert.assertTrue(testnum);
		
	}

	@Test
	public void testCountDigit() {
		fail("Not yet implemented"); // TODO
		int testresult = execution.countDigit(1);
		Assert.assertEquals(testresult, 1);
		testresult = execution.countDigit(0);
		Assert.assertEquals(testresult, 1);
		testresult = execution.countDigit(1433524352);
		Assert.assertEquals(testresult, 10);
	}

	@Test
	public void testCountSubLetterString() {
		fail("Not yet implemented"); // TODO
		int testresult = execution.countSubLetter("asdfasdftest");
		Assert.assertEquals(testresult, 2);
		testresult = execution.countSubLetter("a");
		Assert.assertEquals(testresult, 1);
		testresult = execution.countSubLetter("aaaaaaaaaaaaaaaa");
		Assert.assertEquals(testresult, 16);
		testresult = execution.countSubLetter("");
		Assert.assertEquals(testresult, 0);
	}

	@Test
	public void testCountSubLetterStringChar() {
		fail("Not yet implemented"); // TODO
		int testresult = execution.countSubLetter("000f000test", 'f');
		Assert.assertEquals(testresult, 1);
		testresult = execution.countSubLetter("fffffffffffffff", 'f');
		Assert.assertEquals(testresult, 15);
		testresult = execution.countSubLetter("t", 'f');
		Assert.assertEquals(testresult, 0);
		
	}

	@Test
	public void testFindMaxMinNum() {
		fail("Not yet implemented"); // TODO
		int testresult = execution.findMaxMinNum(new int[]{0,1,0,0,1}, true);
		Assert.assertEquals(testresult, 1);
		testresult = execution.findMaxMinNum(new int[]{1000,0,-2}, false);
		Assert.assertEquals(testresult, -2);
		testresult = execution.findMaxMinNum(new int[]{1000,0,-2}, true);
		Assert.assertEquals(testresult, 1000);
		
		
		
	}

}
