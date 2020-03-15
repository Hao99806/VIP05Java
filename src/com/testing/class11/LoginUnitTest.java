package com.testing.class11;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.internal.MethodSorter;
import org.junit.runner.RunWith;


public class LoginUnitTest {

	//为了让所有方法都能使用被测类的实例化对象，声明为成员变量。
	private static LoginSample ls;
	
	//在整个测试类运行之前进行的操作，经常用于进行测试准备工作
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("----------loginUnitTest测试前准备，完成ls的实例化-----------");
		ls=new LoginSample();
	}

	//在整个测试类运行之后进行的操作，经常用于进行测试环境清理
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("----------测试后的清理工作-----------");
	}

	@Before
	//在每个@test方法运行之前运行
	public void setUp() throws Exception {
		System.out.println("********************每个测试方法运行之前运行****************");
	}

	@After
	//在每个@test方法运行之后运行
	public void tearDown() throws Exception {
		System.out.println("********************每个测试方法运行之后运行****************");
		
	}

	//测试方法
	@Test
	public void normaltest() {
		boolean result=ls.login("Roy", "123456");
		//断言，判断用例运行结果是否通过
		assertEquals(result, true);
		//通过方法运行返回的布尔结果进行断言
		assertTrue(result);
	}
	
	@Test
	public void usernulltest() {
		ls.login(null, "123456");
		//通过ls类中的字符串内容来进行断言
		assertEquals("验证用户名为空时的返回结果正确", "用户名密码不能为空！", ls.resultMSG);
	}

}
