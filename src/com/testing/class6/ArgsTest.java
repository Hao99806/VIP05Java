package com.testing.class6;

public class ArgsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		String sA=args[0];
		String sB=args[1];
	
			int a= Integer.parseInt(sA);
			int b= Integer.parseInt(sB);
			if(a<b) {
				System.out.println("第一个参数"+a+"小于第二个参数"+b);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("输入参数不是整数，请检查");
		}
	}

}
