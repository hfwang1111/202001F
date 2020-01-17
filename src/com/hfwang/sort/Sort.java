package com.hfwang.sort;

public final class Sort {
	
	public static void main(String args[]){
		int[] a = {1,23,324,43,523,231,231};
		sort1(a);
		printArray(a);
		
	}
	
	 
	public static void sort1(int[] a){
		if(a==null) return;
		for(int i=1;i<a.length;i++){
			int key=a[i];
			if(key>a[i-1]) break;
			for(int j=1;j<i;j++){
				if(a[i]<=a[j]&&a[i]>=a[j-1]){
					for(int k=i;k>=j+1;i--){
					a[k]=a[k-1]	;
					}
				}
			}
		}
	}
	
	
	public static int quickOne(int[] a,int right,int left){
		int key = a[left];
		int keyLocation=left;
		for(int i=left+1;i<=right;i++){
			if(a[i]>key) break;
			if(a[i]<key)
				a[keyLocation]=a[i];
				for(int j=i;j>=keyLocation+2;j--){
					a[j]=a[j-1];
				}
				a[i+1]=key;
				keyLocation++;
		}
		return keyLocation;
	}
	
	public static void quickSort(int[] a,int left,int right){
		int 
		
		
	}
	
	
	
	
	
	
	
	public static void printArray(int[] a){
		for(int i=0;i<a.length;i++){
			System.out.print(" "+a[i]);
		}
	}
	
	
	
}
