package com.aungnaioo.Linklist;

import java.util.NoSuchElementException;

public class LinkedList {

	private Node first;
	private Node last;
	public int size = 0;
	
	public void addLast(int item) {
		var node = new Node(item);
		
		if(isEmpty())
			first = last = node;
		else {
			last.next = node;
			last = node;
		}
		size++;
	}
	
	public void addFirst(int item) {
		var node = new Node(item);
		
		if(isEmpty())
			first = last = node;
		else  {
			node.next = first;
			first = node;
		}
		
		size++;
	}
	
	private class Node {
		
		private int value;
		private Node next;
		
		public Node(int value) {
			this.value = value;
		}
		
	}
	
	private boolean isEmpty() {
		return first == null; 
	}
	
	public int indexOf(int item) {
		int index = 0;
		var current = first;
		while(current!=null) {
			if(current.value == item) return index;
			current = current.next;
			index++;
		}
		
		return -1;
	}
	
	public boolean contain(int item) {
		return indexOf(item) != -1;
	}
	
	public void removeFirst() {
		if(isEmpty()) throw new NoSuchElementException();
		
		if(first == last) {
			first = last = null;
			return;
		}
		
		var second = first.next;
		first.next = null;
		first = second;
		size--;
	}
	
	public void removeLast() {
		if(isEmpty()) throw new NoSuchElementException();
		
		if(first == last) {
			first = last = null;
			return;
		}
		
		var previous = getPreviousNode(last);
		last = previous;
		last.next = null;
		size--;
	}

	public void removeAt(int index) {
		
		if(index==0) {
			removeFirst();
			return;
		}else if(index==size-1) {
			removeLast();
			return;
		}
		
		var current = searchNode(index);
		var previous = searchPreviousNode(index);
		
		previous.next = current.next;
		current = null;
		
		size--;
	}
	
	public int search(int index) {
		return searchNode(index).value;
	}
	
	private Node searchNode(int index) {
		if(index<0 || index>=size) {
			throw new ArrayIndexOutOfBoundsException();
		}
		
		var item = first;
		
		for(int i=0; i<index; i++) {
			item = item.next;
		}
		
		return item;
	}
	
	private Node searchPreviousNode(int index) {
		
		return searchNode(index-1);
	}
	
	private Node getPreviousNode(Node node) {
		var current = first;
		while(current!=null) {
			if(current.next == node) return current;
			current = current.next;
		}
		return null;
	}
	
	public void print() {
		var current = first;
		while(current!=null) {
			System.out.println(current.value+" ");
			current = current.next;
		}
	}
	
}
