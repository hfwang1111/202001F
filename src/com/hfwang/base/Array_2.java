package com.hfwang.base;

public class Array_2 {

	public static void main(String[] args) {
		int[] mylist = {1,2,3,4,5,6,76,56,54,3,32,42,123,0};
		int temp;
		for(int a=0;a<(mylist.length-1);a++){		
			for(int i=0;i<(mylist.length-1);i++){
				if(mylist[i]>mylist[i+1]){
					temp=mylist[i];
					mylist[i]=mylist[i+1];
					mylist[i+1]=temp;				
				}
			}			
		}
		for(int i=0;i<mylist.length;i++){
			System.out.println(mylist[i]);
		}
		
		
		
	}

}
