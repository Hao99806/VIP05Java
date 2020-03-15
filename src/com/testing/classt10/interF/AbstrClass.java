package com.testing.classt10.interF;

public abstract class AbstrClass {

	public int age=10;
	
	public void eat() {
		System.out.println("吃饭咯");
	}
	
	//抽象方法在抽象类中定义，不允许实现方法，只做方法声明
//	public abstract void drink() {
//		
//	}
	
	public abstract void drink();
}
