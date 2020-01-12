package com.hfwang.base;

public class work20 {

	public static void main(String[] args) {
		
		double e =1;
		
		int n=100;
		for(int i=1;i<=n;i++)
		{
			double jiechen=1;
			for(int a=1;a<=i;a++)
				jiechen=jiechen*a;
			
			e=e+1.0/jiechen;	
		}
		System.out.println(e);
	}

}
