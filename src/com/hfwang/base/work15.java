package com.hfwang.base;

import java.util.Scanner;

public class work15 {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		int a,m,n;
		m = reader.nextInt();
		n = reader.nextInt();
		
		if(n>m)
		{
			a=m;m=n;n=a;
		}
		int maxyue=1;
		for(int i=1;i<=n;i++)
		{
			if (n%i==0&&m%i==0)
			{
				maxyue=i;
			}
		}
		System.out.println(maxyue+"�����Լ��");
		System.out.println((m*n)/maxyue+"����С������");
	}

}
