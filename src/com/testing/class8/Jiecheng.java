package com.testing.class8;

public class Jiecheng {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(jiecheng(5));

	}

	public static int jiecheng(int n) {
		int result = 0;
		// 递归出口，当n=1时，不再递归计算，而是直接得到结果为1
		if (n > 0) {
			if (n == 1) {
				result = 1;
			}
			// 当n不等于1的时候通过递归进行计算
			else {
				// n！=n*(n-1)!
				result = n * jiecheng(n - 1);
			}
			return result;
		} else {
			return -1;
		}
	}

}
