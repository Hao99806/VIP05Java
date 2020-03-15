package com.testing.classt10.interF;

public interface InterPet {
	//接口的变量只能是常量，并且权限只能是public
	//static 和 final修饰符都被隐藏了,public也被隐藏了
	public static final String STATUS="alive";
    String KIND="宠物";
    //接口中只允许有抽象的方法，只进行定义而不实现。
    public void eat();
    //方法权限修饰只能是public，省略之后也是public
    void drink();
}
