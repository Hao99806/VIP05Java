package com.testing.class9;

public class Male extends Human{

	public Male(String setname) {
		super("人类");
		name=setname;
		System.out.println(name+"男人出生了");
	}
	
	public Male(String setname,int birthweight) {
		//调用上面定义的参数列表为（String）的构造方法。
		this(setname);
		System.out.println("调用两个参数的构造方法，生了一个重量为"+birthweight+"斤的小孩");
		weight=birthweight;
	}
	
	public void drink() {
		System.out.println("男生喜欢喝肥宅快乐水");
	}
	
	public String eat() {
		System.out.println("大晚上的也要吃夜宵的男生");
		return "长胖";
	}
	
	public void play() {
		System.out.println("男生喜欢打游戏");
	}
	
	
	
	
	
}
