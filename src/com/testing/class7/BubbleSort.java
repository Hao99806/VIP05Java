package com.testing.class7;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48 };
		// 外层循环：一共比较a.length-1轮
		for (int lun = 1; lun <= a.length - 1; lun++) {
			// 每一轮所做的事情：比较0到a.length-lun的下标的数，进行交换
			//最后一次比较的时候，是比较的倒数第二个数length-lun-1和最后一个数 length-lun，所以边界值取到的最后一位是length-lun-1
			for (int xiabiao = 0; xiabiao <=a.length-lun-1; xiabiao++) {
				// 比较相邻两个数的大小：比较标准：如果左边的数比右边的数大，则进行交换
				if (a[xiabiao] < a[xiabiao + 1]) {
					// 交换
					// 用一个临时的变量来完成交换，就像交换两个杯子里的水，需要第3个空杯子
					int tmp = a[xiabiao];
					a[xiabiao] = a[xiabiao + 1];
					a[xiabiao + 1] = tmp;
				}
			}
		}

		for (int i : a) {
			System.out.print(i + " ");
		}

	}

}
