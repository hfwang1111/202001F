package com.hfwang.base;

public class work9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=100;i<=999;i++)
		{
			if(i==(i/100)*(i/100)*(i/100)+((i/10)%10)*((i/10)%10)*((i/10)%10)+(i%10)*(i%10)*(i%10))
				System.out.println(i);
		}
	}

}
