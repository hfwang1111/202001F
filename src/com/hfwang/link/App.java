package com.hfwang.link;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		
		Scanner reader = new Scanner(System.in);
		
		Node header=new Node();
		
		Node.createLinkedByTail(reader, header);
		System.out.print("Linked:");
		Node.printLinked(header);
		System.out.println("\n");	
		
//		header=Node.convert2(header);
//		System.out.print("convert:");
//		Node.printLinked(header);
//		System.out.println("\n");
		
		Node insertx = new Node(1);
		header=Node.insertNode(header, insertx);
		System.out.print("Insert:");
		Node.printLinked(header);
		reader.close();
	}
}
