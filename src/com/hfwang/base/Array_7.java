package com.hfwang.base;

public class Array_7 {

	public static void main(String[] args) {
		int[] mylist = {1,2,3,4,5,6,7,8,9,10};
		int x=5;
		int xLocation=0;
		int point1=0;
		int point3= mylist.length-1;
		int point2= (point1+point3)/2;
		
		while(xLocation!=point2){			
			if(x<mylist[point2]){
				point3=point2;
			}else if(x>mylist[point2]){
				point1=point2;
			}else{
				xLocation=point2;
			}
			point2= (point1+point3)/2;
				
		}
		System.out.println(xLocation+1);
		
		
	}

}
