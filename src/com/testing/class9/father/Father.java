package com.testing.class9.father;

public class Father {
	//私有权限，除了自己，别人都不能用
	private String wife="老婆是私有的";
	//default权限，也就是什么权限修饰符都不加，在同一个包中的类能够使用
    String ownMoney="私房钱";
    //protected,同一个包中的类能够使用，在不同包中，只有继承了这个类的子类能够使用它。
    protected String house="房产证";
    //其它包中的类也能使用
    public String name="roy";
  
    
    private void saveMoney() {
    	System.out.println("这是个私有方法，存私房钱");
    }
    
	void cook() {
		System.out.println(wife);
		System.out.println("这是个default方法,做饭给家里人吃");
	}
	
	protected void married() {
		System.out.println("给女儿的嫁妆，女婿不能用");
	}
	
	public void speek() {
		System.out.println("这是个public方法，说话给所有人听");
	}
	
	
	
	public static void main(String[] args) {
		Father sameClassFather=new Father();
	}
}
