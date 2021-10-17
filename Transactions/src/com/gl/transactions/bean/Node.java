package com.gl.transactions.bean;

public class Node {
	public int data;
	public Node left;
	public Node right;

	public Node newNode(int data) {
		Node temp = new Node();

		temp.data = data;

		temp.left = null;
		temp.right = null;

		return temp;

	}

}
