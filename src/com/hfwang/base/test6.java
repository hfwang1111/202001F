package com.hfwang.base;

import java.util.Scanner;

public class test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		int year,mon,day;
		year = reader.nextInt();
		mon = reader.nextInt();
		day = reader.nextInt();
		int day2;
		if(year%4==0&&year%100!=0)
			day2=29;
		else if(year%400==0)
			day2=29;
		else
			day2=28;
		


		
		System.out.println("°ÙÎ»ÊÇ"+day2);

	}

}
