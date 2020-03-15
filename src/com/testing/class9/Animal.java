package com.testing.class9;

public class Animal {
	
	 public int age=0;
	 public String kind="animal";
	 public int height=0;
	 public String name="名字";
	 public int weight=0;
	 
	 public Animal() {
		 System.out.println("动物的无参构造方法被调用了");
	 }
	 
	 public Animal(String setname) {
		 name=setname;
		 System.out.println("一个叫做"+name+"的动物死掉了");
	 }
	 
	 
	 public String eat() {
		 System.out.println("动物都需要进食");
		 return "动物吃东西";
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

}
