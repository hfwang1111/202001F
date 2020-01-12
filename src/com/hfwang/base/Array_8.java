package com.hfwang.base;

public class Array_8 {

	public static void main(String[] args) {
		int[][] list = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int temp;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < i + 1; j++) {
				temp = list[i][j];
				list[i][j] = list[j][i];
				list[j][i] = temp;
			}
		}
		for (int i = 0; i < list.length; i++) {
			for (int j = 0; j < list[i].length; j++) {
				System.out.print(list[i][j] + " ");

			}
			System.out.print('\n');
		}

	}

}
