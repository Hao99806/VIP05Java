package com.testing.class2;

public class BitMath {
public static void main(String[] args) {
	//用于进行混淆操作
	char a=(char) 65;
	char b=(char) 86;
	
	System.out.println(a);
	System.out.println(b);
	System.out.println((char)(a&b));
	
	
	byte x=17;
	int y=66;
	int z=x^y;
//	System.out.println(z);
//	System.out.println(x^z);
//	System.out.println(y^z);
	
	
	System.out.println((byte)(x>>6));
	
	
}
}
