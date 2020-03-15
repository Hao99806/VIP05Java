package com.testing.class3;

import java.util.Scanner;

public class IfTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("请输入看见的东西：");
		// 老婆的逻辑
		String thereAre = input.nextLine();
		// 路上如果有包子就买包子
		System.out.println("老婆想要的");
		if (thereAre.contains("包子")) {
			System.out.println("买一斤包子");
		} 

		if (thereAre.contains("西瓜")) {
			System.out.println("买一个西瓜");
		}

		// 程序员的逻辑
		System.out.println("程序员买的：");
		if (thereAre.contains("包子")) {
			if (thereAre.contains("西瓜")) {
				System.out.println("买一个包子");
			} else {
				System.out.println("买一斤包子");
			}
		}

	}

}
