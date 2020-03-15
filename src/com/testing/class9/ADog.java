package com.testing.class9;

public class ADog extends Animal{
	
	public String ear="三角耳朵";
	public String dogkind="狗";
	
	public ADog() {
		super("小白");
		System.out.println("一条狗子出生了");
	}
	
	public ADog(String name) {
		super(name);
		System.out.println("一条有名字的叫做"+name+"的狗子出生了");
	}
	
	String Animal(){
		System.out.println("狗子想要生动物");
		return "";		
	}
	
	public void bark() {
		System.out.println("狗子会叫汪汪汪");
	}
	
	public void watchDoor() {
		System.out.println("狗子会看门");
	}
	
	public String toString() {
		return "这是一个狗子";
	}
	
	public String eat() {
		super.eat();
		System.out.println("狗子的吃饭方法是啃骨头");
		return "骨头最好吃";
	}

	public String eat(String food) {
		System.out.println("狗狗吃"+food);
		return food;
	}
	
	public String showkind() {
		//通过super调用父类中的kind变量
		System.out.println(kind);
		//调用dog自己声明的dog变量
		System.out.println(dogkind);
		return kind;
	}
	

	
}
