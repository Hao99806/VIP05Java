package com.testing.class1;

public class MathTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * 整型
		 */
		//变量声明与赋值
		byte firstByteNum;
		//可以用中文命名变量，强烈不建议
		byte 字节数=127;
		firstByteNum=127;
		System.out.println(firstByteNum+1);
//		计算结果和高精度的int一致，如果要转换为byte类型，使用(byte)进行强制转换。
		byte secondNum=(byte)(firstByteNum+1);
		//低精度可以自动转换为高精度。
		int firstInt=firstByteNum;
		//高精度如果要转换为低精度存储，则需要强制转换。
		byte thirdNum=(byte)firstInt;
		short firstShort=12345;
		//如果数字超出了int的范围，是long的表示范围之内的话，数字后加个L表示这是long型数字。
		long firstLong=12344566464L;
		
		/**
		 * 小数，浮点型
		 */
		//高精度如果要转换为低精度存储，则需要强制转换。
		float f=(float)1.66666666666;
		float f2=1.6666666666666666f;
		double d=1.6666666666666666;
		
		System.out.println("强制转换的浮点数float"+f);
		System.out.println("f2的值"+f2);
		//由于浮点数采用指数+尾数的存储方式，所以除不尽时，会截断一部分尾数，导致数字不那么精确。
		System.out.println("double类型的值："+d);
		
		
		/**
		 * 布尔型
		 * 只有 true 和 false两个值。
		 */
		boolean firstB=false;
		
		/**
		 * char型 字符型
		 * java使用的是unicode编码来进行字符的表示65536个字符，前128位对应的就是ascii码
		 * char型的字符都可以转换成为对应的码表数字。
		 * char型的字符用''引起来，只能写一个字符。
		 */
		char firstChar='中';
		System.out.println("字母A的unicode编码"+(int)firstChar);
		//int型转换为char型
		char secondChar=97;
		System.out.println(secondChar);
		//由于单引号在java语法中有其特殊含义，所以要表达单引号字符时，需要转义
		char danyinhao='\'';
		//如果要在字符里表示一个双引号？不需要转义
		char shuangYinHao='"';
		
		/**
		 * String字符串类型
		 * ""引起来的一串字符，称之为字符串
		 * 如果要在字符串中表达一个双引号，同样需要转义双引号
		 * 
		 */
		String firstStr="roy老师";
		String double引号="\"";
		//如果要在字符串里表示一个单引号？不需要转义，因为只有双引号和双引号才会导致java语法出现歧义，单引号在""中无歧义，不需要转义
		String danyin="'";
		
	}

}
