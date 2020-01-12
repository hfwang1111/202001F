package com.hfwang.base;

public class Vehicle {
	private int speed;
	private int size;
	
	public Vehicle(){
		
	}
	public void move(){
		
	}
	public void speedUp(int speedup){
		this.speed +=speedup;
	}
	public void speedDown(int speeddown){
		this.speed -=speeddown;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	
}
