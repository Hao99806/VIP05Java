package com.testing.class2;

public class SelfPlus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//前自增和后自增体现区别在一行代码中执行时才会有差异
		int a=1;
		//相当于a=a+1，a自增
		
//		a++;
		//结果是2
//		System.out.println(a);
		//结果是1
		System.out.println(a++);
		
		int b=1;
		//前自增
//		++b;
		//结果是2
//		System.out.println(b);
		//结果是2
		System.out.println(++b);
		

		int c=1;
		//先自增 再取值 寄存器取到的是  2 + 3
		int resultBefore=++c +3;
		System.out.println(resultBefore);
		//运算完成之后，自增都已经完成了，所以值都变成2
		System.out.println(c);
		
		
		int d=1;
		//先取值 再自增 寄存器取到的是  1 + 3
		int resultAfter=d++ +3;
		System.out.println(resultAfter);
		//运算完成之后，自增都已经完成了，所以值都变成2
		System.out.println(d);
		
		
		int x=1;
		//寄存器取值 
		//     2      3     4
		int z= ++x + ++x + ++x;
		System.out.println("z计算完成之后x的值"+x);
		//    取值4之后自增  取5   6  
		int z2 = x++ + x++ + x++;
		//取值计算完了之后，x=6还要做一次后自增，最后变成7
		System.out.println("z2计算完成之后x的值"+x);
		
		System.out.println(z);
		System.out.println(z2);
		
		//自增的优先级高于四则运算
		int e=3;
		//记住运算的时候，=右边的式子，以寄存器中的值完成计算
		//     先取3  后自减
		int f= e-- * 3;
		System.out.println(f);
		
		
	}

}
