package Assignment2;

import static org.junit.Assert.*;

import org.junit.Test;

public class ExecutionTest {

	Execution execution = new Execution();
	
	@Test
	public void testDetectEvenNumber() {
		fail("Not yet implemented"); // TODO
		int[] testnumbers = execution.detectEvenNumber(100);
		
		System.out.print(testnumbers[0]);
		for(int i = 1; i < testnumbers.length; i++)
			System.out.print(", " + testnumbers[i]);
	}

	@Test
	public void testIsPrime() {
		fail("Not yet implemented"); // TODO
		boolean testnum = execution.isPrime(1);
		
		System.out.print(testnum);
		
	}

	@Test
	public void testCountDigit() {
		fail("Not yet implemented"); // TODO
		int testresult = execution.countDigit(1);
		
		System.out.print(testresult);
	}

	@Test
	public void testCountSubLetterString() {
		fail("Not yet implemented"); // TODO
		String test = "asdfasdf";
		int testresult = execution.countSubLetter(test);
		
		System.out.print("it has " + testresult + " a");
	}

	@Test
	public void testCountSubLetterStringChar() {
		fail("Not yet implemented"); // TODO
		String test = "000f000";
		char testchar = 'f';
		int testresult = execution.countSubLetter(test, testchar);
		
		System.out.print(test + " has " + testresult + " " + testchar);
	}

	@Test
	public void testFindMaxMinNum() {
		fail("Not yet implemented"); // TODO
	
		int testresult = execution.findMaxMinNum(new int[]{0,1,0,0,1}, true);
		
		System.out.print(testresult);
	}

}
