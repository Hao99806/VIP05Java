package com.testing.class5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * list没有定义上的二维list，但是list里面可以存list。
		 */
		List<String> sList=new ArrayList<String>();
		//增，插入元素
		//直接在链表最后插值
		sList.add("roy");
		sList.add("will");
		sList.add("kaka");
		//list插入是有序的
		System.out.println(sList);
		//list可以在任意位置插值
		sList.add(2, "土匪");
		System.out.println(sList);
		
		/**
		 * 删除操作，可以基于下标和值进行删除
		 */
		//基于下标删除
		sList.remove(2);
		System.out.println(sList);
		//基于值删除
		sList.remove("kaka");
		System.out.println(sList);
		
		/**
		 * 修改
		 */
		sList.set(1, "飘荡的cc");
		System.out.println(sList);
		
		/**
		 * 遍历
		 * 普通for循环、foreach循环、iterator都可以遍历
		 */
		//使用get方法获取下标位置对应的值
		for(int xiabiao=0;xiabiao<sList.size();xiabiao++) {
			System.out.print(sList.get(xiabiao)+" ");
		}
		System.out.println();
		//foreach循环
		for(String s:sList) {
			System.out.print(s+" ");
		}
		//iterator遍历
		Iterator<String> lit=sList.iterator();
		while(lit.hasNext()) {
			System.out.println(lit.next());
		}
		
		//list的toArray方法，转换成数组，首先基于list的大小创建一个相同大小的数组
		String[] sArray=new String[sList.size()];
		//toArray方法，将list转换成为数组。
		sList.toArray(sArray);
		System.out.println("转成数组后的输出：");
		for(String s:sArray) {
			System.out.println(s);
		}
		
		
	}

}
