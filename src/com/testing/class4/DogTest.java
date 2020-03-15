package com.testing.class4;
//不是同一个包里的类，需要用import引入。
import com.testing.class3.WhileTest;

public class DogTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//如果要调用其它包中的类，就需要使用import语句来引入。
		WhileTest a=new WhileTest();
		//调用main方法时，需要传递String[]类型的参数。
		a.main(null);
		//直接用类名调用静态的main方法。
		WhileTest.main(null);
		//类变量（静态变量）的使用
		System.out.println("静态变量可以直接用类名.进行调用，所以也叫做类变量"+Dog.TYPE);
		//类方法直接通过类名调用
		Dog.tail();
		//对象的声明。
		Dog xiaohei;
		//实例化对象,这时，才会完成实例方法和实例变量的初始化。
		xiaohei=new Dog();
		//调用对象的属性。
		//类变量依然可以使用对象来进行调用
		System.out.println("用实例对象调用类变量：狗的品种是："+xiaohei.kind);
		//类方法依然可以通过对象调用
		xiaohei.tail();
		//常量不能被修改
//		xiaohei.TYPE="";
		xiaohei.age=1;
		System.out.println(xiaohei.age);
		//方法的调用
		//没有参数列表的方法：注意小括号别丢了。
		xiaohei.watchDoor();
		//有参数列表的方法，需要传递对应类型的参数。
		xiaohei.bark("Roy");
		//方法可以操作类当中的变量。
		System.out.println("狗狗现在的情绪是:"+xiaohei.mood);
		xiaohei.eat("牛肉");
		System.out.println("狗狗吃完饭的情绪是:"+xiaohei.mood);
	}

}
