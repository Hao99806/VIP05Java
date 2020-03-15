package com.testing.class8;

public class DoubleNine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] nine=new int[9][];
		//row代表二维数组下标，也就是行数
		for(int row=0;row<9;row++) {
			//每一行的数组长度是row+1
			nine[row]=new int[row+1];
			//col代表一维数组下标，也就是列，每一行的列数都和长度相等
			for(int col=0;col<row+1;col++){
				//第row行第col列的值是 row+1 * col+1
				nine[row][col]=(row+1)*(col+1);
			}
		}
		//二维数组输出
		//遍历一维数组，也就是每行
		for(int[] arr:nine) {
			//遍历元素，也就是每列的值
			for(int i:arr) {
				System.out.print(i +"\t");
			}
			System.out.println();
			
		}
		
		for(int i=0;i<nine.length;i++) {
			for(int j=0;j<nine[i].length;j++) {
				System.out.print((i+1)+"*"+(j+1)+"="+nine[i][j]+"\t");
			}
			System.out.println();
		}
		
		
	}

}
