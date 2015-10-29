package assignment4;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import assignment4.AdvancedProgramsOfAssignment4.*;


public class AdvancedProgramsOfAssignment4Test {

	AdvancedProgramsOfAssignment4 execution = new AdvancedProgramsOfAssignment4();
	
	@Test
	public void testFindZeroGroup() {
//		fail("Not yet implemented"); // TODO
		ZeroIndex[] results = execution.findZeroGroup(new int[]{1, 0, 0, 0 , 1, 0, 1, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0});

		Assert.assertTrue(execution.to(1, 3).equals(results[0]));
		Assert.assertTrue(execution.to(8, 6).equals(results[1]));
		Assert.assertTrue(execution.to(15, 3).equals(results[2]));
		
		results = execution.findZeroGroup(new int[]{1, 0, 0, 1, 0, 1, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0});
		
		Assert.assertTrue(execution.to(1, 2).equals(results[0]));
		Assert.assertTrue(execution.to(7, 6).equals(results[1]));
		Assert.assertTrue(execution.to(14, 2).equals(results[2]));
	}
	
	@Test
	public void testReverseSentence() {
//		fail("Not yet implemented"); // TODO
		char[] results = execution.reverseSentence("Uber still doesn't know who hacked it eight months ago");
		
		Assert.assertArrayEquals("ago months eight it hacked who know doesn't still Uber".toCharArray(), results);
	}

	@Test
	public void testFindThreeMoreLetters() {
//		fail("Not yet implemented"); // TODO
		String results = execution.findThreeMoreLetters("Uber Allowed Login Credentials For Their Driver Database To Be Publicly");
		
		Assert.assertEquals("Uber Allowed Login Credentials Their Driver Database Publicly ", results);
		
	}



}
