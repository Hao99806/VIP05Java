package com.testing.class8;

public class Yanghui {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//定义最后一行也就是最长数组的长度
		int level=11;
		//上层数组
		int[] arr1=new int[level];
		//当前数组
		int[] arr2=new int[level];
		//上层数组赋初值
		arr1[0]=1;
		//遍历杨辉三角的每一层,层数也就是行数刚好就是这一行数组的长度
		for(int ceng=1;ceng<=level;ceng++) {
			//内层循环，遍历计算当前层的每个数字
			for(int xiabiao=0;xiabiao<ceng;xiabiao++) {
				//如果下标为0或者ceng-1也就是数组第一个数和最后一个数的话，直接赋值为1
				if(xiabiao==0||xiabiao==ceng-1) {
					arr2[xiabiao]=1;
				}
				//其它条件下，arr2的下标数字等于arr1对应下标以及前一位数字之和
				else {
					arr2[xiabiao]=arr1[xiabiao]+arr1[xiabiao-1];
				}
			}
			
			//将计算的arr2的结果赋值给arr1，作为下一层计算时的上层数据
			for(int i=0;i<ceng;i++) {
				arr1[i]=arr2[i];
			}
			//输出当前层的数据
			//输出空白,每一层输出的时候，前面空level-ceng *0.5个格子
			//最后一行不用空格，由于%-0s报错，所以做个判断
			if(level>ceng) {
			System.out.format("%-"+2*(level-ceng)+"s","");
			}
			//输出数字
			for(int j=0;j<ceng;j++) {
				System.out.format("%-4s",arr2[j]);
			}
			//每一层输出之后换个行
			System.out.println();
		}
		
		
	}

}
