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
	
	public static void printAncesstor(Node node,int a[],int index,int value) {
		
		if(node==null) {
			return ;
		}
		a[index]=node.data;
		if(node.data==value) {
			
			for(int i=index-1 ;i>=0;i--) {
				System.out.print(a[i]+" ");
			}
			return ;
		}
		
		printAncesstor(node.left, a, index+1, value);
		printAncesstor(node.right, a, index+1, value);
		
	}
	

	public static boolean printAncesstor(Node node,int value) {
		
		if(node==null) {
			return false;
		}
		
		if(node.data==value) {
			return true;
		}
		
		if(printAncesstor(node.left, value)||printAncesstor(node.right, value)) {
			
			System.out.print(node.data+" ");
			return false;
		}
		
		return false;
	}
	
	public static Node  printSibling(Node node,int value) {
		
		if(node==null) {
			return null;
		}
		
		if(node.left!=null && node.left.data==value) {		   
			
			return node.right ;
		}
		
		if(node.right!=null &&node.right.data==value) {
			
			return node.left ;
		}
	
		Node temp=printSibling(node.left,value);
		temp=printSibling(node.right,value);
		
		return temp;
	}
	
	
	public static Node getSibling(Node node, int k) {

		if (node == null) {
			return null;
		}

		if (node.left != null && node.left.data == k) {
			return node.right;
		}

		if (node.right != null && node.right.data == k) {
			return node.left;
		}

		Node l = getSibling(node.left, k);
		if (l != null) {
			return l;
		}
		l = getSibling(node, k);
		return l;

	}
	
	public static boolean checkSiblings(Node node, int a, int b) {

		if (node == null) {
			return false;
		}

		if ((node.left != null && node.right != null)
				&& ((node.left.data == a && node.right.data == b) || (node.left.data == b && node.right.data == a))) {
			return true;
		}

		return checkSiblings(node.left, a, b) || checkSiblings(node.right, a, b);

	}
	
	public static Node LCA(Node node, int a, int b) {

		if (node == null) {
			return null;
		}

		if (node.data == a || node.data == b) {
			return node;
		}

		Node left = LCA(node.left, a, b);
		Node right = LCA(node.right, a, b);

		if (left != null && right != null) {
			return node;
		}

		return left != null ? left : right;

	}
	
	public static int findtheDistance(Node node,int a,int b) {
		
		if(node==null) {
			return -1;
		}
		
		Node lca=LCA(node, a, b);
		
		int d1=findDistanceFromParent(lca,a,0);
		int d2=findDistanceFromParent(lca,b,0);
		
		return d1+d2;
	}
	
	public static int findDistanceFromParent(Node node,int a,int level) {
		
		if(node==null) {
			return -1;
		}
		
		if(node.data==a) {
			return level;
		}
		
		int d=findDistanceFromParent(node.left, a, level+1);
		if(d!=-1) {
			return d;
		}
		 d=findDistanceFromParent(node.right, a, level+1);
		 return d;
	}
	
	static Node prev = null;

	public static boolean isBST(Node root) {

		if (root == null) {
			return true;
		}

		if (!isBST(root.left)) {
			return false;
		}

		if (prev != null && prev.data > root.data) {
			return false;
		}

		prev = root;

		return isBST(root.right);
	}
	
}
