package com.gl.transactions.main;

import java.util.*;

import com.gl.transactions.bean.Node;
import com.gl.transactions.services.SkewedBST;

public class TransactionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SkewedBST ob = new SkewedBST();

		Node node = new Node();
		Node node1 = node.newNode(50);
		Node node2 = node.newNode(30);
		Node node3 = node.newNode(60);
		Node node4 = node.newNode(10);
		Node node5 = node.newNode(40);

		node1.left = node2;
		node1.right = node3;

		node2.left = node4;

		node2.right = node5;

		ob.CreateskewedBST(node1);
		ob.display(ob.head);

	}

}
