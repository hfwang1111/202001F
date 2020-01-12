package com.hfwang.base;

public class ClassA {
	private int x;

	public ClassA() {
		this.x = 100;
	}

	public int guessX(int num) {
		if (num > this.x) {
			return 1;
		} else if (num == x) {
			return 0;
		}
		return -1;
	}

}
