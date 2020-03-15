package com.testing.class3;

public class ContinueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("continue跳过本次循环体执行");
		int x=0;
		//continue表示x==5的时候跳过一次循环，和只有x!=5的时候执行循环体操作，是一个意思，所以没必要用continue
		for(;x<10;x++) {
			if(x==5) {
				//跳过本次循环体的执行，直接到循环控制变量的更新
//				continue;
			}
			//continue之后，循环体中剩下的语句不再执行。
			else {
			System.out.println(x);
			}
		}
		System.out.println("continue之后x的值"+x);
		
		
		System.out.println("break结束循环");
		//break结束循环
		int i=0;
		for(;i<10;i++) {
			if(i==5) {
				//跳出循环，结束循环的运行
				break;
			}
			System.out.println(i);
		}
		System.out.println("break之后i的值"+i);
		
		
		System.out.println("return结束整个方法，return之后的所有语句都不执行了");
		//return结束整个方法运行
		int y=0;
		for(;y<10;y++) {
			if(y==5) {
				//跳出循环，结束循环的运行
				return;
			}
			System.out.println(y);
		}
		//由于已经被return结束方法运行，所以这句代码没有执行。
		System.out.println("return之后y的值"+y);
		
	}

}
