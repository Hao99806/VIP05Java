package com.testing.class9;

public class Human extends Animal{
	
	public Human(String setname) {
//		super()调用父类的构造方法，必须是子类构造方法的第一句。
//		System.out.println("一个人类婴儿出生啦，爸妈给他取了名字"+name);
		super("animal");
		name=setname;
		System.out.println("一个人类婴儿出生啦，爸妈给他取了名字"+name);
	}
	
	//如果没有显示定义无参构造方法，默认调用无参构造
	//如果重载了其它构造方法，那么隐式的无参构造方法失效，需要显式定义。
//	public Human() {
//		
//	}

	public String eat() {
		System.out.println("人类会变着花样吃东西");
		return "补充体力";
		}
		
	public void walk() {
		System.out.println("人类走出了六亲不认不认的步伐");
	}


}
