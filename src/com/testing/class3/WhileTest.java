package com.testing.class3;

public class WhileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//相当于for(;i<10;)的写法
		int i=14;
		//while循环一定要注意更新循环变量
		while(i<10) {
			//循环体
			System.out.println(i+1);
			i++;
		}
		System.out.println("while循环结束之后 i的值"+i);
		
		
		//相当于for(;;)的写法
		int y=0;
		//死循环，注意设置退出while循环的条件
		while(true) {
			if(y<10) {
				System.out.println(y+1);
				++y;
			}
			//当不满足条件时，结束for循环的执行
			else {
				break;
			}
		}
		System.out.println("while循环结束之后 y的值"+y);
	}

}
