package com.testing.class11.unittest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ PlusTest.class,LoginParamTest.class,com.testing.class11.LoginUnitTest.class })
public class LoginAndPlusTest {

}
