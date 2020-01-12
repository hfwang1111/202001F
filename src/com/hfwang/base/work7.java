package com.hfwang.base;

public class work7 {

	public static void main(String[] args) {
		int count=0;
		for(int s=101;s<=200;s++)
		{	
			int i;
			for(i=2;i<s;i++)
			{
				if(s%i==0)
					break;
			}
			if(i==s)
			{
				count++;
				System.out.println(s);
			}
		}
		System.out.println("一共有"+count+"个素数");
	}

}
