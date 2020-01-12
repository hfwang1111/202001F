package com.hfwnag.interfacedemo;

public class Computer 
{
	private IUSB devicePort[];
	
	
	public Computer()
	{
		this.devicePort=new IUSB[10];
	}
	public Computer(int size)
	{
		this.devicePort=new IUSB[size];
	}
	
	public boolean addDevice(IUSB device)
	{
	   for(int i=0;i<this.devicePort.length;i++)
		   if(this.devicePort[i]==null)
		   {
			   this.devicePort[i]=device;
			   return true;
		   }
	   return false;
	}
	
	public boolean removeDevice(String deviceName)
	{
	   for(int i=0;i<this.devicePort.length;i++)
		   if(this.devicePort[i]!=null&&
		   deviceName.equals(this.devicePort[i].name()))
		   {
			   this.devicePort[i]=null;
			   return true;
		   }
	   return false;
	}
	
	public void startAllDevices()
	{
		for(int i=0;i<this.devicePort.length;i++)
		 if(this.devicePort[i]!=null)
	         this.devicePort[i].start();
	}
	
	public void stopAllDevices()
	{
		for(int i=0;i<this.devicePort.length;i++)
			 if(this.devicePort[i]!=null)
		         this.devicePort[i].stop();
	}

}
