package com.aungnaioo.array;

import java.util.ArrayList;

public class DynamicArray {

	public static void main(String[] args) {
		
		// Vector: extends size by 100% - synchronized (one thread can run at a time) 
		// ArrayList: 50%
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.remove(0);
		
		System.out.println(list);
		
	}
	
}
