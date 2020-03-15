package com.testing.classt10.interF;

public class InterPig implements InterPet{
	//实现接口的类中，同样可以扩展自己独有变量和方法
	public String type="猪";
	
	public void sell() {
		System.out.println("猪肉可以卖钱");
	}
	
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("猪猪拱食吃");
	}

	@Override
	public void drink() {
		// TODO Auto-generated method stub
		System.out.println("猪把嘴巴砸进水槽");
	}

}
