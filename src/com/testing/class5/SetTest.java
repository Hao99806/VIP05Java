package com.testing.class5;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//容器类型存储时，只能存储类类型，而不能是基本数据类型,所有的基本数据类型都有其已经实现好的类类型。
//		Set<int> iset=new HashSet<int>();
		//int类型对应的类类型Integer
		//向下转型完成声明
		Set<Integer> inset=new HashSet<Integer>();
		inset.add(1);
		inset.add(3);
		inset.add(5);
		//直接输出set中的内容
		System.out.println(inset);
		//删除元素，直接删值
		inset.remove(3);
		//没有的值，就不动
		inset.remove(4);
		//清空set
//		inset.clear();
		System.out.println(inset);
		//遍历set,由于set没有下标，所以不能使用普通for循环遍历
		for(int i:inset) {
			System.out.println(i+1);
		}
		
		//iterator迭代器遍历set,通过set的iterator方法返回一个对应类型的迭代器。
		Iterator<Integer> inIt=inset.iterator();
		//首先基于hasnext方法判断是否还有未遍历的元素
		while(inIt.hasNext()) {
			//然后next方法取出下个元素
			System.out.println(inIt.next());
		}
		
		
		
		
		
		
	}

}
