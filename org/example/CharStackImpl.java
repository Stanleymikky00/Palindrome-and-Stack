package org.example;


public class CharStackImpl implements CharStack {
	private CharElement head; //pointer to the top (last) of the stack
	private int counter; // track the number of element

	//Constructor
	public CharStackImpl() {
		this.head = null; //start empty
		this.counter = 0;
	}

// the push(): push  a character to the top of the stack
	@Override
	public void push(char c) {
		CharElement newNode = new CharElement(c); //creat a new node
		newNode.next = head; //new node points to current top
		head = newNode; //update top to the new node
		counter++; //increase size
	}

	//pop():remove and return the top character
	@Override
	public char pop() {
		if (head == null) {
			throw new RuntimeException("Stack is empty");
		}
		char poppedValue = head.value; //get the top value(last value)
		head = head.next; //move top value to the next node
		counter--;
		return poppedValue;
	}

	@Override
	public int size() {
		return counter;
	}
}
