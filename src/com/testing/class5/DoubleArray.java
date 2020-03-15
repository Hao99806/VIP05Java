package com.testing.class5;

public class DoubleArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//二维数组的第一个长度代表着有多少个一维数组（行），第二个长度代表着一维数组中有多少个元素（列）
		int[][] dArray=new int[3][4];
		dArray[0][1]=3;
		dArray[2][3]=4;
		System.out.println(dArray);
		//遍历二维数组
		//先遍历每一行
		for(int line=0;line<dArray.length;line++) {
			//遍历每一列
			for(int column=0;column<4;column++) {
				System.out.print(dArray[line][column]+" ");
			}
			System.out.println();
		}
		//foreach遍历
		//二维数组中存储的元素其实就是多个一维数组，
		for(int[] iArray:dArray) {
			System.out.println(iArray);
			//一维数组中存储的才是真正的数据
			for(int x:iArray)
			{
				System.out.print(x);
			}
		}
		
		
		
	}

}
