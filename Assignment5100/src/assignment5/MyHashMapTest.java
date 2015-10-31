package assignment5;

import static org.junit.Assert.*;

import org.junit.Test;

/** Test class for the class MyHashMap */
public class MyHashMapTest {

	MyHashMap<Character, Integer> hMap = new MyHashMap<>();
	
	@Test
	public void testGetValue() {
//		fail("Not yet implemented"); // TODO
		try {
			hMap.put('a', 1000);
			hMap.put('b', 2000);
			hMap.put('c', 3000);
			hMap.put('d', 4000);
			
			assertEquals(1000, (int)hMap.getValue('a'));
			assertEquals(3000, (int)hMap.getValue('c'));
			assertEquals(4000, (int)hMap.getValue('d'));
			assertEquals(null, (int)hMap.getValue('f'));
			
			hMap.remove('c');
			assertEquals(null, hMap.getValue('c'));
			
		} catch (NullPointerException e) {
			System.out.println("There is no this key in the map");
			e.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		
	}

	@Test
	public void testContainsKey() {
//		fail("Not yet implemented"); // TODO
		try {
			hMap.put('a', 1000);
			hMap.put('b', 2000);
			hMap.put('c', 3000);
			hMap.put('d', 4000);
			
			assertEquals(true, hMap.containsKey('c'));
			assertEquals(false, hMap.containsKey('f'));
			assertEquals(true, hMap.containsKey('a'));
			assertEquals(true, hMap.containsKey('b'));
			
			hMap.remove('c');
			assertEquals(false, hMap.containsKey('c'));
			
		} catch (NullPointerException e) {
			e.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		
	}

	@Test
	public void testContainsValue() {
//		fail("Not yet implemented"); // TODO
		try {
			hMap.put('a', 1000);
			hMap.put('b', 2000);
			hMap.put('c', 3000);
			hMap.put('d', 4000);
			
			assertEquals(true, hMap.containsValue(1000));
			assertEquals(false, hMap.containsValue(6000));
			assertEquals(true, hMap.containsValue(2000));
			assertEquals(true, hMap.containsValue(4000));
			
			hMap.remove('b');
			assertEquals(false, hMap.containsValue(2000));
			
		} catch (NullPointerException e) {
			e.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testPut() {
//		fail("Not yet implemented"); // TODO
		try {
			assertEquals(0, hMap.size());
			hMap.put('a', 1000);
			hMap.put('b', 2000);
			hMap.put('c', 3000);
			hMap.put('d', 4000);
			
			assertEquals(4, hMap.size());
			assertEquals(true, hMap.containsKey('a'));
			assertEquals(true, hMap.containsValue(3000));
			
		} catch (NullPointerException e) {
			e.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testRemove() {
//		fail("Not yet implemented"); // TODO
		try {
			assertEquals(0, hMap.size());
			hMap.put('a', 1000);
			hMap.put('b', 2000);
			hMap.put('c', 3000);
			hMap.put('d', 4000);
			
			assertEquals(4, hMap.size());
			assertEquals(true, hMap.containsKey('a'));
			assertEquals(true, hMap.containsValue(3000));
			
			hMap.remove('c');
			assertEquals(3, hMap.size());
			assertEquals(false, hMap.containsKey('c'));
			assertEquals(null, hMap.getValue('c'));

			hMap.remove('a');
			assertEquals(2, hMap.size());
			assertEquals(false, hMap.containsKey('a'));
			assertEquals(null, hMap.getValue('a'));
		} catch (NullPointerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		
	}

}
