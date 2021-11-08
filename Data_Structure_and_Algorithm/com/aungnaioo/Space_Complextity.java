package com.aungnaioo;

public class Space_Complextity {

	public void greet(String[] names) {
		
		// O(n) space, direct proportion of the size of the input array
		@SuppressWarnings("unused")
		String[] copy = new String[names.length];
		
		// O(1) space, i is independent from the size of the array
		for (int i = 0; i < names.length; i++) {
			System.out.println("Hi "+names[i]);
		}
		
	}
	
}
