package com.testing.class3;

public class DoWhileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		//在判断条件是否成立之前先执行一次循环体的操作。
		do {
			System.out.println(i+1);
			i++;
		}while(i<10);
		System.out.println("do……while循环结束之后 i的值"+i);
		
	}

}
