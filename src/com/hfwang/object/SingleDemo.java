package com.hfwang.object;

public class SingleDemo
{
	private static SingleDemo self=new SingleDemo(); 
	private SingleDemo()
	{
		
	}
	
	public static SingleDemo  getInstance()
	{
		if(SingleDemo.self==null) 
		SingleDemo.self=new SingleDemo(); 
		return SingleDemo.self;
	}
}
