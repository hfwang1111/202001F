package com.hfwang.base;

public class test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x1=1;
		double x2=2;
		double a=16;
	
			
		while(Math.abs(x1-x2)>1E-6)
		{	
			x1=x2;	
			x2=0.5*(x1+a/x1);	
					
		}
		System.out.print(x2);
		
	}

}
