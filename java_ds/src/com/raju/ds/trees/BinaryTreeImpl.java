package com.raju.ds.trees;

public class BinaryTreeImpl {

	BinaryTree root = null;

	public static void main(String[] args) {
		BinaryTreeImpl tree = new BinaryTreeImpl();

		tree.root = new BinaryTree(1, null, null);
		tree.root.left = new BinaryTree(2, null, null);
		tree.root.right = new BinaryTree(3, null, null);
		tree.root.left.left = new BinaryTree(4, null, null);
		tree.root.left.right = new BinaryTree(5, null, null);
		tree.root.left.right.left = new BinaryTree(8, null, null);
		tree.root.right.left = new BinaryTree(6, null, null);
		tree.root.right.right = new BinaryTree(7, null, null);

		/*
		 * System.out.println("Height of tree is : " +BinaryTreeUtil.height(tree.root));
		 * System.out.println("Level Order "); BinaryTreeUtil.levelOrder(tree.root);
		 * BinaryTreeUtil.printZigZagTraversal(tree.root);
		 */
		
		BinaryTreeUtil.leftViewofTree(tree.root);
		BinaryTreeUtil.rightViewofTree(tree.root);
		 BinaryTreeUtil.bottomViewOfTree(tree.root);
		 BinaryTreeUtil.topViewOfTree(tree.root);
		System.out.println("Sum is " + BinaryTreeUtil.sumOfAllNodes(tree.root));		
		System.out.println("DifferenceEvenOddValues is " + BinaryTreeUtil.getDifferenceEvenOddValues(tree.root));
		
		
		System.out.println("Get No Of Nodes " + BinaryTreeUtil.getNoOfNodes(tree.root));
		System.out.println("Get No Of Leaf Nodes " + BinaryTreeUtil.getNoOfLeafNodes(tree.root));
		BinaryTreeUtil.printDataGivenLevel(tree.root, 3);
	}

}
