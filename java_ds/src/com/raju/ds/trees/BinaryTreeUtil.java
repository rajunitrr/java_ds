package com.raju.ds.trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinaryTreeUtil {

	public static void preOrderRecursion(BinaryTree root) {

		if (root != null) {
			System.out.println(root.getData());
			preOrderRecursion(root.left);
			preOrderRecursion(root.right);
		}
	}

	public static void preOrderIteration(BinaryTree root) {

		if (root == null) {
			return;
		}

		Stack<BinaryTree> stack = new Stack<>();
		stack.push(root);
		while (!stack.isEmpty()) {

			BinaryTree temp = stack.pop();
			System.out.println(temp.getData());

			if (temp.right != null) {
				stack.push(temp.right);
			}

			if (temp.left != null) {
				stack.push(temp.left);
			}

		}

	}
	
	public static void inorderRecursion(BinaryTree root) {

		if (root != null) {
			inorderRecursion(root.left);
			System.out.println(root.getData());
			inorderRecursion(root.right);

		}
	}
	
	public static void inorderIteration(BinaryTree root) {

		if (root == null) {
			System.out.println("Tree is Empty");
			return;

		}

		BinaryTree currentNode = root;
		boolean isDone = false;
		Stack<BinaryTree> stack = new Stack<>();
		while (!isDone) {
			if (currentNode != null) {
				stack.push(currentNode);
				currentNode = currentNode.left;
			} else {

				if (stack.isEmpty()) {
					isDone = true;
				}
				currentNode = stack.pop();
				System.out.println(currentNode.getData());
				currentNode = currentNode.right;
			}

		}
	}
	
	public static void postOrderRecursion(BinaryTree root) {

		if (root != null) {
			postOrderRecursion(root.left);
			postOrderRecursion(root.right);
			System.out.println(root.getData());

		}

	}
	
	public static void postOrderIteration(BinaryTree root) {

		if (root == null) {
			System.out.println("Tree is empty !!");
			return ;

		}

		
		
	}
	
	public static int height(BinaryTree root) {

		if (root == null) {
			return -1;
		}
		int left = height(root.left);
		int right = height(root.right);
		return left > right ? left + 1 : right + 1;
	}
	
	public static void levelOrder(BinaryTree root) {

		if (root == null) {
			return;
		}

		Queue<BinaryTree> queue = new LinkedList<BinaryTree>();
		queue.add(root);

		while (!queue.isEmpty()) {
			BinaryTree temp = queue.poll();
			System.out.println(temp.getData());

			if (temp.getLeft() != null) {
				queue.add(temp.left);
			} 
			if (temp.right != null) {
				queue.add(temp.right);
			}

		}

	}
	
	public static void printZigZagTraversal(BinaryTree root) {

		if (root == null) {
			return;
		}

		Stack<BinaryTree> currentLevel = new Stack<BinaryTree>();
		Stack<BinaryTree> nextLevel = new Stack<BinaryTree>();
		boolean leftToRight = true;

		currentLevel.push(root);

		while (!currentLevel.isEmpty()) {

			BinaryTree temp = currentLevel.pop();
			System.out.print(temp.getData() + " ");

			if (leftToRight) {

				if (temp.left != null) {
					nextLevel.push(temp.left);
				}

				if (temp.right != null) {
					nextLevel.push(temp.right);
				}

			} else {

				if (temp.right != null) {
					nextLevel.push(temp.right);
				}

				if (temp.left != null) {
					nextLevel.push(temp.left);
				}

			}

			if (currentLevel.isEmpty()) {
				leftToRight = !leftToRight;
				Stack<BinaryTree> t = currentLevel;
				currentLevel = nextLevel;
				nextLevel = t;

			}
		}

	}
	

}
