package com.hfwang.link;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		
		Scanner reader = new Scanner(System.in);
		
		Node header=new Node();
		
		Node.createLinkedByTail(reader, header);
		Node.printLinked(header);	
		header=Node.convert2(header);
		Node.printLinked(header);
		
		reader.close();
	}
}
