package com.testing.class2;

public class MathTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int a=5;
//		int b=3;
//		float c=1.5f;
//		double d=1.8;
//		//四则运算顺序和数学规则一模一样，小括号提升运算优先级
//		System.out.println((a+b)/c*d);
//		//运算时，结果的精度以计算式中的最高精度为准
//		System.out.println(b / c);
//		//强制转换float结果为int
//		int resultbc=(int)(b/c);
//		System.out.println(resultbc);
		
		
		int c1=5;
		int d1=3;
		//整数相除时，得到的结果保留整数，但是不是四舍五入，而是向下取整
		System.out.println(c1/d1);
		//强制转换优先级是高于四则运算的。
		//先将c1转换成为float型之后进行计算，计算结果以5.0/3进行计算，得到结果是1.6666
		System.out.println((float)c1/d1);
		//先计算整型c1/d1的结果，等于1，然后再转换为float型
		System.out.println((float)(c1/d1));

		//取余操作
		int z=c1 % d1;
		System.out.println(z);
		//等价于c1=c1+d1
		System.out.println(c1);
		c1 +=d1;
		System.out.println("运算之前"+c1);
		c1 *=d1;
		System.out.println("*=运算之后"+c1);
		
		
	}

}
