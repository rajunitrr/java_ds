package com.raju.ds.trees;

import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;
import java.util.TreeMap;

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
			return;

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
			System.out.print(temp.getData()+" ");

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

	public static int sumOfAllNodes(BinaryTree root) {

		if (root == null) {
			return 0;
		}

		return root.getData() + sumOfAllNodes(root.left) + sumOfAllNodes(root.right);
	}

	public static int getDifferenceEvenOddValues(BinaryTree root) {
		if (root == null) {
			return 0;
		}

		return root.getData() - getDifferenceEvenOddValues(root.left) - getDifferenceEvenOddValues(root.right);
	}

	public static int getNoOfNodes(BinaryTree root) {
		if (root == null) {
			return 0;
		}
		return 1 + getNoOfNodes(root.left) + getNoOfNodes(root.right);
	}

	public static int getNoOfLeafNodes(BinaryTree root) {

		if (root == null) {
			return 0;
		}

		if (root.left == null && root.right == null) {
			return 1;
		}

		return getNoOfLeafNodes(root.left) + getNoOfLeafNodes(root.right);
	}

	public static void printDataGivenLevel(BinaryTree root, int level) {

		if (root == null) {
			return;
		}

		if (level == 1) {
			System.out.print(" " + root.getData());
			return;
		}

		printDataGivenLevel(root.left, level - 1);
		printDataGivenLevel(root.right, level - 1);
	}

	public static void bottomViewOfTree(BinaryTree root) {

		if (root == null) {
			return;
		}

		System.out.println("bottomViewOfTree");

		Queue<BinaryTree> queue = new LinkedList<>();
		root.setHeight(0);
		queue.add(root);
		Map<Integer, Integer> map = new TreeMap<Integer, Integer>();

		while (!queue.isEmpty()) {

			BinaryTree temp = queue.remove();
			int h = temp.getHeight();
			map.put(h, temp.getData());

			if (temp.left != null) {
				temp.left.setHeight(h - 1);
				queue.add(temp.left);

			}

			if (temp.right != null) {
				temp.right.setHeight(h + 1);
				queue.add(temp.right);
			}

		}

		System.out.println(map.values());
	}

	public static void topViewOfTree(BinaryTree root) {

		if (root == null) {
			return;
		}

		System.out.println("topViewOfTree");

		Queue<BinaryTree> queue = new LinkedList<>();
		root.setHeight(0);
		queue.add(root);
		Map<Integer, Integer> map = new TreeMap<Integer, Integer>();

		while (!queue.isEmpty()) {

			BinaryTree temp = queue.remove();
			int h = temp.getHeight();
			if (!map.containsKey(h))
				map.put(h, temp.getData());

			if (temp.left != null) {
				temp.left.setHeight(h - 1);
				queue.add(temp.left);

			}

			if (temp.right != null) {
				temp.right.setHeight(h + 1);
				queue.add(temp.right);
			}

		}

		System.out.println(map.values());
	}

	public static void leftViewofTree(BinaryTree root) {

		if (root == null) {
			return;
		}

		System.out.println("leftViewOfTree");

		Queue<BinaryTree> queue = new LinkedList<>();
		queue.add(root);

		while (!queue.isEmpty()) {

			int n = queue.size();
           // System.out.println("size"+n);
			for (int i = 0; i < n; i++) {

				BinaryTree temp = queue.peek();

				if (i == 0) {
					System.out.print(temp.getData()+" ");
				}

				if (temp.left != null) {
					queue.add(temp.left);
				}

				if (temp.right != null) {
					queue.add(temp.right);
				}
				queue.remove(temp);
				
			}
		}
		System.out.println();

	}

	public static void rightViewofTree(BinaryTree root) {

		if (root == null) {
			return;
		}

		System.out.println("rightViewofTree");

		Queue<BinaryTree> queue = new LinkedList<>();
		queue.add(root);

		while (!queue.isEmpty()) {

			int n = queue.size();
           // System.out.println("size"+n);
			for (int i = 0; i < n; i++) {

				BinaryTree temp = queue.peek();

				if (i == n-1) {
					System.out.print(temp.getData()+" ");
				}

				if (temp.left != null) {
					queue.add(temp.left);
				}

				if (temp.right != null) {
					queue.add(temp.right);
				}
				queue.remove(temp);
				
			}
		}
		System.out.println();

	}

	public static void levelWithRecursion(BinaryTree root) {

		if(root==null) {
			return ;
		}
		
		System.out.println("\n Level order with recursion");
		int h=height(root);
		
		for(int i=0;i<=h;i++) {
			printDataGivenLevel(root, i+1);
		}
		
	}
	
	//with recursion
	public static void reverseLevelOrder(BinaryTree root) {
		
		if(root==null) {
			return;
		}
		System.out.println("reverseLevelOrder");
		int h=height(root);
		
		for(int i=h;i>=0;i--) {
			printDataGivenLevel(root, i+1);
		}
		
	}
	
	public static void reverseLevelOrderwWithOutRecursion(BinaryTree root) {
		
		if(root==null) {
			return;
		}
		
		System.out.println("reverseLevelOrderwWithOutRecursion");
		Queue<BinaryTree> queue=new LinkedList<>();
		queue.add(root);
		Stack<Integer> stack=new Stack<>();
		
		while(!queue.isEmpty()) {
			
			BinaryTree temp=queue.remove();
			
			stack.add(temp.getData());
			
			if(temp.right!=null) {
				queue.add(temp.right);
			}
			if(temp.left!=null) {
				queue.add(temp.left);
			}
			
			
		}
		
		while(!stack.isEmpty()){
			System.out.print(stack.pop()+" ");
		}
		
	}
	
	
	

}