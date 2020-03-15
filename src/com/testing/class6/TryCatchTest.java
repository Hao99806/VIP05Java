package com.testing.class6;

public class TryCatchTest {
	public static void main(String[] args) {
		//String转其他类型
		//integer能够自动转换成int使用。
		//try catch的机制，尝试去运行某些代码，如果出现异常，在catch中进行处理，而不影响后续代码的使用。
		try {
			int as = Integer.parseInt("1234.5");
			Integer ias=Integer.parseInt("234");
			System.out.println(as);
			System.out.println(ias);
//			System.err.println("输出红色的字体"+as);
			
			
			float af=Float.parseFloat("2345.6");
			Float faf=Float.parseFloat("123.5");
			System.out.println(af);
			System.out.println(faf);
			
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			
			e.printStackTrace();
		}
		//不管是否成功都要执行
		System.out.println("测试执行成功");

	}
}
