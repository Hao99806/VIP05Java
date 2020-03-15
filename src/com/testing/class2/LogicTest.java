package com.testing.class2;

public class LogicTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// &&操作，只要有一个是假的，结果就为假，后面的条件语句不再执行，直接得到结果为false。
		int a = 1;
		boolean resultFandT = 2 == 3 && a++ == 2;
		System.out.println(a);
		//位运算的与运算，即使第一个条件为假，依然还会计算后面的算式。
		int b = 1;
		boolean resultFandT2 = !(2 == 3) & b++ == 2;
		System.out.println(b);
		
		
		//||操作，只要第一个为真，后面的条件语句不再执行，直接得到结果为true
		int c = 1;
		boolean resultTORT = 2 == 2 || c++ == 2;
		System.out.println(c);
		
		//三目运算，判断？前的表达式是否为真，如果为真，取:前的值，如果为假，取:后的值。
		int d= 5==5?15:7;
		System.out.println(d);
		
	}

}
