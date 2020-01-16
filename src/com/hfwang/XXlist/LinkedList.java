package com.hfwang.XXlist;

//Ë«Á´±í
class Node2<T>{
	public T data;
	public Node2 prev,next;
	public Node2(T x){
		data=x;
	}
}


public class LinkedList<T> {
	public Node2<T> header,tailer;
	public int size;
	
	public LinkedList(){
		size=0;
	}
	public void add(T num){
		Node2<T> x =new Node2<T>(num);
		if(header==null){
			header=tailer=x;
			size++;
			return;
		}tailer.next=x;size++;tailer=x;return;
		
	}
	
	public T get(int index){
		if(index<0&&index>size-1)return null;
		Node2<T> x=header;
		for(int i=0;i<index;i++){
			x=x.next;
		}
		return x.data;
	}
	
}
