package com.practice;

public interface Switch {
	void son();
	void soff();

}

interface regulator
{
	void incresespeed();
	void decresespeed();
}

interface icombo extends Switch,regulator
{

}

class Fan implements icombo
{

	@Override
	public void son() {
		// TODO Auto-generated method stub
		System.out.println("fan is on");
		
	}

	@Override
	public void soff() {
		// TODO Auto-generated method stub
		System.out.println("fan is off");
		
	}

	@Override
	public void incresespeed() {
		// TODO Auto-generated method stub
		System.out.println("fan speed is increased");
		
	}

	@Override
	public void decresespeed() {
		// TODO Auto-generated method stub
		System.out.println("fan speed is decreased");
		
	}
	
}

class fantest
{
	public static void main(String[] args) {
		Fan f=new Fan();
		f.son();
		f.soff();
		f.incresespeed();
		f.decresespeed();
	}
}
