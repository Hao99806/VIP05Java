package com.testing.class4;
//类的声明
public class Dog {
	//类体：
	//变量的定义：类所拥有的属性。
	//类的成员变量，直接写在类体中的，不在方法或者语句块中的变量。
	public String ear="三角形的耳朵";
	//如果一个变量不希望它的值在定义之后发生修改，那么可以将它定义为常量,常量的常量名全部用大写字母。
	public final static String TYPE = "狗";
	//没有被static静态修饰符修饰的成员变量，只能在实例化之后才能使用，所以又被称作实例变量。
	public String hairColor="";
	public String name ="单身狗";
	public int age=0;
	public float height=10f;
	public float weight=1f;
	//静态修饰符static 修饰的变量被称为类变量或者静态变量，能够直接用类名进行调用。
	public static String kind="中华田园犬";
	public String mood="面无表情";
	
	//隐式构造方法
	public Dog() {
		System.out.println("狗子出生了");
	}
	//显式声明构造方法。由于参数列表不同，因而产生了方法的重载。
	public Dog(String dogName) {
		name=dogName;
		System.out.println(name+"狗子出生了");
	}
	
	
	
	//方法的定义：类所拥有的功能。
	//方法的构成，返回类型 方法名(参数列表)
	//void方法返回为空，不需要返回结果，默认是隐式地在方法最后加了个return;
	public void watchDoor() {
		//成员方法中可以直接调用静态方法，也可以调用成员方法。
		tail();
		eat("牛肉");
		System.out.println(kind+"名字叫做"+name+"狗子正在看门");
		//void默认添加return;，手动添加之后，return会结束方法的运行。
		return;
		//return之后的代码是无法抵达的，会报错。
//		System.out.println("roy");
	}
	
	//带有返回类型的方法，必须由return关键字返回对应类型的结果。
	public String eat(String food) {
		//局部变量,在方法中生效，出了方法就不能使用了。
		int i=14;
		if(food.contains("肉")) {
			System.out.println(name+"吃得很开心");
			mood="高兴";
			return mood;
//			System.out.println("");
		}
		else {
			System.out.println(name+"并不想吃你喂的"+food+"并向你翻了个白眼");
			mood="不高兴";
			return mood;
		}
	}
	//public 关键字 修饰方法或者变量，表示是公有的。
	public void bark(String people) {
//		局部变量，出了方法就失效了，不能使用
//		System.out.println(i);
		if(age>3) {
			System.out.println(name+"正在对着"+people+"汪汪叫");}
		else {
			System.out.println(name+"正在对着"+people+"嗷嗷叫");
		}
		
	}
	
	//静态修饰符static修饰的方法，被称为类方法。
	public static void tail() {
		//静态方法只能调用静态方法和静态变量，不能使用实例方法和实例变量。
//		bark("roy");
		//不能使用实例方法和实例变量。
		System.out.println(kind+"狗子都会摇尾巴");
	}
	

}
