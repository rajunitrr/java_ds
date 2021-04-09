package com.raju.ds.stacks;

public class Stack {
	private int a[];
	private int top = -1;
	private int size = 20;

	Stack() {
		a = new int[20];
	}

	public boolean isEmpty() {

		return top == -1;
	}

	public boolean isFull() {

		return size == top;
	}

	public void push(int x) {

		if (!isFull()) {
			a[++top] = x;
		} else {
			System.out.println("Stack is Full!!");
		}

	}

	public int pop() {

		if (isEmpty()) {
			System.out.println("Stack is Empty");
			return -1;
		}
		return a[top--];

	}

	public int peek() {

		return !isEmpty() ? a[top] : -1;
	}

	public void displayStacks() {

		if (!isEmpty()) {

			for (int i = 0; i <= top; i++) {
				System.out.println(a[i]);
			}
		} else {
			System.out.println("Stack is empty !! please fill the data");
		}
	}

}
