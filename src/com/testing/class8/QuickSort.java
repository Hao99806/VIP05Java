package com.testing.class8;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48 };
		int[] result=quickSort(a, 0, a.length-1);
		for(int i:a) {
			System.out.print(i+" ");
		}
		
		
	}

	public static int[] quickSort(int[] a,int low, int high) {
		//左右的游标进行初始化
		int left=low;
		int right=high;
		//选择基准值
		int base=a[left];
		//遍历整个数组,当左右游标没有碰头的时候就继续遍历
		while(left<right) {
			//从右向左的遍历
			while(left<right) {
				if(a[right]>base) {
					right--;
				}
				//交换
				else {
					int tmp=a[left];
					a[left]=a[right];
					a[right]=tmp;
					left++;
					//退出从右往左的循环，进入从左往右的循环
					break;
				}
			}//break会退出从右往左的循环，接着往下执行
			
			
			//从左向右的遍历
			while(left<right) {
				if(a[left]<base) {
					left++;
				}
				else {
					int tmp=a[left];
					a[left]=a[right];
					a[right]=tmp;
					right--;
					//退出从左往右的循环，进入从右往左的循环
					break;
				}
			}//break退出循环到这，如果满足left<right,继续遍历，切换到从右往左
			
			
		}//while结束会完成一个数组的拆分
		//对左边进行递归排序
		if(low<left-1) {
			quickSort(a, low, left-1);
		}
//		else {
//			//退出递归条件
//		}
		//对右边进行递归排序
		if(right+1<high) {
			quickSort(a, right+1, high);
		}
//		else {
//			//退出递归条件
//		}
		
		return a;
	}
	
}
