package com.testing.class5;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> map=new HashMap<String, String>();
		//增
		map.put("roy", "帅气的小伙砸");
		map.put("will","单身狗");
		map.put("卡卡", "帅气的小伙砸");
		map.put("琦琦", "漂亮的小姐姐");
		System.out.println(map);
		
		//删除操作
		map.remove("roy");
		System.out.println(map);
		//基于键值对删除，安全性更高，必须键和值匹配才能删掉。
		map.remove("will", "帅");
		System.out.println(map);
		
		//修改操作
//		map.replace("will", "帅气的单身狗");
//		System.out.println(map);
//		//由于map中无法存储多个相同的键，所以修改操作，经常也是用put来完成。
//		map.put("will", "被玩坏了");
//		System.out.println(map);
		
		/**
		 * map遍历时，可以基于键来进行遍历，或者基于键值对（Entry入口）来进行遍历
		 * 由于没有下标，所以不能使用普通for循环
		 */
		//map的keyset方法，返回一个set类型的存储了所有键的集合
//		System.out.println(map.keySet());
//		//遍历键就相当于遍历一个存储了所有键名的集合
//		for(String key:map.keySet()) {
//			System.out.println("键是"+key+"值是"+map.get(key));
//		}
//		//遍历entry的方式,将键值对作为完整整体进行处理
//		System.out.println("entryset的结果："+map.entrySet());
//		//进行foreach遍历时，每个元素是Entry<K,V>
//		for(Entry<String, String> en:map.entrySet()) {
//			System.out.println("存储的键值对是："+en);
//		}
		
		/**
		 * iterator循环
		 * 依然可以基于key或者entry进行遍历
		 */
		Set<String> mapKeyset=map.keySet();
		//基于keyset取迭代器
		Iterator<String> keyIt=mapKeyset.iterator();
		//通过iterator进行遍历
		//典型错误：
		while(keyIt.hasNext()) {
			//每个keyIt.next()会取下一个值，所以第一个keyIt.next()取的是will，第二个keyIt.next()取的是卡卡
			//第二次取的时候，第一个keyIt.next()取的是琦琦，第二个，想去去第4个键了，但是没有，所以noSuchElement
			System.out.println("键是"+keyIt.next()+"值是"+map.get(keyIt.next()));
		}
		//解决方案：一次hasnext判断，只做一次next取值。
//		while(keyIt.hasNext()) {
//			//只调用一次next，把取到的值先存起来。
//			String key=keyIt.next();
//			System.out.println("键是"+key+"值是"+map.get(key));
//		}
		
		
		
		
		
		
		
		
		
	}

}
