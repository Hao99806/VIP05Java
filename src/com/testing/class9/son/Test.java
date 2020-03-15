package com.testing.class9.son;

import com.testing.class9.father.Father;

public class Test {
	
	public static void main(String[] args) {
		Father father=new Father();
		//不同包中不是子类，不能使用protected方法
//		father.married();
	}
}
