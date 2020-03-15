package com.testing.classt10.interF;

public class InterPetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterPig dudu=new InterPig();
		//实现接口的类，可以使用接口中定义的常量
		System.out.println(dudu.KIND);
		//可以使用自己扩展的变量
		System.out.println(dudu.type);
		//可以使用自己扩展的方法
		dudu.sell();
		//可以使用接口定义，类中实现的方法
		dudu.eat();
		
		//接口可以有效降低耦合性，因为实现的方法都是在类中自己实现的
		InterDog xiaobai=new InterDog();
		xiaobai.eat();
	}

}
