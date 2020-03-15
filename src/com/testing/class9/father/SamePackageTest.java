package com.testing.class9.father;

public class SamePackageTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//同一个包中的其它类，不能调用private方法
		Father father=new Father();
		father.cook();
		father.speek();
		System.out.println(father.name);
		System.out.println(father.ownMoney);
		
		
	}

}
