package com.testing.class6;

public class RegexTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str1="roy老师";
		String str2="will老师可爱";
		String str3="测试账号同学";
		String str4="kintuem同学";
		String str5="1111同学";
		String str6="....同学";
		
//		//制定一个标准
//		String regexTeacher="....老师..";
//		System.out.println("roy匹配结果"+str1.matches(regexTeacher));
//		System.out.println("will匹配结果"+str2.matches(regexTeacher));
//		
//		//匹配同学
//		String regexStudent="\\w{2,4}同学";
//		System.out.println("测试账号匹配结果"+str3.matches(regexStudent));
//		System.out.println("kintuem匹配结果"+str4.matches(regexStudent));
//		System.out.println("1111同学的匹配结果"+str5.matches(regexStudent));
		
		//正则表达式在java中，如果要表示特殊的字符，转义用两个反斜杠\\
		//比如\\.表示一个普通的.符号，而不是正则表达式中用于表达任意字符的.号
		//表示的是同学前必须是4个.号
		String regexdot="\\.{4}同学";
		//表示的是同学前有4个任意字符
		String anyChar=".{4}同学";
		System.out.println("测试账号匹配结果"+str3.matches(regexdot));
		System.out.println("kintuem匹配结果"+str4.matches(regexdot));
		System.out.println("1111同学的匹配结果"+str5.matches(regexdot));
		System.out.println("....同学的匹配结果"+str6.matches(regexdot));
		
		
		
		
		
	}

}
