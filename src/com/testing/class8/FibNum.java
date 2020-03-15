package com.testing.class8;

public class FibNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fib(10));
	}

	public static int fib(int index) {
		int result=0;
		if(index>0) {
			if(index==1||index==2) {
				result=1;
			}
			else {
				result=fib(index-1)+fib(index-2);
			}
			return result;
		}
		else {
			return -1;
		}
	}
	
}
