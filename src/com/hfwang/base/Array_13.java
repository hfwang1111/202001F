package com.hfwang.base;

public class Array_13 {

	public static void main(String[] args) {
		int[] mylist1 = {21,3,33,89,16};
		int[] mylist2 = {33,78,15,16,48,57};
		for(int i=0;i<mylist1.length;i++){
			for(int j=0;j<mylist2.length;j++){
				if(mylist1[i]==mylist2[j])
				System.out.print(mylist1[i]+" ");
			}
		}
	}

}
