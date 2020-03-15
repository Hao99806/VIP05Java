package com.testing.class5;

import java.util.Arrays;

public class UseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {234,1,23,555,64,23412,88,2};
		//直接用类名调用静态方法。
		Arrays.sort(a);
		for(int i:a) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		//倒序输出
		for(int i=a.length-1;i>=0;i--) {
			System.out.print(a[i]+" ");
		}
		
		System.out.println("调用fill方法赋值：");
		Arrays.fill(a,1);
		for(int i:a) {
			System.out.print(i+" ");
		}
		System.out.println("fill部分赋值");
		//fill的重载方法，可以选择开始和结束的赋值下标。结束下标不包含在内
		Arrays.fill(a, 2, a.length, 15);
		for(int i:a) {
			System.out.print(i+1+" ");
		}
	}

}
