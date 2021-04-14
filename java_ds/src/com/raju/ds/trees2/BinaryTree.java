package com.raju.ds.trees2;

class Node {
	
	int data;
	int height;
	Node left;
	Node right;	
}

public class BinaryTree {
	
	
	private Node createNewNode(int value) {
		
		Node node=new Node();
		node.data=value;
		node.height=0;
		node.left=null;
		node.right=null;
		
		return node;
	}

	public static void main(String[] args) {

		BinaryTree tree=new BinaryTree();
		
		Node root=tree.createNewNode(1);
		root.left=tree.createNewNode(2);
		root.right=tree.createNewNode(3);
		root.left.left=tree.createNewNode(4);
		root.left.right=tree.createNewNode(5);
		root.right.left=tree.createNewNode(6);
		root.right.right=tree.createNewNode(7);
		root.left.right.left=tree.createNewNode(8);
		
		System.out.println("printSumLevelWise ");
		BinaryTreeUtil.printSumLevelWise(root);
		System.out.println("\n Search 8 : "+BinaryTreeUtil.search(root,8));
		System.out.println("printInSpiralForm ");
		BinaryTreeUtil.printInSpiralForm(root);
		System.out.println("printBetweenTwoLevels ");
		BinaryTreeUtil.printBetweenTwoLevels(root,1,3);
		System.out.println("\n printRootToLeaf ");
		BinaryTreeUtil.printRootToLeaf(root,new int[8],0);
		
	
	}

}
