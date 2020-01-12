package com.hfwang.interfacedemo;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Computer computer=new Computer();
        computer.addDevice(new Mouse("kitty"));
        computer.addDevice(new Mouse("kkk"));
        computer.startAllDevices();
        Integer integer = Integer.valueOf(10);
        int i = integer.intValue();
        
	}

}
