package com.testing.class6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Array2List {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * 数组转链表
		 */
//		// 原数组
		int[] a = { 1, 2, 3, 5, 4, 6, 9, 7, 8, 0 };
		// 打印内容
		for (int i : a) {
			System.out.print(i + " ");
		}
		System.out.println("");
		// foreach遍历存值
		List<Integer> lista = new ArrayList<Integer>();
		for (int i : a) {
			lista.add(i);
		}
		System.out.println("foreach循环数组转链表:" + lista);

		// for循环遍历存值
		List<Integer> lista2 = new ArrayList<>();
		for (int xb = 0; xb < a.length; xb++) {
			lista2.add(a[xb]);
		}
		System.out.println("for循环数组转链表:" + lista2);

//		// aslist转链表
		Integer[] aa = { 1, 2, 3, 5, 4, 6, 9, 7, 8, 0 };
		List<Integer> listaa =Arrays.asList(aa) ;
		//不能使用基本数据类型的数组用aslist进行转换，这样的话会将整个int[]数组作为一个元素存到list里面去
//		List<int[]> listab =Arrays.asList(a) ;
		System.out.println("aslist转链表:" + listaa);
		
		/**
		 * List转存数组
		 */
		// for循环存值
		int[] arrfor1 = new int[listaa.size()];
		for (int i = 0; i < listaa.size(); i++) {
			arrfor1[i] = listaa.get(i);
		}
		System.out.print("for循环链表转数组:");
		for (int i : arrfor1) {
			System.out.print(i + " ");
		}
		System.out.println("");

		// foreach循环存值
		int[] arrfor2 = new int[listaa.size()];
		//单独使用一个变量来记录当前数组的下标，控制循环的动作
		int index = 0;
		for (int i : listaa) {
			arrfor2[index] = i;
			//每存一个数到数组里面去，相应的下标就自增一次
			index++;
		}
		System.out.print("foreach循环链表转数组:");
		for (int i : arrfor2) {
			System.out.print(i + " ");
		}
		System.out.println("");

		// toArray方法，注意数组类型需要使用integer，和list类型保持一致
		Integer[] arr = new Integer[listaa.size()];
		listaa.toArray(arr);
		System.out.print("toArray方法:");
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println("");
	}

}
