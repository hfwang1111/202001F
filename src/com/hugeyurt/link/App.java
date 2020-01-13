package com.hugeyurt.link;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner reader=new Scanner(System.in);
       Node head=Node.createLinkedByHead(reader);
//       Node.printLinked(head);
       head.printLinked();
	}

}
