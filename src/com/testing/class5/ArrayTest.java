package com.testing.class5;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//直接赋初值的定义方式
		int[] a= {1,23,13,54};
		//声明数组大小的定义方式
		int[] b= new int[4];
		//赋值操作
		b[0]=3;
		b[1]=7;
		b[2]=123;
		//遍历数据
		System.out.println(a);
		//通过for循环基于下标进行数组中的数据取值
		for(int xiabiao=0;xiabiao<2;xiabiao++) {
			System.out.print(a[xiabiao]+" ");
		}
		System.out.println();
		//取所有的数据,a.length取数组的长度，注意数组的最后一个元素下标是a.length-1
		for(int xiabiao=0;xiabiao<a.length;xiabiao++) {
			System.out.print(a[xiabiao]+" ");
		}
		System.out.println();
		//foreach循环，增强型for循环，必然遍历所有的元素
		for(int i:a) {
			//注意这里的i是数组里的值而不是下标，不要这样写
//			System.out.print(a[i]+" ");
		}
		//未赋值的数据，默认为0
		for(int i:b) {
			System.out.print(i + " ");
		}
		//修改数组中的数据，就是直接重新赋值
		b[0]=45;
		for(int i:b) {
			System.out.print(i + " ");
		}
		//String类型的数组，元素默认初值是null
		String[] sArray=new String[3];
		sArray[0]="roy";
		sArray[1]="teacher";
		System.out.println(sArray);
		for(String s:sArray) {
			System.out.println(s);
		}
		
		
		
		
		
		
		
		
	}

}
