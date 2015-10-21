package edu.au.scitech.sc2101;

public class Tree<T> {
	Node<T> root;

	public Tree() {
		root = null;
	}

	public boolean hasRoom(Node<T> n) {
		return (n.left == null || n.right == null);
	}

	public int depth() {
		return searchDepth(root);
	}		

	public int searchDepth(Node<T> node){
		if(node == null)
			return 0;
		int left = searchDepth(node.left);
		int right = searchDepth(node.right);

		int x = left > right ? left+1 : right+1;
		/*
		if (left > right)
			x = left+1;
		else
			x = right+1;
		*/
		return x;
	}



	public void add(T i) {
		Node<T> n = new Node<T>(i);
		if (root == null) {
			root = n;
			return;
		}

		// Add to left node only
		// Search for the deepest node on left handside
		addLeft(root,n);
	}

	public void addLeft(Node<T> parent, Node<T> n) {
		if (parent.left == null) {
			parent.left = n;
		} else {
			addLeft(parent.left, n);
		}
	}

	public int size() {
		return walkTree(root);
	}

	public int walkTree(Node<T> n) {
		if (n == null) return 0;
		return 1 + walkTree(n.left) + walkTree(n.right);
	}


	class Node<T> {
		Node<T> left;	// node of type T
		Node<T> right;

		T data;
		Node(T newData) {
			left = right = null;
			data = newData;
		}

		boolean isLeaf() {
			return ((left == null) && (right == null));
		}
	}
}
