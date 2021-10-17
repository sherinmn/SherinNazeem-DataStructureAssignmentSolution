package com.gl.construction.services;

import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;

public class FloorConstruction {

	public void CalculateFloor(Integer[] floorInput, int floors) {

		Integer[] sortFloorInput = floorInput.clone();

		Arrays.sort(sortFloorInput, Collections.reverseOrder());

		Stack<Integer> stack = new Stack<Integer>();
		int j = 0;

		for (int i = 0; i < floors; i++) {
			System.out.println("\nDay : " + (i + 1) + "\n");
			if (floorInput[i] == sortFloorInput[j]) {
				System.out.print(floorInput[i] + " ");
				j = j + 1;
				while (!stack.isEmpty()) {
					int x = stack.peek();
					if (x >= sortFloorInput[j]) {
						j = j + 1;
						System.out.print(x + " ");
						stack.pop();
					} else {
						break;
					}
				}
			} else if (floorInput[i] < sortFloorInput[j]) {
				stack.push(floorInput[i]);
			}
		}
		while (!stack.isEmpty()) {
			Collections.sort(stack);
			int x = stack.peek();
			System.out.print(x + " ");
			stack.pop();
		}

	}

}
