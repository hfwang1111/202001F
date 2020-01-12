package com.hfwang.base;

public class arrary1 {

	public static void main(String[] args) {
		int[] mylist = { 1, 2, 3, 4, 5, 6, 76, 56, 54, 3, 32, 42, 123, 0 };
		int max = 0;
		int min = 0;
		for (int i = 1; i < mylist.length; i++) {
			if (mylist[i] > mylist[max]) {
				max = i;
			}
			if (mylist[i] < mylist[min]) {
				min = i;
			}
		}
		System.out.println("max:" + mylist[max] + "位于mylist[" + max + "]");
		System.out.println("min:" + mylist[min] + "位于mylist[" + min + "]");

	}

}
