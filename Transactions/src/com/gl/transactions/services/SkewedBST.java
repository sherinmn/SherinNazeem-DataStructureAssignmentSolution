package com.gl.transactions.services;

import com.gl.transactions.bean.Node;

public class SkewedBST {

	public static Node prev = null;
	public static Node head = null;

	public static void CreateskewedBST(Node root) {
		if (root == null) {
			return;
		}
		CreateskewedBST(root.left);

		if (head == null) {
			head = root;
			root.left = null;
			prev = root;
		} else {
			prev.right = root;
			root.left = null;
			prev = root;

		}

		CreateskewedBST(root.right);
	}

	public static void display(Node root) {
		if (root == null) {
			return;
		}
		System.out.print(root.data + "-> ");
		display(root.right);
	}

}
