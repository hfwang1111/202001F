package com.hfwang.base;

import java.util.Scanner;

public class Array_12 {

	public static void main(String[] args) {
		int n,k;
		Scanner reader = new Scanner(System.in);
		n = reader.nextInt();
		k = reader.nextInt();
		int[] led = new int[n+1];
		for(int i=0;i<led.length;i++){
			led[i]=1;
		}
		for(int i=2;i<=k;i++){
			int m=1;
			while(m*i<=n){
				led[m*i]=-led[m*i];
				m++;				
			}
		}
		for(int i=1;i<led.length;i++){
			if(led[i]==1) 
				System.out.println(i);
		}
		reader.close();
	}

}
