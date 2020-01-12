package com.hfwang.base;

public class Circle {
	private Point center;	
	private double r;
	
	public Circle(Point center,double r){
		this.center=center;
		this.r=r;	
	}
	
	
	public  int location(Circle a){
		double distance;
		distance=a.center.distance(this.center);
		if(distance>a.r+this.r){			
			return 1; //System.out.println("����");
		}else if(distance==a.r+this.r){			
			return 2;//System.out.println("����");
		}else if(distance<a.r+this.r){
			if(distance<Math.abs(a.r-this.r)) 
				return 3;//System.out.println("����");
			else 
				return 4;//System.out.println("�ཻ");						
		}
		return 0;
	}
	
}
