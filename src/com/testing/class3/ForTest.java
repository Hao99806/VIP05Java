package com.testing.class3;

public class ForTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=0;
		for(;x<10;x++) 
		{
			System.out.println(x+1);
		}
		System.out.println("循环完成之后x的值是"+x);
		//x已经在main方法中被声明过了不能再次声明。
//		int x=0;
		//由于循环控制变量的更新语句，在循环体执行之后执行，所以可以把它放到循环体中，在执行完之后执行
		int i=0;
		for(;i<10;) {
			System.out.println(i+1);
			++i;
		}
		System.out.println("循环完成之后i的值是"+i);
		//省略条件判断语句，条件判断语句，满足时执行循环体，不满足时结束for循环。
		int y=0;
		//控制条件记得写，要不然死循环
		for(;;) {
			if(y<10) {
				System.out.println(y+1);
				++y;
			}
			//当不满足条件时，结束for循环的执行
			else {
				break;
			}
		}
		System.out.println("循环完成之后y的值是"+y);
		
		
		
	}

}
