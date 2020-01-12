package com.hfwang.base;

public class Array_6 {

	public static void main(String[] args) {
		int[] mylist1 = {1,2,3,4,5,6,7,8,9,10};
		int[] mylist2 = new int[mylist1.length+1];
		int x=20;
		int xLocation=0;
		int max=0;
		int min=0;
		for(int i=1;i<mylist1.length;i++){
			if(mylist1[i]>mylist1[max]){
				max=i;
			}
			if(mylist1[max]<x) xLocation=mylist1.length;
			if(mylist1[i]<mylist1[min]){
				min=i;
			}
			if(mylist1[min]>x) xLocation=0;
		}
		for(int i=0;i<mylist1.length-1;i++){
			if(mylist1[i]<=x&&mylist1[i+1]>=x){
				xLocation=i+1;
			}
		}
		for (int i=0;i<mylist2.length;i++){
			if(i<xLocation) mylist2[i]=mylist1[i];
			if(i==xLocation) mylist2[i]=x;
			if(i>xLocation) mylist2[i]=mylist1[i-1];
			System.out.print(mylist2[i]+" ");
		}
		
	}

}
