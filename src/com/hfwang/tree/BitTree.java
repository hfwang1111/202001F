package com.hfwang.tree;

import java.util.Scanner;

public class BitTree {
	private int data;
	private BitTree leftchild;
	private BitTree rightchild;
	
	public BitTree(int data){
		this.data=data;
	}
	    
	public static  BitTree createBitTree(Scanner reader){
		BitTree root=null;
		int m=reader.nextInt();
		if(m>0){
			root=new BitTree(m);
			root.leftchild=createBitTree(reader);
			root.rightchild=createBitTree(reader);
		}
		return root;   
	}
	
	
	
	public static void preVisted(BitTree root){
		if(root==null) return;
		System.out.print(" "+root.data);
		preVisted(root.leftchild);
		preVisted(root.rightchild);
	}
	
	
	public stack void
	
	
	
}
