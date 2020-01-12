package com.hfwnag.interfacedemo;


public class Mouse implements IUSB
{
	private String deviceName;

	public Mouse(String deviceName)
	{
		this.deviceName=deviceName;
	}
	
	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println(this.deviceName+" mouse is running");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println(this.deviceName+" mouse is stoping");
	}

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return this.deviceName;
	}

	public String getDeviceName() {
		return deviceName;
	}

	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}

}
