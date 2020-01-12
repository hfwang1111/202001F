package com.hfwang.base;

public class work12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double sum=0;
		
		double[] arr = new double[21];
		arr[0]=1;
		arr[1]=2;
		for(int i=2;i<=20;i++)		
			arr[i] = arr[i-1] + arr[i-2];
			
		for(int a=1;a<=20;a++)
		{				
			sum=sum+arr[a]/arr[a-1];
		}
		System.out.println(sum);
	}
}
