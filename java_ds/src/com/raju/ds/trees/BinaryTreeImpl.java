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
		 * System.out.println(); BinaryTreeUtil.printZigZagTraversal(tree.root);
		 * System.out.println();
		 */
		/*
		 * BinaryTreeUtil.leftViewofTree(tree.root);
		 * System.out.println("leftViewOfTreeWithRecursion ");
		 * BinaryTreeUtil.leftViewOfTreeWithRecursion(tree.root,0);
		 * BinaryTreeUtil.rightViewofTree(tree.root);
		 * System.out.println("rightViewOfTreeWithRecursion");
		 * BinaryTreeUtil.rightViewOfTreeWithRecursion(tree.root,0,0);
		 * BinaryTreeUtil.bottomViewOfTree(tree.root);
		 * BinaryTreeUtil.topViewOfTree(tree.root); System.out.println("Sum is " +
		 * BinaryTreeUtil.sumOfAllNodes(tree.root));
		 * System.out.println("DifferenceEvenOddValues is " +
		 * BinaryTreeUtil.getDifferenceEvenOddValues(tree.root));
		 * 
		 * 
		 * System.out.println("Get No Of Nodes " +
		 * BinaryTreeUtil.getNoOfNodes(tree.root));
		 * System.out.println("Get No Of Leaf Nodes " +
		 * BinaryTreeUtil.getNoOfLeafNodes(tree.root));
		 * BinaryTreeUtil.printDataGivenLevel(tree.root, 3); System.out.println();
		 * BinaryTreeUtil.levelWithRecursion(tree.root); System.out.println();
		 * BinaryTreeUtil.reverseLevelOrder(tree.root); System.out.println();
		 * BinaryTreeUtil.reverseLevelOrderwWithOutRecursion(tree.root);
		 */
		
		//BinaryTree node= BinaryTreeUtil.mirrorTree(tree.root);
		//BinaryTreeUtil.inorderRecursion(node);
		//BinaryTreeUtil.deleteTree(tree.root);
		
		//System.out.println("checkForIdentical "+BinaryTreeUtil.checkForIdentical(tree.root, tree.root));
		
		//BinaryTreeUtil.printBoundary(tree.root);
		System.out.println("Vertical order ");
		BinaryTreeUtil.printVerticalOrder(tree.root);
		System.out.println("printVerticalSum ");
		BinaryTreeUtil.printVerticalSum(tree.root);
		System.out.println("printSumOfLevel ");
		BinaryTreeUtil.printSumOfLevel(tree.root);

		 
	}

}
