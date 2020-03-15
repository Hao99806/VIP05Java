package com.testing.class6;

public class StringClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//其它类型转字符串
		//1、基本数据类型可以直接通过+""拼接一个空字符串从而转换为String
		int a=1123;
		String s=a+"";
		System.out.println(s);
		//所有类类型都有的getClass()方法，获取类的定义内容(包括包名、类名、类体中定义的方法、变量等等跟类相关的内容)
		System.out.println(s.getClass().getName());
		//instanceof是个运算符，和加减乘除类似，作用是判断一个对象是否是某个类型的
		boolean whetherString= s instanceof String;
		System.out.println(whetherString);
		
		//2、基本数据类型对应的类类型
		Integer inteA=1234;
		String sInteA=inteA.toString();
		
		//3、通过String类的静态方法valueOf来进行转换
		String sf=String.valueOf((char)98);
		System.out.println(sf);
		System.out.println(sf instanceof String);
		
		//String转其他类型
		//integer能够自动转换成int使用。
		//由于try中的语句可能没有被运行，所以在try中的变量声明语句 int as，需要提到try外面，否则如果在后续代码中使用变量as，就会报错。
		int as=0;
		//try catch的机制，尝试去运行某些代码，如果出现异常，在catch中进行处理，而不影响后续代码的使用。
		try {
			as = Integer.parseInt("1234.5");
		}
		//如果try语句块中的语句执行失败，那么执行catch语句块中的内容
		catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			//将异常堆栈信息输出，输出异常的描述信息。
//			e.printStackTrace();
			System.err.println("不好意思，你要转换的不是一个整数");
		}
		Integer ias=Integer.parseInt("234");
		System.out.println(as);
		System.out.println(ias);
//		System.err.println("输出红色的字体"+as);
		
		
		float af=Float.parseFloat("2345.6");
		Float faf=Float.parseFloat("123.5");
		System.out.println(af);
		System.out.println(faf);
				
		
		
		
	}

}
