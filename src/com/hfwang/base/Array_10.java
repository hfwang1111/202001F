package com.hfwang.base;

public class Array_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] list1={{1,2,3},{4,5,6},{7,8,9}};
		int[][] list2={{1,2,3},{4,5,6},{7,8,9}};
		int[][] list3=new int[list1.length][list1[1].length];
		
		for(int i=0;i<list1.length;i++){
			for(int j=0;j<list1[i].length;j++){
				for(int k=0;k<list1.length;k++){					
					list3[i][j]+=list1[i][k]*list2[k][j];			
				}				
			}
		}
		for(int i=0;i<list1.length;i++){
			for(int j=0;j<list1[i].length;j++){
				System.out.print(list3[i][j]+" ");
				
			}
			System.out.print('\n');	
		}
	}

}
