package com.testing.class9;

public class QuickSortDesc {

	/**
	 * 快速排序算法，需要的参数，原始数组、数组还未排序的数字左右下标
	 * 
	 * @return返回排序后的数组
	 */

	public static int[] quickSortAlgHighBase(int[] arr, int low, int high) {
		// 声明从左到右和从右到左移动的下标
		int left = low;
		int right = high;
		// 基准值的选择，选择待排序数组的最左端
		int base = arr[high];
		// 外层循环，一轮快速排序完成整个数组的遍历操作，直到left=right说明数组遍历完成
		while (left < right) {
			// 从左往右进行比较的循环
			while (left < right) {
				if (arr[left] > base) {
					left++;
				} else {
					int tmp = arr[left];
					arr[left] = arr[right];
					arr[right] = tmp;
					// 右下标移动一位
					right--;
					// 一旦出现交换，变成从右往左比
					break;
				}

			}

			// 从右往左进行比较的循环
			while (left < right) {
				// 当前数比基准值大，位置是正确的，不需要交换，下标移动一位
				if (arr[right] < base) {
					right--;
				}
				// 当前数比基准值小，则进行交换，同时左下标移动一位。
				else {
					int tmp = arr[left];
					arr[left] = arr[right];
					arr[right] = tmp;
					// 左下标移动一位
					left++;
					// 一旦出现交换，则换成从左往右比
					break;
				}
			}

		}
		// 递归的出口条件
		// 左边的出口条件，low>=left-1; 什么都不做,相当于只有low<left-1时，才做递归
		if (low < left - 1) {
			quickSortAlgHighBase(arr, low, left - 1);
		}

		// 右边的出口条件,high<=right+1;什么都不做，相当于只有high>right+1时，才做递归
		if (high > right + 1) {
			quickSortAlgHighBase(arr, right + 1, high);
		}

		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48 };
		int[] res = quickSortAlgHighBase(a, 0, a.length - 1);
		// 输出结果
		for (int i : res) {
			System.out.print(i + " ");
		}
	}

}
