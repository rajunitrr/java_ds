package com.raju.ds.trees2;

class Node {

	int data;
	int height;
	Node left;
	Node right;
}

public class BinaryTree {

	private Node createNewNode(int value) {

		Node node = new Node();
		node.data = value;
		node.height = 0;
		node.left = null;
		node.right = null;

		return node;
	}

	public static void main(String[] args) {

		BinaryTree tree = new BinaryTree();

		Node root = tree.createNewNode(2);
		root.left = tree.createNewNode(1);
		root.right = tree.createNewNode(3);
		root.left.left = tree.createNewNode(4);
		root.left.right = tree.createNewNode(5);
		root.right.left = tree.createNewNode(6);
		root.right.right = tree.createNewNode(7);
		root.left.right.left = tree.createNewNode(8);
		 

		System.out.println("printSumLevelWise ");
		BinaryTreeUtil.printSumLevelWise(root);
		System.out.println("\n Search 8 : " + BinaryTreeUtil.search(root, 8));
		System.out.println("printInSpiralForm ");
		BinaryTreeUtil.printInSpiralForm(root);
		System.out.println("printBetweenTwoLevels ");
		BinaryTreeUtil.printBetweenTwoLevels(root, 1, 3);
		System.out.println("\n printRootToLeaf ");
		BinaryTreeUtil.printRootToLeaf(root, new int[8], 0);
		System.out.println("\n printAncesstor ");
		// BinaryTreeUtil.printAncesstor(root,new int[8],0,8);
		boolean result = BinaryTreeUtil.printAncesstor(root, 2);
		System.out.println("result " + result);

		int value = 7;
		System.out.println("Print sibling of " + value);
		Node temp = BinaryTreeUtil.printSibling(root, value);
		if (temp != null) {
			System.out.println(temp.data);
		} else {
			System.out.println("null");
		}

		System.out.println("Check Siblings " + BinaryTreeUtil.checkSiblings(root, 2, 3));

		int a = 1;
		int b = 6;
		System.out.println("LCA of " + a + "," + b + "is");
		Node t = BinaryTreeUtil.LCA(root, a, b);

		System.out.println(t.data);

		System.out.println("distance " + BinaryTreeUtil.findtheDistance(root, 1, 7));

		System.out.println("isBST " + BinaryTreeUtil.isBST(root));

	}

}
