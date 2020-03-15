package com.testing.class6;

public class StringOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String str=null;//
		String str="今天天气有点冷";
//		System.out.println(str.charAt(3));
//		System.out.println(str.length());
//		String str1=str.replace('气', '空');
//		//replace方法不改变原字符串
//		System.out.println(str);
//		//改变后的结果需要用另一个字符串接收
//		System.out.println(str1);
//		//截取子字符串的时候，末尾位的字符被剔除了，取的值是[beginIndex,endIndex)
//		String str2=str.substring(3, 6);
//		System.out.println(str2);
		
//		boolean whetherCold=str.equals("今天天气有点冷");
//		System.out.println(whetherCold);
		//推荐写法
		boolean whethCold="今天天气有点冷".equals(str);
		System.out.println(whethCold);
		
		boolean result=str.contains("天气");
		System.out.println(result);
		
	}
}
