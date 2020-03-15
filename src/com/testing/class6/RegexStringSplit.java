package com.testing.class6;

public class RegexStringSplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="[1, 2, 3, 5, 4, 6, 9, 7, 8, 0]";
		//replace替换是直接用字符串替换
		String sRep=s.replace(",", "xxx");
		System.out.println(sRep);
		
		//\\[表示普通的中括号符号，[]表示正则中的含义，在其中进行选择
		String sReA=s.replaceAll("[\\[,\\]]", "");
		System.out.println(sReA);
		
		String sReB=sReA.replaceAll("[1-5]", "x");
		System.out.println(sReB);
		
		String[] sPlit= s.split("[\\[,\\]]");
		for(String ss:sPlit) {
			System.out.println(ss+" ");
		}
		
		
		
	}

}
