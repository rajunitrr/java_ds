package com.raju.ds.strings;

import java.util.Stack;

public class ValidParentheses {

	private static boolean isParenthesisMatched(char a, char b) {

		if ((a == '(' && b == ')') || (a == '{' && b == '}') || (a == '[' && b == ']')) {
			return true;
		}
		return false;
	}

	public static boolean isValid(String s) {
		Stack<Character> stack = new Stack<Character>();

		for (int i = 0; i < s.length(); i++) {

			char c = s.charAt(i);
			if (c == '(' || c == '{' || c == '[') {
				stack.push(c);
			} else {

				if (!stack.isEmpty()) {
					char d = stack.peek();
					if (isParenthesisMatched(d, c)) {
						stack.pop();
					} else {
						return false;
					}
				}else {
					return false;
				}
			}

		}

		return stack.isEmpty();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(isValid("]"));

	}

}
