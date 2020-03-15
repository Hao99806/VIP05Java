package com.testing.class3;

public class CountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//数10个数
		System.out.println("x++执行");
		//所有的x都是在for循环中声明的，所以出了for循环x就不再生效了，可以继续声明。
		for(int x=0;x<10;x++) {
			//循环体，需要反复执行的操作
			System.out.println(x+1);
		}
		System.out.println("++x执行");
		//x已经被销毁了，可以重新声明，但是无法直接调用了。
//		System.out.println(x);
		//数10个数
		for(int x=1;x<=10;++x) {
			System.out.println(x);
		}
		
		//数10以内的奇数
		for(int x=1;x<=10;x=x+2) {
			System.out.println(x);
		}
	}

}
