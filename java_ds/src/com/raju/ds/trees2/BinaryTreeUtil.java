package com.raju.ds.trees2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinaryTreeUtil {

	public static void printSumLevelWise(Node root) {

		if (root == null) {
			return;
		}

		Queue<Node> queue = new LinkedList<>();
		queue.add(root);

		while (!queue.isEmpty()) {

			int n = queue.size();

			int sum = 0;

			for (int i = 0; i < n; i++) {

				Node temp = queue.remove();
				sum += temp.data;

				if (temp.left != null) {
					queue.add(temp.left);
				}

				if (temp.right != null) {
					queue.add(temp.right);
				}

			}
			System.out.print(sum + " ");

		}
	}
	
	
	public static boolean search(Node root,int data) {
		
		if(root==null) {
			return false;
		}
				
		return root.data==data||search(root.left, data)||search(root.right, data);
	}
	
	public static void printInSpiralForm(Node root) {

		if (root == null) {
			return;
		}

		Stack<Node> s1 = new Stack<Node>();
		Stack<Node> s2 = new Stack<Node>();

		s1.push(root);
		while (!s1.isEmpty() || !s2.isEmpty()) {

			while (!s1.isEmpty()) {
				Node tmp = s1.pop();
				System.out.print(tmp.data + " ");

				if (tmp.left != null) {
					s2.push(tmp.left);
				}

				if (tmp.right != null) {
					s2.push(tmp.right);
				}
			}
			System.out.println();

			while (!s2.isEmpty()) {
				Node tmp = s2.pop();
				System.out.print(tmp.data + " ");

				if (tmp.right != null) {
					s1.push(tmp.right);
				}

				if (tmp.left != null) {
					s1.push(tmp.left);
				}
			}
			System.out.println();
		}
	}
	
	
	public static  void printBetweenTwoLevels(Node node, int min, int max) {
		
		if(node==null) {
			return;
		}
		
		Queue<Node> queue=new LinkedList<>();
		queue.add(node);
		int level=1;
		while(!queue.isEmpty()) {
			
			int n=queue.size();
			;
			for(int i=0;i<n;i++) {
				
				Node temp=queue.remove();
				
				if(level>=min && level<=max) {
					System.out.print(temp.data+" ");
				}
				
				if(temp.left!=null) {
					queue.add(temp.left);
				}
				
				if(temp.right!=null) {
					queue.add(temp.right);
				}
			}
			level++;
			
		}
	}
	
	public static void printRootToLeaf(Node node, int a[], int index) {

		if (node == null) {
			return;
		}
		a[index] = node.data;
		if (node.left==null && node.right==null) {  // node.data==value for given node path
			// print the array
			for (int i = 0; i <= index; i++) {
				System.out.print(a[i] + " ");
			}
			System.out.println();
		}
		printRootToLeaf(node.left, a, index + 1);
		printRootToLeaf(node.right, a, index + 1);

	}
	
}
