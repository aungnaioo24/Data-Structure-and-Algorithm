package com.aungnaioo;

public class BigO_2 {

	public void log(int[] numbers) {
		
		// We can tell this as O(1+n+1), O(2+n)
		// Since 'n' can be million of times, we can also tell this as O(n) by dropping +2 constant.
		// +2 doesn't matter when n is large 
		System.out.println(); // O(1)
		for (int number: numbers) // O(n)
			System.out.println(number);
		System.out.println(); // O(1)
		
		// O(2n), O(n+n)
		// We can drop 2* constant, O(n). Both represent linear growth
		// as we care only about input size
		for (int number: numbers) // O(n)
			System.out.println(number);
		for (int number: numbers) // O(n)
			System.out.println(number);
		
		
		
	}
	
	public void log2(int[] numbers, String[] names) {
		
		// O(n+m) or O(n) because the runtime of this method increases linearly
		for (int number: numbers) // O(n)
			System.out.println(number);
		for (String name: names) // O(m)
			System.out.println(name);
		
	}
	
}
