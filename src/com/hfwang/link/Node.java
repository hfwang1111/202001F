//链表节点类

package com.hfwang.link;

import java.util.Scanner;

public class Node {
//成员变量	
	public int data;
	public Node next;
	
//有参构造方法	
	public Node(int data){
		this.data=data;
		this.next=null;
	}
			
//无参构造方法	
	public Node(){			
	}
//两个有序链表合并 两个链表头指针ha hb
//合并成以header为头指针的有序链表 
	public static Node Merge(Node ha,Node hb){
		Node header,pa,pb,pc;
		header=ha;pc=ha;
		pa=ha.next;pb=hb.next;
		while(pa!=null&&pb!=null){
			if(pa.data<pb.data){
				pc.next=pa;pc=pa;pa=pa.next;
			}
			if(pa.data>pb.data){
				pc.next=pb;pc=pb;pb=pb.next;	
			}
			if(pa.data==pb.data){
				pc.next=pa;pc=pa;pa=pa.next;
			}
		}
		if(pa==null) pc.next=pa;
		else pc.next=pb;
		return header;
	}

//有序列表的插入
	public static Node insertNode(Node header,Node inner){
		if(inner.data<=header.data){
			inner.next=header;return inner;
		}
		Node p,q;
		p=q=header;
		while(true){
			p=q;
			q=q.next;
			if((inner.data>=p.data)&&(inner.data<=q.data)){
				p.next=inner;
				inner.next=q;
				return header;
			}
			if(q.next==null){
				q.next=inner;
				inner.next=null;
				return header;
			}
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
			Node p=new Node(m);
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
	

			
	

}
