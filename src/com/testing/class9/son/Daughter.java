package com.testing.class9.son;

import com.testing.class9.father.Father;

public class Daughter extends Father{

	//即使做了import，其它包中不能继承default权限的内容，但是可以用public的内容。
	public void cook() {
		//在不同包中，子类能够继承和使用protected方法
		super.married();
	}
	
	public static void main(String[] args) {
		
		Father f=new Father();
		//父类对象用不了protected方法。
//		f.married();
		Daughter d=new Daughter();
		//子类对象自己能用protected方法
		d.married();
	}
	
	
	
}
