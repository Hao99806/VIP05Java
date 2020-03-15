package com.testing.class4;

public class StaticVarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog xiaobai=new Dog();
		System.out.println(xiaobai.kind);
		System.out.println(xiaobai.mood);
		xiaobai.kind="哈士奇";
		xiaobai.mood="高兴";
		System.out.println("修改之后小白的kind"+xiaobai.kind);
		System.out.println("修改之后小白的mood"+xiaobai.mood);
		
		
		Dog xiaohei=new Dog();
//		修改类变量，其它的实例对象也随之发生改变。
		System.out.println("修改之后小黑的kind"+xiaohei.kind);
//		修改实例变量不会影响其它的实例对象
		System.out.println("修改之后小黑的mood"+xiaohei.mood);
	}

}
