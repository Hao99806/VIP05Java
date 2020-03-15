package com.testing.class6;

public class RegexCountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String roy="roy";
		String roy2="royyyyyyy";
		String roy3="royroyroy";
		String roy4="royroorry";
		
		
		//量词限定的是量词前面的一个字符，如果想要让量词表示一个词组出现多少次的话，用()括起来
		//表示y出现1到7次
		String regexRoy="roy{1,7}";
		System.out.println("roy匹配结果"+roy.matches(regexRoy));
		System.out.println("roy2匹配结果"+roy2.matches(regexRoy));
		System.out.println("roy3匹配结果"+roy3.matches(regexRoy));
		//表示roy作为一个整体词组出现1到7次，代表着字符串最长21位
		String regexRoy2="(roy){1,7}";
		System.out.println("roy匹配结果"+roy.matches(regexRoy2));
		System.out.println("roy2匹配结果"+roy2.matches(regexRoy2));
		System.out.println("roy3匹配结果"+roy3.matches(regexRoy2));
		//中括号的使用：[]括起来的部分只匹配一个字符，代表[]里的任意一个字符
		//[roy]{7}表示 r或者o或者y中的随机选择一个出现1到7次，无关顺序。代表字符串最长9位
		String regexRoy3="ro[roy]{7}";
		System.out.println("roy匹配结果"+roy.matches(regexRoy3));
		System.out.println("roy2匹配结果"+roy2.matches(regexRoy3));
		System.out.println("roy3匹配结果"+roy3.matches(regexRoy3));
		System.out.println("roy4匹配结果"+roy4.matches(regexRoy3));
		
		
		
	}

}
