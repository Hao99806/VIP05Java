package com.testing.classt10;

public class Pet {
	
	 public int age=0;
	 public String kind="pet";
	 public int height=0;
	 public String name="名字";
	 public int weight=0;
	 
	 
	 
	 public Pet() {
		 System.out.println("宠物的无参构造方法被调用了");
	 }
	 
	 public Pet(String setname) {
		 name=setname;
		 System.out.println("一个叫做"+name+"的宠物出生了");
	 }
	 
	 
	 public void eat() {
		 System.out.println("宠物都要吃东西");
	 }
	 
	 public void sleep() {
		 System.out.println("睡觉是动物的本能");
	 }
	 
	 public void walk() {
		 System.out.println("动物都会蹦蹦跳跳真可爱");
	 }
	 
	 public void drink() {
		 System.out.println("水是生命之源");
	 }

	 public String getPetKind() {
		 return "宠物";
	 }
	 
}
