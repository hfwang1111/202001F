package com.hfwang.stack;
import com.hfwang.link.Node;

public class App {

	public static void main(String[] args) {
		LinkedStack stack = new LinkedStack();
		stack.push(new Node(19));
	    stack.push(new Node(39));
	    stack.push(new Node(29));
	    stack.push(new Node(21));
	    stack.push(new Node(25));
	    stack.printStack();
	    
	    Node x=stack.pop();
	    System.out.println(x.data+"\n");
	    stack.printStack();
	    
	}

}
