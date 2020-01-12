package com.hfwang.base;

public class Rect {
	private double a;
	private double b;
	public final double getA() {
		return a;
	}
	public final void setA(double a) {
		this.a = a;
	}
	public final double getB() {
		return b;
	}
	public final void setB(double b) {
		this.b = b;
	}
	
	public double accountArea(){
		return a*b;
	}
	
	public double accountPerimeter(){
		return (a+a+b+b);
	}
	
	

}
