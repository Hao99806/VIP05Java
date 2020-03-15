package com.testing.classt10.interF;

public class InterDuotai {
	
	public static void main(String[] args) {
		//接口的向上转型。
		InterPet dudu=new InterPig();
		InterPet xiaohei=new InterDog();
		dudu.eat();
		xiaohei.eat();
		//向上转型为其中一个接口的时候，来自于其它接口的方法被隐藏
		InterAnimal xiaobai=new InterDog();
		xiaobai.dead();
	}
	
}
