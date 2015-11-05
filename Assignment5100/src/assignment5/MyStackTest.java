package assignment5;

import static org.junit.Assert.*;

import org.junit.Test;

/** 
 * Test class for MyStack 
 * */
public class MyStackTest {

	MyStack stack = new MyStack();
	MyStack stackII = new MyStack(100);
	
	@Test
	public void testPush() {
//		fail("Not yet implemented"); // TODO
		System.out.println("size: " + stack.size());
		stack.push(1000);
		System.out.println("push: " + stack.top());
		System.out.println("size: " + stack.size());
		System.out.println("tope element: " + stack.top());
		stack.push(1);
		System.out.println("push: " + stack.top());
		System.out.println("size: " + stack.size());
		System.out.println("top element: " + stack.top());
	}

	@Test
	public void testPop() {
//		fail("Not yet implemented"); // TODO
		try {
			System.out.println("size: " + stack.size());
			stack.push(1000);
			System.out.println("push: " + stack.top());
			stack.push(15345);
			System.out.println("push: " + stack.top());
			stack.push(1);
			System.out.println("push: " + stack.top());
			System.out.println("size: " + stack.size());
			System.out.println("top element: " + stack.top());
			stack.pop();
			System.out.println("pop");
			System.out.println("size: " + stack.size());
			System.out.println("top element: " + stack.top());
			stack.pop();
			System.out.println("pop");
			System.out.println("size: " + stack.size());
			System.out.println("top element: " + stack.top());
			stack.pop();
			System.out.println("pop");
			System.out.println("size: " + stack.size());
			stack.push(0);
			System.out.println("push: " + stack.top());
			stack.push(12);
			System.out.println("push: " + stack.top());
			System.out.println("size: " + stack.size());
			System.out.println("top element: " + stack.top());
			stack.pop();
			System.out.println("pop");
			System.out.println("size: " + stack.size());
			System.out.println("top element: " + stack.top());
			stack.pop();
			System.out.println("pop");
			System.out.println("size: " + stack.size());

		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testTop() {
//		fail("Not yet implemented"); // TODO
		try {
			System.out.println("size: " + stack.size());
			stack.push(134);
			System.out.println("push: " + stack.top());
			System.out.println("size: " + stack.size());
			System.out.println("top element: " + stack.top());
			stack.push(1453);
			System.out.println("push: " + stack.top());
			System.out.println("size: " + stack.size());
			System.out.println("top element: " + stack.top());
			stack.pop();
			System.out.println("pop");
			System.out.println("size: " + stack.size());
			System.out.println("top element: " + stack.top());
			stack.pop();
			System.out.println("pop ");
			System.out.println("size: " + stack.size());
			
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testEmpty() {
//		fail("Not yet implemented"); // TODO
		System.out.println("empty?  " + stack.empty());
		stack.push(134);
		System.out.println("push: " + stack.top());
		System.out.println("size: " + stack.size());
		System.out.println("empty?  " + stack.empty());
		stack.push(134);
		System.out.println("push: " + stack.top());
		System.out.println("size: " + stack.size());
		System.out.println("empty?  " + stack.empty());
		stack.pop();
		System.out.println("pop");
		System.out.println("size: " + stack.size());
		System.out.println("top element: " + stack.top());
		System.out.println("empty?  " + stack.empty());
		stack.pop();
		System.out.println("pop ");
		System.out.println("empty?  " + stack.empty());
		System.out.println("size: " + stack.size());
		
	}

}
