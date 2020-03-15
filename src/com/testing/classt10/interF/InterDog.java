package com.testing.classt10.interF;

//实现接口的方法，必须要把接口中定义但未实现的抽象方法实现出来
public class InterDog implements InterPet,InterAnimal{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("狗狗吃骨头");
	}

	@Override
	public void drink() {
		// TODO Auto-generated method stub
		System.out.println("狗狗用舌头钩水喝");
	}

	@Override
	public void dead() {
		// TODO Auto-generated method stub
		System.out.println("狗狗大约12岁左右去世");
	}

	
	
}
