package com.hfwang.stack;

public class ArrayStack{
	private int[] data;
	private int top;
	
	public ArrayStack(){
		data=new int[10];
		top=-1;
	}
	
	public ArrayStack(int size){
		data=new int[size];
		top=-1;
	}
	
	public boolean push(int num){
		if(this.top==this.data.length-1)
			return false;
		this.top++;
		this.data[top]=num;
		return true;
	}
	
	public int pop(){
		if(top==-1) return -1;
		int x=data[top];
		top--;
		return x;
	}
	
	public int top(){
		if(top==-1) return -1;
		int num=data[top] ;
		return num;
	}
	
	public boolean isEmpty(){
		return top==-1;
	}
	
	public boolean isFull(){
		return top==data.length-1;
	}
	
	
	
}


