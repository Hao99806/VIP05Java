package com.testing.class7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

public class IpJson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String IpJson="{\"status\":\"0\",\"t\":\"1577448508376\",\"set_cache_time\":\"\",\"data\":[{\"location\":\"美国\",\"titlecont\":\"IP地址查询\",\"origip\":\"3.3.3.3\",\"origipquery\":\"3.3.3.3\",\"showlamp\":\"1\",\"showLikeShare\":1,\"shareImage\":1,\"ExtendedLocation\":\"\",\"OriginQuery\":\"3.3.3.3\",\"tplt\":\"ip\",\"resourceid\":\"6006\",\"fetchkey\":\"3.3.3.3\",\"appinfo\":\"\",\"role_id\":0,\"disp_type\":0}]}";
		//Json格式字符串和map对象进行转换
		//先将json格式字符串转换为json对象
		JSONObject ipJsonOB= JSON.parseObject(IpJson);
		//json对象就可以直接进行get的操作来获取键所对应的值
		System.out.println(ipJsonOB.get("t"));
		//转存为一个Map
		Map<String, Object> ipMap=new HashMap<String, Object>();
		//遍历json格式中的每个键值对，存储到map里面去
		for(String key:ipJsonOB.keySet()) {
			//基于json对象的键集合进行遍历，获取键值对存到map里面去
			ipMap.put(key, ipJsonOB.get(key));
		}
		System.out.println(ipMap);
		
		//fastjson直接转换
		//如果直接写Map，不带<>，存储的元素类型是可以变化的，但是编译器并不建议这样做。
		Map<String,Object> deMap=(Map<String,Object>)JSON.parse(IpJson);
		System.out.println("直接转换为Map的结果："+deMap);
		System.out.println(deMap.get("status"));
		
		//Map拼接为json字符串
		String reIpJson="{";
		//json格式中的存储方式："键":值，如果值是字符串，就需要双引号，如果不是，就不需要
		for(Entry<String, Object> en:ipMap.entrySet()) {
			//如果值类型是String，那么拼接时加上""，逗号用于分割不同的键值对。
			if(en.getValue() instanceof String) {
				reIpJson += "\""+en.getKey()+"\":\""+en.getValue()+"\",";
			}
			//否则不需要
			else {
				reIpJson +="\""+en.getKey()+"\":"+en.getValue()+",";
			}
		}
		System.out.println(reIpJson);
		//取子字符串去掉最后一个逗号字符，并且赋值给自己
		reIpJson=reIpJson.substring(0, reIpJson.length()-1);
		reIpJson+="}";
		System.out.println(reIpJson);
		
		//使用fastjson的toJsonString方法，直接转换map为json格式字符串
		String reJson=JSON.toJSONString(ipMap);
		System.out.println(reJson);
		
		
	
	}

}
