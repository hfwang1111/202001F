package com.hfwang.base;

import java.util.Scanner;

public class test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		int a[] = new int[10];
		for(int i=0;i<=9;i++)
		{
			a[i]= reader.nextInt();
		}
		int max=a[0];
		int min=a[0];
		int c=0;
		int b=0;
		for(int i=0;i<=9;i++)
		{
			if (a[i]>max)
			{max=a[i];c=i;}
			if (a[i]<min)
			{min=a[i];b=i;}
		}
		System.out.println("max:"+max+"位于"+c);
		System.out.println("min:"+min+"位于"+b);
	}

}
