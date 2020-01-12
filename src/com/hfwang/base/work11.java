package com.hfwang.base;

import java.util.Scanner;

public class work11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		int m;
		m = reader.nextInt();
		int sum=0;
		int a=2;
		for(int i=1;i<=m;i++)
		{
			sum = sum + a;
			a = a*10 + 2;
		}
		System.out.println(sum);
	}

}
