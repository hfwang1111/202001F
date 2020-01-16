//¡¥±Ì∂”¡–

package com.hfwang.queue;

import com.hfwang.link.Node;

public class LinkedQueue {
	Node head,tail;
	int size;
	
	public LinkedQueue(){
		tail=head=null;
		size=0;
	}
	
	public boolean inQueue(Node x){
		if(head==null){
			this.head=x;
			this.tail=x;
		}else{
			this.tail.next=x;
			this.tail=x;
		}
		return true;
		
	}
	
	public Node outQueue(){
		if(this.head==null) return null;
		Node x=head;
		head=head.next;
		return x;
	}
	
	public boolean isEmpty(){
		return head==null;
	}

}
