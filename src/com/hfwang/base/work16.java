package com.hfwang.base;

public class work16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[40];
		arr[0]=1;
		arr[1]=1;
		for(int i=2;i<=39;i++)		
			arr[i] = arr[i-1] + arr[i-2];
		for(int a=0;a<=9;a++)
		{
			for(int b=0;b<=3;b++)
				{
					System.out.print(arr[a*4+b]+" ");
				}
			System.out.print("\n");
		}
	}

}
