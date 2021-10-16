package com.gl.construction.main;

import java.util.Scanner;

import com.gl.construction.services.FloorConstruction;

public class constructiondemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of floors");
		int floors = sc.nextInt();
		Integer[] floorInput = new Integer[floors];

		for (int i = 0; i < floors; i++) {
			System.out.println("Enter the floor size given on day : " + (i + 1));
			floorInput[i] = sc.nextInt();
		}

		FloorConstruction ob = new FloorConstruction();
		ob.CalculateFloor(floorInput, floors);

	}

}
