package com.testing.class2;

public class RelationTest {
	public static void main(String[] args) {
		int a=2;
		int b=3;
		int c=1,d=2;
		boolean result = a+1!=b;
		System.out.println(result);
		//s1和s2都指向了同一个常量的内存地址
		String s1="Roy";
		String s2="Roy";
		//new关键字创建一个新的字符串对象
		//s3开辟了一个新的内存空间，指向的是这个新的内存地址
		String s3=new String("Roy");
		System.out.println(s3);
		//优先级关系运算符低于四则运算，这里会先完成"s1==s2"+s1的操作，再判断是否和s2相等
		System.out.println("s1==s2" + s1==s2);
		//先判断s1和s2是否相等，把结果和s1==s2拼接起来
		System.out.println("s1==s2" + (s1==s2));
		System.out.println("s1==s3" + (s1==s3));
		System.out.println("s1 equals s3"+s1.equals(s3));
		
	}
}
