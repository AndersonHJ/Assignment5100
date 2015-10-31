package assignment5;

import java.util.Arrays;

/**
 * Our own stack, which include methods as push, pop, top, empty
 * */
public class MyStack {
	
	private int[] Stack = null; // The stack of class MyStack
	private int size;
	
	/** Constructer of MyStack class */
	public MyStack(){
		this.size = 0;
		this.Stack = new int[size];
	}
	
	/** 
	 * Constructer of MyStack class 
	 * 
	 * @param size the size of stack you want to create
	 * */
	public MyStack(int size){
		if(size<0)
			throw new IllegalArgumentException();
		this.size = size;
		this.Stack = new int[size];
	}
	
	/** Get the size of stack */
	public int size(){
		return this.size;
	}
	
    /** 
     * Push element x onto stack.
     *  
     * @param x the element would be added to the top of the stack
     * */
    public void push(int x) {
    	size++;
        Stack = Arrays.copyOf(Stack, size);
        Stack[size-1] = x;
    }

   /** Removes the element on top of the stack.*/
    public void pop() throws ArrayIndexOutOfBoundsException {
        if(size == 0)
        	throw new ArrayIndexOutOfBoundsException();
        else{
        	size--;
        	System.arraycopy(Stack, 0, Stack, 0, size);
        }
    }

    /** Get the top element.*/
    public int top() throws ArrayIndexOutOfBoundsException {
    	if(size ==0)
    		throw new ArrayIndexOutOfBoundsException();
    	else
    		return Stack[size-1];
    }

    /** Return whether the stack is empty.*/
    public boolean empty() {
        
    	return size == 0;
    }

}
