package com.hfwang.base;



public class test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double pi;
		double s=0;
		double i=1;
		int flag=1;
		while(i<=100000000)
		{
			s=s+flag*1/(2*i-1);
			flag=flag*(-1);
			i++;
		}
		pi=s*4;
		System.out.println(pi);	
	}

}
