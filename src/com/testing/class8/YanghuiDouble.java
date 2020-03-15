package com.testing.class8;

public class YanghuiDouble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		yanghuiOutput(5);
	}

	public static void yanghuiOutput(int level) {
		//首先确认杨辉三角的层数，基于此创建二维数组的行数,每行的长度（一维数组长度）在遍历时创建
		int[][] yh=new int[level][];
		for(int ceng=0;ceng<level;ceng++) {
			//创建一维数组
			yh[ceng]=new int[ceng+1];
			//遍历每一层进行计算
			for(int xiabiao=0;xiabiao<=ceng;xiabiao++) {
				if(xiabiao==0||xiabiao==ceng) {
					yh[ceng][xiabiao]=1;
				}
				else {
					//当前层的当前位置的数等于上一层的当前位置的数+上一层前一位的数字
					yh[ceng][xiabiao]=yh[ceng-1][xiabiao]+yh[ceng-1][xiabiao-1];
				}
			}
		}
		//输出
		for(int[] a:yh) {
			for(int i:a) {
				System.out.print(i+"\t");
			}
			System.out.println();
		}
		
		//三角形输出
		for(int ceng=0;ceng<level;ceng++) {
			//先拼接每行空的格数
			String spaceL="%-"+2*(level-ceng)+"s";
			System.out.format(spaceL,"");
			//输出当前层的数字
			for(int xiabiao=0;xiabiao<=ceng;xiabiao++) {
				System.out.format("%-4s",yh[ceng][xiabiao]);
			}
			//换行
			System.out.println();
		}
		System.out.println(yh);
	}
}
