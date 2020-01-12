package com.hfwang.base;

public class Array_11 {

	public static void main(String[] args) {
		int[][] list = new int[20][20];
		list[0][0]=1;
		for(int i=1;i<list.length;i++){
			for(int j=1;j<list[i].length;j++)
			{
				list[i][0]=1;
				list[i][j]=1;
				list[i][j]=list[i-1][j-1]+list[i-1][j];			
			}
		}
		for(int i=0;i<list.length;i++){
			for(int j=0;j<i+1;j++){
				System.out.print(list[i][j]+" ");
				
			}
			System.out.print('\n');	
		}
	}

}
