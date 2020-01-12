package com.hfwang.base;

public class work19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int flag=1;
		double sum=0;
		for(double i=1;i<=100;i++)
		{
			sum=sum+flag*(1/i);
			flag=-flag;
		}
		System.out.println(sum);
	}

}
