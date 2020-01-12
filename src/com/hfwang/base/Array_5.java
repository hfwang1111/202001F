package com.hfwang.base;

public class Array_5 {

	public static void main(String[] args) {
	
	int[] mylist={1,2,3,4,5,6,7,8,9};
	int temp;
	if(mylist.length%2==0){
		for(int i=0;i<(mylist.length)/2;i++){
			temp=mylist[i];
			mylist[i]=mylist[mylist.length-i-1];
			mylist[mylist.length-i-1]=temp;
		}
	}else{
		for(int i=0;i<(mylist.length-1)/2;i++){
			temp=mylist[i];
			mylist[i]=mylist[mylist.length-i-1];
			mylist[mylist.length-i-1]=temp;
		}
	}
	for(int i=0;i<mylist.length;i++){
		System.out.print(mylist[i]);
	}
	
	}

}
