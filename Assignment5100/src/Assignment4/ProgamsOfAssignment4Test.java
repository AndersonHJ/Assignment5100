package Assignment4;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class ProgamsOfAssignment4Test {
	
	ProgamsOfAssignment4 execution = new ProgamsOfAssignment4();
	
	@Test
	public void testFindGroups() {
//		fail("Not yet implemented"); // TODO
		int[] results = execution.findGroups(new int[]{1, 0, 0, 0 , 1, 0, 1, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0});
		
		Assert.assertArrayEquals(new int[]{1, 3, 8, 6, 15, 3}, results);
		
		results = execution.findGroups(new int[]{1, 0, 0, 1, 0, 1, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0});
		
		Assert.assertArrayEquals(new int[]{1, 2, 7, 6, 14, 2}, results);
	}

	@Test
	public void testReverseSentence() {
//		fail("Not yet implemented"); // TODO
		String results = execution.reverseSentence("Uber still doesn't know who hacked it eight months ago");
		
		Assert.assertEquals("ago months eight it hacked who know doesn't still Uber", results);
	}

	@Test
	public void testPrintPyramid() {
//		fail("Not yet implemented"); // TODO
		execution.printPyramid(10);

		execution.printPyramid(5);
	}

	@Test
	public void testFindFibonacci() {
//		fail("Not yet implemented"); // TODO
		ArrayList result = execution.findFibonacci(200);
		int[] comp = new int[result.size()];
		for(int i = 0; i<result.size(); i++)
			comp[i] = (int) result.get(i);
		
		Assert.assertArrayEquals(new int[]{1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144}, comp);
	}

	@Test
	public void testCapitalizeFirstLetter() {
//		fail("Not yet implemented"); // TODO
		char[] results = execution.capitalizeFirstLetter("Uber allowed login credentials for their driver database to be publicly");
		
		Assert.assertArrayEquals("Uber Allowed Login Credentials For Their Driver Database To Be Publicly".toCharArray(), results);
		
	}

	@Test
	public void testFindThreeMoreLetters() {
//		fail("Not yet implemented"); // TODO
		
		String results = execution.findThreeMoreLetters("Uber Allowed Login Credentials For Their Driver Database To Be Publicly");
		
		Assert.assertEquals("Uber Allowed Login Credentials Their Driver Database Publicly ", results);
	}

}
