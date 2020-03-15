package com.testing.class7;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48 };
		for(int lun=1;lun<=a.length-1;lun++) {
			//先创建两个变量，用于存储最小的值和所在的位置
			int minNum=a[lun-1];
			int minIndex=lun-1;
			//每轮排序：每个数和minNum进行比较，如果比minNum更小，则更新minNum
			for(int xiabiao=lun;xiabiao<=a.length-1;xiabiao++) {
				if(a[xiabiao]<minNum) {
					//如果更小，记录当前值为最小值，当前下标为最小值所在位置
					minNum=a[xiabiao];
					minIndex=xiabiao;
				}
			}
			//将找到的最小数，放到队伍最前面（就是值的交换）
			a[minIndex]=a[lun-1]; //将本轮最前面的数赋值给本轮找到最小值下标位置
			a[lun-1]=minNum;  //把本轮找到的最小值赋值给本轮最前面的
			
		}
		
		for(int i:a) {
			System.out.print(i+" ");
		}
		
		
		
	}

}
