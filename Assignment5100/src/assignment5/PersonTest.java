package assignment5;

import static org.junit.Assert.*;

import org.junit.Test;


/** 
 * Test class for class Person
 *  */
public class PersonTest {

	Person person = new Person("Jian", "Hou");
	Person newPerson = person;
	Person onePerson = new Person("Jian","Hou");
	
	@Test
	public void testHashCode() {
//		fail("Not yet implemented"); // TODO
		assertTrue(person.hashCode()==newPerson.hashCode());
		assertTrue(person.hashCode()==onePerson.hashCode());
		assertTrue(onePerson.hashCode()==newPerson.hashCode());
		newPerson.setFirstName("jian");
		assertFalse(newPerson.hashCode()==onePerson.hashCode());
		
		newPerson.setFirstName("Jian");
		newPerson.setLastName("Hou");
	}

	@Test
	public void testCompareTo() {
//		fail("Not yet implemented"); // TODO
		assertEquals(0, person.compareTo(newPerson));
		onePerson.setFirstName("Hian");
		assertEquals(2, person.compareTo(onePerson));
		onePerson.setFirstName("Kian");
		assertEquals(-1, person.compareTo(onePerson));
		onePerson.setFirstName("Jian");
		onePerson.setLastName("Gou");
		assertEquals(1, person.compareTo(onePerson));
		onePerson.setLastName("Hoz");
		assertEquals(-5, person.compareTo(onePerson));
		
		onePerson.setFirstName("Jian");
		onePerson.setLastName("Hou");
	}

	@Test
	public void testEqualsObject() {
//		fail("Not yet implemented"); // TODO
		assertEquals(true, person.equals(onePerson));
		assertEquals(true, newPerson.equals(onePerson));
		onePerson.setFirstName("jian");
		assertEquals(false, person.equals(onePerson));
		
		onePerson.setFirstName("Jian");
		onePerson.setLastName("Hou");
	}

	@Test
	public void testToString() {
//		fail("Not yet implemented"); // TODO
		System.out.println(onePerson.toString());
		System.out.println(person.toString());
		onePerson.setFirstName("Zhang");
		System.out.println(onePerson.toString());
		
	}

}
