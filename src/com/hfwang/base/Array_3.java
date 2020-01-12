package com.hfwang.base;

public class Array_3 {

	public static void main(String[] args) {
	int[] mylist1 = {12,323,1,21,32,134,24,23,4,123,21,423,12,1,23,435,43,2,3};
	int[] mylist2 = new int[mylist1.length];
	int min=0;
	int max=0;	
	for(int j=0;j<mylist1.length;j++){
		for(int i=0;i<mylist1.length;i++){
			if(mylist1[i]<mylist1[min]){
				min =i;
			}
		}
		for(int i=0;i<mylist1.length;i++){
			if(mylist1[i]>mylist1[max]){
				max =i;
			}
		}
		mylist2[j]=mylist1[min];
		System.out.println(mylist2[j]);
		mylist1[min]=mylist1[max];
	}
	
	


	}

}
