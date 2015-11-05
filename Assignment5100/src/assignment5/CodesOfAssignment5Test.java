package assignment5;

import static org.junit.Assert.*;

import org.junit.Test;


/** 
 * Test class for class CodesOfAssignment5 
 * */
public class CodesOfAssignment5Test {

	CodesOfAssignment5 exec = new CodesOfAssignment5();
	
	@Test
	public void testSingleNumber() {
//		fail("Not yet implemented"); // TODO	
		try {
			assertEquals(2, exec.singleNumber(new int[]{2, 3, 4, 5, 4, 5, 3}));
			assertEquals(0, exec.singleNumber(new int[]{0}));
			assertEquals(12311, exec.singleNumber(new int[]{12311, 12331, 12312, 12331, 12312}));
			assertEquals(1, exec.singleNumber(new int[]{1}));
		} catch (NullPointerException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testWordPattern() {
//		fail("Not yet implemented"); // TODO
		try {
			assertEquals(true, exec.wordPattern("abba", "java cat cat java"));
			assertEquals(false, exec.wordPattern("abba", "java java java java"));
			assertEquals(true, exec.wordPattern("abcdef", "java cat cate javac asd asdf"));
			assertEquals(true, exec.wordPattern("a", "java"));
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		} catch (NullPointerException e) {
			e.printStackTrace();
		}
		
	}

	@Test
	public void testIsValid() {
//		fail("Not yet implemented"); // TODO
		try {
			assertEquals(true, exec.isValid("()"));
			assertEquals(true, exec.isValid("[](){}"));
			assertEquals(true, exec.isValid("{}"));
			assertEquals(false, exec.isValid("(]{}"));
			assertEquals(false, exec.isValid("()[;"));
			assertEquals(false, exec.isValid("{](}"));
			
		} catch (UnavailableException e) {
			e.printStackTrace();
		}
	}

}
