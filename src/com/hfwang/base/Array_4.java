package com.hfwang.base;

public class Array_4 {

	public static void main(String[] args) {
		int a=10000;
		int[] H = new int[8];
		for(int i=0;i<8;i++){
			H[i]=a%16;
			a=a/16;
		}
		for(int i=7;i>=0;i--){
			System.out.print(H[i]);
		}
		System.out.println("H");

	}

}
