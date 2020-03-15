package com.testing.class3;

public class IfFirst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=16;
//		//()里面的内容是判断条件
//		if(x < 8 || x<< 1 + 2 < 50 && !(x++ > 15))
//		{//满足条件时执行的语句
//			System.out.println("x在取值范围内");
//		}
//		else {
//			//不满足条件时做的事情
//		}
		
		if(true) {
			System.out.println("永远都被运行，这是真的");
		}
		
		//如果某个场景有超过两种选择出现，并且选择是互斥的
		if(x==18) {
			System.out.println("x是18");
		}
		//先满足x<18，然后判断x是否小于6
		else if(x<18) {
			System.out.println("x小于18");
			//嵌套逻辑
			if(x<6) {
				System.out.println("x小于6");
				return ;
			}
			else {
				System.out.println("x大于6且小于18");
			}
		}
		else {
			System.out.println("x大于18");
		}
		
		
	}

}
