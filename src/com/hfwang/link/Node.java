//����ڵ���

package com.hfwang.link;

import java.util.Scanner;

public class Node {
//��Ա����	
	public int data;
	public Node next;
	
//�вι��췽��	
	public Node(int data){
		this.data=data;
		this.next=null;
	}
			
//�޲ι��췽��	
	public Node(){			
	}
//������������ϲ� ��������ͷָ��ha hb
//�ϲ�����headerΪͷָ����������� 
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

//�����б�Ĳ���
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
	
//ͷ�巨��ת��̬		
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

//ͷ�巨��תʵ������
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
	
//β�巨��ת
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
		
//ͷ�巨	
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

//β�巨(��β���ڵ�)
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
	
//β�巨(��ͷ���ڵ�)	
	public static Node createLinkedByTail(Scanner reader,Node Header){
		while(Header.next!=null){
			Header = Header.next;
		}
		Node Tailer = Header; 
		return createLinkedByTailWithTail(reader,Tailer);
	}

//��̬���	
	public static void printLinked(Node head){		
		while(head!=null){
			System.out.print(" "+head.data);
			head=head.next;		
		}
	}
	
//ʵ���������
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
