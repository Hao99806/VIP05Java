package com.testing.class6;

public class MobilePhoneMatches {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//匹配手机号码，规则：第一位是1，第二位可以是3-9，第三到第11位可以是任何的数字，长度一共11位
		String mobileRegex="1[3-9][0-9]{9}";
		//测试正则表达式正确性
		String m1="12345678901";
		String m2="13300001234";
		String m3="1333333444455";
		String m4="012345x6789";
		
		
		System.out.println(m1.matches(mobileRegex));
		System.out.println(m2.matches(mobileRegex));
		System.out.println(m3.matches(mobileRegex));
		System.out.println(m4.matches(mobileRegex));
		
		
		
	}

}
