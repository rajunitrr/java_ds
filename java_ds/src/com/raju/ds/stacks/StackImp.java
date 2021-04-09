package com.raju.ds.stacks;

public class StackImp {

	static void push_bootom(Stack stack, int x) {

		if (stack.isEmpty()) {
			stack.push(x);
			return;
		}
		int y = stack.pop();
		push_bootom(stack, x);
		stack.push(y);

	}
	
	static void reverseStack(Stack stack) {
		
		if(stack.isEmpty()) {
			return ;
		}
		
		int x=stack.pop();
		reverseStack(stack);
		stack.push(x);
		push_bootom(stack, x);

	}

	public static void main(String[] args) {

		Stack stack = new Stack();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		//stack.displayStacks();
		//push_bootom(stack, 5);
		//stack.displayStacks();
		reverseStack(stack);
		stack.displayStacks();
	

	}

}
