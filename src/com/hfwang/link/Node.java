package com.hfwang.link;

import java.util.Scanner;



public class Node {
//成员变量	
	private int data;
	private Node next;

//有序列表的插入
	public static Node insertNode(Node header,Node innner){
		if(innner.data<=header.date){
			
		}
		
	}
	
	
//头插法反转静态		
 	public static Node convert1(Node header){
		Node p,q;
		p=header.next;
		header.next=null;
		while(p!=null){
			q=p.next;
			p.next=header;
			header=p;
			p=q;
		}
		return header;
	}

//头插法反转实例方法
	public Node convert1(){
		Node header=this;
		Node p,q;
		p=header.next;
		header.next=null;
		while(p!=null){
			p.next=header;
			header=p;
			q=p.next;
			p=q;
		}
		return header;
	
	}
	
//尾插法反转
	public static Node convert2(Node header)
	{
		Node p,q,header1;
		p=q=header;
		while(q.next!=null)
		{
			p=q;
			q=q.next;
		}
		header1=q;
		Node x=header1;
		while(true)
		{
			p=q=header;
			while(q.next!=null)
			{
				p=q;
				q=q.next;
			}
			if(q==header) 
			{
			header1.next=q;
			break;
			}
			p.next=null;
			header1.next=q;
			header1=header1.next;
			
		}
		return x;
		
	}
		
//头插法	
	public static Node createLinkedByHead(Scanner reader,Node head){
		
		int m=reader.nextInt();
		while(m>0){
			Node p = new Node(m);
			p.next=head;
			head=p;
			m=reader.nextInt();
		} 
		return head;		
	}

//尾插法(给尾部节点)
	public static Node createLinkedByTailWithTail(Scanner reader,Node Tailer){
		
		int m=reader.nextInt();
		while(m>0){
			Node q = new Node(m);
			Tailer.next=q;
			Tailer=q;
			m=reader.nextInt();
		}
		return Tailer;		
	}
	
//尾插法(给头部节点)	
	public static Node createLinkedByTail(Scanner reader,Node Header){
		while(Header.next!=null){
			Header = Header.next;
		}
		Node Tailer = Header; 
		return createLinkedByTailWithTail(reader,Tailer);
	}

//有序插入	
	public static Node insertOrderLinked(Node head,Node inner){
		
	
		 
		return inner;
	}
		
//静态输出	
	public static void printLinked(Node head){		
		while(head!=null){
			System.out.print(" "+head.data);
			head=head.next;		
		}
	}
	
//实例方法输出
	public void printLinked(){
		Node head = this;
		while(head!=null)
		{
			System.out.print("  "+head.data);
			head.data=head.data*2;
			head=head.next;
		}
	}
	
//getter setter	
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	
//有参构造方法	
	public Node(int data){
		this.data=data;
		this.next=null;
	}
		
//无参构造方法	
	public Node(){
			
	}
			
	

}
