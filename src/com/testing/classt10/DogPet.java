package com.testing.classt10;

public class DogPet extends Pet{

	public void drink() {
		System.out.println("小狗用舌头钩水喝");
	}
	
	public void eat() {
		System.out.println("狗狗吃骨头");
	}
	
	public void watchdoor() {
		System.out.println("狗狗会看门");
	}

	public String getPetKind() {
		return "小狗狗";
	}
	
}
