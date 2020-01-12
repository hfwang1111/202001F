package com.hfwang.base;

import java.util.Scanner;

public class work2 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int i,m;
		m = reader.nextInt();
		for(i=2;i<m;i++)
		{
			if(m%i==0)
			{
			System.out.println(m+"不是素数");
			break;
			}
		}
		if(i==m)
			System.out.println(m+"是素数");
		
	}

}
