package com.hugeyurt.link;

import java.util.Scanner;

public class Node
{
	private int data;
	private Node next;
	
	public Node(int data)
	{
		this.data=data;
		this.next=null;
	}

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
	
	
	
	public static Node createLinkedByHead(Scanner reader)
	{
		Node head=null;
		int m=reader.nextInt();
		while(m>0)
		{
			Node p=new Node(m);
			p.next=head;
			head=p;
			m=reader.nextInt();
		}
		return head;
	}

//直接this输出
	public void printLinked(){
		Node head = this;
		while(head!=null)
		{
			System.out.print("  "+head.data);
			head.data=head.data*2;
			head=head.next;
		}
	}
	
//静态输出	
	public static void printLinked(Node head)
	{
		while(head!=null)
		{
			System.out.print("  "+head.data);
			head.data=head.data*2;
			head=head.next;
		}
	}
	

}
