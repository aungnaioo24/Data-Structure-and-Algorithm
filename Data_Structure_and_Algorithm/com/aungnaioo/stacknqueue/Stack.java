package com.aungnaioo.stacknqueue;

public class Stack {

	private int stack[];
	private int size;
	private static final int INITITAL_SIZE = 10;
	
	public Stack() {
		stack = new int[INITITAL_SIZE];
		size = 0;	
	}
	
	public void push(int value) {
		if(size == stack.length) {
			doubleCapacity();
		}
		
		stack[size]  = value;
		size++;
	}
	
	public int pop() {
		if(size == 0) {
			throw new ArrayIndexOutOfBoundsException();
		}
		
		int result = stack[size-1];
		stack[size-1] = 0; // clear out old value
		
		size--;
		return result;
	}
	
	public int peek() {
		if(size == 0) {
			throw new ArrayIndexOutOfBoundsException();
		}
		
		int result = stack[size-1];
		return result;
	}
	
	public int size() {
		return size;
	}
	
	public int capacity() {
		return stack.length;
	}
	
	public int capacityRemaining() {
		return stack.length-size;
	}
	
	public void empty() {
		for (int i=0; i<stack.length; i++)
			stack[i] = 0;
				
		size = 0;
	}
	
	public void compress() {
		if (size<stack.length) {
			int newCapacity = size;
			
			int[] newStack = new int[newCapacity];
			
			for(int i=0; i<stack.length; i++) {
				newStack[i] = stack[i];
			}
			
			stack = newStack;
		}
	}
	
	private void doubleCapacity() {
		int newCapacity = 2*stack.length;
		int[] newStack = new int[newCapacity];
		
		for(int i=0; i<stack.length; i++) {
			newStack[i] = stack[i];
		}
		
		stack = newStack;
	}
	
}
