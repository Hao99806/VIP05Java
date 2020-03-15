package com.testing.classt10.interF;

public class AbSubClass extends AbstrClass{

	//抽象类中的抽象方法必须被子类实现，普通方法不用。
	@Override
	public void drink() {
		// TODO Auto-generated method stub
		System.out.println("要喝水");
	}

}
