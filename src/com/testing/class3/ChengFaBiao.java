package com.testing.class3;

public class ChengFaBiao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//外层循环完成9行的输出
		for(int row=1;row<10;row++) {
			//一行中需要输出 row*1 row*2 …… row*9
			//内层循环，计算row*line，并且输出一行中每个格子的内容
			for(int column=1;column<10;column++) {
				//计算结果
				int result=row*column;
//				System.out.print(row+"×"+column+"="+result+"   ");
				//去掉一条对角线
				if(row+column==10) {
					//如果乘数+被乘数=10，就在对角线上，这是输出一个空格
					System.out.format("%-8s","");
				}
				else {
					//不等于10则输出计算式
				//格式化输出,第一个参数表示 % 使用格式 ，8表示留8个字符位置用作输出，s表示string字符串,-号表示左对齐
				System.out.format("%-8s", row+"×"+column+"="+result);
				}
			}
			//换行操作
			System.out.println();
		}
		
		
	}

}
