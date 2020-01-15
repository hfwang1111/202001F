package com.hfwang.base;

import java.util.Scanner;

public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		int m;
		m = reader.nextInt();

		if (m % 4 == 0 && m % 100 != 0)
			System.out.println(m + "是闰年");
		else if (m % 400 == 0)
			System.out.println(m + "是闰年");
		else
			System.out.println(m + "不是闰年");
		reader.close();
	}

}
