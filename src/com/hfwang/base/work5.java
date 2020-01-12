package com.hfwang.base;

import java.util.Scanner;

public class work5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		double s,m;		
		m = reader.nextInt();
		if (m<=10)
			s=m*0.1;
		else if(m<=20)
			s=1+(m-10)*0.075;
		else if(m<=40)
			s=1+0.75+(m-20)*0.05;
		else if(m<=60)
			s=1+0.75+1+(m-40)*0.03;
		else if(m<=100)
			s=1+0.75+1+0.6+(m-60)*0.015;
		else 
			s=1+0.75+1+0.6+0.6+(m-100)*0.01;
		
	
		System.out.println("ÀûÈó:"+s+"W");	
	}

}
