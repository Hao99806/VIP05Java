package com.testing.class8;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.testing.class7.IpJson;

public class Homework7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ipResult = "{\r\n" + 
				"	\"status\": \"0\",\r\n" + 
				"	\"t\": \"1577707379375\",\r\n" + 
				"	\"set_cache_time\": \"\",\r\n" + 
				"	\"data\": [\r\n" + 
				"		{\r\n" + 
				"			\"location\": \"美国\",\r\n" + 
				"			\"titlecont\": \"IP地址查询\",\r\n" + 
				"			\"origip\": \"3.3.3.3\",\r\n" + 
				"			\"origipquery\": \"3.3.3.3\",\r\n" + 
				"			\"showlamp\": \"1\",\r\n" + 
				"			\"showLikeShare\": 1,\r\n" + 
				"			\"shareImage\": 1,\r\n" + 
				"			\"ExtendedLocation\": \"\",\r\n" + 
				"			\"OriginQuery\": \"3.3.3.3\",\r\n" + 
				"			\"tplt\": \"ip\",\r\n" + 
				"			\"resourceid\": \"6006\",\r\n" + 
				"			\"fetchkey\": \"3.3.3.3\",\r\n" + 
				"			\"appinfo\": \"\",\r\n" + 
				"			\"role_id\": 0,\r\n" + 
				"			\"disp_type\": 0\r\n" + 
				"		},\r\n" + 
				"		{\r\n" + 
				"			\"location\": \"中国\",\r\n" + 
				"			\"titlecont\": \"IP改动\",\r\n" + 
				"			\"origip\": \"00000\"\r\n" + 
				"		}\r\n" + 
				"	]\r\n" + 
				"}";
		JSONObject ipJson=JSON.parseObject(ipResult);
		//json中的数组格式，在fastjson有对应的JSONArray类型
		JSONArray dataArray=ipJson.getJSONArray("data");
		System.out.println(dataArray);
		//JsonArray类似于一个list
		//直接get获取，不管它的类型，获取完之后强转
		JSONObject firstOb=(JSONObject)dataArray.get(0);
		System.out.println("输出第一个子json对象"+firstOb);
		//getJsonOBject获取，获取出来就是一个jsonObject
		JSONObject secondOb=dataArray.getJSONObject(1);
		System.out.println("输出第二个子json对象"+secondOb);
	}
}
