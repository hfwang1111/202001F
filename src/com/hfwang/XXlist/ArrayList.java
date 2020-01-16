package com.hfwang.XXlist;

public class ArrayList<T> {
	
	private  T[] data;
	private  int size;
	
	
	public ArrayList(){
		this.data=(T[])new Object[10];
		this.size=0;
	}
	
	public ArrayList(int size){
		this.data=(T[])new Object[size];
		this.size=0;
	}
	
	public boolean add(T num){
		if(this.size==this.data.length){
			T temp[]=(T[])new Object[this.size*2];
			for(int i=0;i<this.size;i++){
				temp[i]=this.data[i];
			}
			this.data=temp;
		}
		this.size++;
		this.data[this.size-1]=num;
		return true;	
	}
	
	public T get(int index){
		if(index<0&&index>=this.data.length) return null;
		return this.data[index];
	}
	
	public boolean remove(int index){
		if(index<0&&index>=this.data.length) return false;
		for(int i=index;i<this.size;i++){
			data[i]=data[i+1];
		}return true;
	}
	
	
	
	
	
	

	
	
}