package com.aungnaioo.Linklist;

public class LinkedListArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		var list = new LinkedList();

		list.addFirst(10); // 0
		list.addLast(20); // 1
		list.addLast(30); // 2
		list.addLast(40); // 3
		list.addLast(50); // 4
		list.addLast(60); // 5
		
		list.removeAt(1);
		list.print();
	}

}
