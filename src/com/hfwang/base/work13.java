package com.hfwang.base;

import java.util.Scanner;

public class work13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		int m;
		m = reader.nextInt();
		int a,b,c,d;
		a = m/10000;
		b = (m%10000)/1000;
		c = (m%100)/10;
		d = m%10;
		if(a==d&&b==c)
			System.out.println(m+"是回文数");
		else
			System.out.println(m+"不是回文数");
	}

}