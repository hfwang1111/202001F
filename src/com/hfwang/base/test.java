package com.hfwang.base;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		int m, a, b, c;
		m = reader.nextInt();

		a = m / 100;
		b = m / 10 - a * 10;
		c = m % 10;

		System.out.println("百位是" + a);
		System.out.println("十位是" + b);
		System.out.println("个位是" + c);
	}

}
