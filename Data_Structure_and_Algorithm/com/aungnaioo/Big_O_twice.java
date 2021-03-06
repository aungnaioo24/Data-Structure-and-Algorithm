package com.aungnaioo;

public class Big_O_twice {

	public void log(int[] numbers) {
		
		// O{n+n^2}
		// we can simplify as n^2 because it is much larger than +n
		for (int number: numbers) // O(n)
			System.out.println(number);
		
		// O(n*n), O(n^2)
		// Quadratic growth
		for(int first: numbers) // O(n)
			for(int second: numbers) // O(n)
				System.out.println(first + ", " + second);
		
	}

	public void log2(int[] numbers) {
		
		// O(n*n*n), O(n^3)
		// Quadratic growth
		for(int first: numbers) // O(n)
			for(int second: numbers) // O(n)
				for(int third: numbers) // O(n)
					System.out.println(first + ", " + second + ", " + third);
		
	}
	
}
