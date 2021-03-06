package com.aungnaioo.array;

class Array {
	
	private int length = 0;
	private int items[] = null;
	int size = 0;
	
	public Array(int length) {
		this.length = length;
	}
	
	private void createIntArray() {
		items = new int[length];
	}
	
	public void insert(int item) {
		
		if(items == null) {			
			createIntArray();
		}
		
		if(size == items.length) {
			
			int[] newIntArray = new int[length*2];
			for (int i = 0; i < length; i++) {
				newIntArray[i] = items[i];
			}
			
			items = newIntArray;
		}
		
		items [size++] = item;
	}
	
	public void removeAt(int index) {
		if (index < 0 || index >= size)
			throw new IllegalArgumentException();
		
		for (int i = index; i < size; i++)
			items[i] = items[i+1];
		
		size--;
	}
	
	public int indexOf(int item) {
		
		for (int i=0; i<size; i++)
			if (items[i] == item)
				return i;
		
		return -1;
	}
	
	public void print() {
		
		int count = 0;
		System.out.print("[");
		for (int item: items) {
			System.out.print(item);
			count++;
			if(count==size) {
				break;
			}
			System.out.print(", ");
		}
		
		System.out.print("]");
		
	}
	
}

public class Building_Array {

	public static void arrayBuild(String[] args) {
		Array numbers = new Array(3);
		numbers.insert(10);
		numbers.insert(20);
		numbers.insert(30);
		numbers.insert(40);
		numbers.removeAt(0);
		numbers.print();

		System.out.println("\nSize of an array: "+numbers.size);
		System.out.print("Index of item: "+numbers.indexOf(40));
	}
	
}
