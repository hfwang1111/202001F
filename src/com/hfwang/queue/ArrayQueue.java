//数组队列
package com.hfwang.queue;

public class ArrayQueue {
	int head;
	int tail;
	int size;
	int[] queue;
	int count;
	
	ArrayQueue(int size){
		this.size=size;
		queue=new int[size];
		head=tail=0;
		count=0;
	}
	
	void inQueue(int x){
		if(count<size){
		tail=(tail+1)%size;
		queue[tail]=x;
		count++;
		}
	}
	
	int outQueue(){
		if(count>0){
		int x=queue[head];
		head=(head+1)%size;
		return x;
		}return 0;
		
	}
	
	int size(){
		return count;
	}
	
	
}
