package com.hfwang.stack;

import com.hfwang.link.Node;

public class LinkedStack {
	
//  |top   |  topLocation
//  |subtop|  ...
//  |______|  ...
//  |______|   0
//  |base  |  -1

	public Node top;
	public Node subtop;
	public Node base=new Node(0);
	public int topLocation;

	
	public LinkedStack(){
	this.topLocation=-1;
	subtop=top=base;
	}

	public void push(Node i){
		top.next=i;
		subtop=top;
		top=i;
		top.next=null;
		topLocation ++;	
	}
	
	
	public Node pop(){
		Node i;
		i=top;
		top=subtop;
		topLocation--;
		subtop=base;
		for(int j=-1;j<topLocation-1;j++){
			subtop=subtop.next;
		}
		return i;
	}
	
	public void printStack(){
		Node point=base;
		for(int i=-1;i<topLocation;i++){
			point=point.next;
			System.out.print(" "+point.data);
		}
		System.out.println("\n");
	}
	
	
	
}
