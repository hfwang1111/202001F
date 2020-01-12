package com.hfwang.base;

public class work10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int s=1;s<=1000;s++)
		{	
			int sum = 0;
			for(int i=1;i<s;i++)
			{
				
				if(s%i==0)
				{
					sum = sum + i;
				}				
			}
			if(sum==s)
			{
				System.out.println(s);
			}
		}
	}

}
