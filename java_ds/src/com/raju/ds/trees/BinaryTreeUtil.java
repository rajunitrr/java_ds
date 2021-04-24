package com.raju.ds.trees;

import java.util.ArrayList;
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
			System.out.print(root.getData()+" ");
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
	
	static int maxLevel;
	public static void leftViewOfTreeWithRecursion(BinaryTree root,int level) {
		
		if(root==null) {
			return ;
		}
		
		if(level>=maxLevel) {
			System.out.print(root.getData()+" ");
			maxLevel++;
		}
		
		leftViewOfTreeWithRecursion(root.left, level+1);
		leftViewOfTreeWithRecursion(root.right, level+1);
		
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
	static int maxLevelR;
	public static void rightViewOfTreeWithRecursion(BinaryTree root,int level, int maxLevel) {
		
		if(root==null) {
			return ;
		}
		
		if(level>=maxLevelR) {
			System.out.print(root.getData()+" ");
			maxLevelR++;
		}
		rightViewOfTreeWithRecursion(root.right, level+1,maxLevel);
		rightViewOfTreeWithRecursion(root.left, level+1,maxLevel);
		
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

	public static  BinaryTree  mirrorTree(BinaryTree root) {

		if(root==null) {
			return null;
		}
		
		BinaryTree temp=root.left;
		root.left=root.right;
		root.right=temp;
		
		mirrorTree(root.left);
		mirrorTree(root.right);
		
		return root;
	}
	
	
	public static BinaryTree deleteTree(BinaryTree node) {

		if (node == null) {
			return null;
		}

		node.left = deleteTree(node.left);
		node.right = deleteTree(node.right);

		System.out.println("Deleting the node " + node.getData());
		node = null;
		return node;

	}

	public static boolean checkForIdentical(BinaryTree node1, BinaryTree node2) {

		if (node1 == null && node2 == null) {
			return true;
		}

		if (node1 == null || node2 == null) {
			return false;
		}

		return node1.getData() == node2.getData() && checkForIdentical(node1.left, node2.left)
				&& checkForIdentical(node1.right, node2.right);

	}
	
	public static void printBoundary(BinaryTree node) {
	    if (node != null) {
	      System.out.print(node.data + " ");

	      printBoundaryLeft(node.left);

	      printLeaves(node.left);
	      printLeaves(node.right);

	      printBoundaryRight(node.right);
	    }	  }

	private static void printBoundaryLeft(BinaryTree node) {

		if (node == null) {
			return;
		}
		if (node.left != null) {
			System.out.print(node.data + " ");
			printBoundaryLeft(node.left);
		} else if (node.right != null) {
			System.out.print(node.data + " ");
			printBoundaryLeft(node.right);
		}

	}
	
	private static void printLeaves(BinaryTree node) {

		if(node==null) {
			return;		}		
		
		if(node.left==null && node.right==null) {
			System.out.print(node.data+" ");
		}
		
		printLeaves(node.left);
		printLeaves(node.right);
	}
	
	private static void printBoundaryRight(BinaryTree node) {
		if (node == null) {
			return;
		}

		if (node.right != null) {
			System.out.print(node.data + " ");
			printBoundaryRight(node.right);
		} else if (node.left != null) {
			System.out.print(node.data + " ");
			printBoundaryRight(node.left);
		}
		
	}

	public static void printVerticalOrder(BinaryTree root) {
		
		if(root==null) {
			return;
		}
		
		Map<Integer,ArrayList<Integer>> map=new TreeMap<>();
		Queue<BinaryTree> queue=new LinkedList<>();
		queue.add(root);
		
		while(!queue.isEmpty()) {
			
			BinaryTree temp=queue.poll();
			int h=temp.getHeight();
			
			if(map.containsKey(h)) {
				map.get(h).add(temp.data);
			}else {
				ArrayList<Integer> list=new ArrayList<>();
				list.add(temp.data);
				map.put(h, list);
			}
			
			if(temp.left!=null) {
				temp.left.setHeight(h-1);
				queue.add(temp.left);
			}
			
			if(temp.right!=null) {
				temp.right.setHeight(h+1);
				queue.add(temp.right);
			}
			
			
		}
		
		//System.out.println(map.values());

		for (Map.Entry<Integer, ArrayList<Integer>> vlist : map.entrySet()) {

			for (Integer i : vlist.getValue()) {
				System.out.print(i + " ");
			}

		}
		
		
		
	}
	
	
	public static void printVerticalSum(BinaryTree root) {
		
		if(root==null) {
			return;
		}
		
		Map<Integer,Integer> map=new TreeMap<>();
		Queue<BinaryTree> queue=new LinkedList<>();
		queue.add(root);
		
		while(!queue.isEmpty()) {
		
			BinaryTree temp=queue.poll();
			int h=temp.getHeight();
			
			if(map.containsKey(h)) {
				map.put(h,map.get(h)+temp.data);
			}else {				
				map.put(h, temp.data);
			}
			
			if(temp.left!=null) {
				temp.left.setHeight(h-1);
				queue.add(temp.left);
			}
			
			if(temp.right!=null) {
				temp.right.setHeight(h+1);
				queue.add(temp.right);
			}
			
		}
		
		System.out.println(map.values());
		
		
	}

	
	public static void printSumOfLevel(BinaryTree root) {

		if (root == null) {
			return;
		}

		Queue<BinaryTree> queue = new LinkedList<>();
		queue.add(root);

		while (!queue.isEmpty()) {

			int n = queue.size();

			int sum = 0;

			for (int i = 0; i < n; i++) {

				BinaryTree temp = queue.remove();
				sum += temp.data;
				
				if(temp.left!=null) {
					queue.add(temp.left);
				}
				
				if(temp.right!=null) {
					queue.add(temp.right);
				}
				
			}
			System.out.print(sum+" ");

		}

	}

	
	

}