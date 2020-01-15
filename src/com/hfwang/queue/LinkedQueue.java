package com.hfwang.queue;

import com.hfwang.link.Node;

public class LinkedQueue {
	Node head,tail;
	int size;
	
	public LinkedQueue(){
		tail=head=null;
		size=0;
	}
	
	boolean inQueue(Node x){
		tail.next=x;
		tail=x;
		
		size++;
	}
	
	Node outQueue(){
		Node x=head;
		head=head.next;
		size--;
		return x;
	}
	
}
