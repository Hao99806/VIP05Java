package com.testing.classt10.interF;

public class TestAbClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstrClass ab=new AbstrClass() {
			
			@Override
			public void drink() {
				// TODO Auto-generated method stub
				System.out.println("要喝水");
			}
		};
		
		ab.drink();
		
		//抽象类中的抽象方法需要在继承时实现，非抽象方法可以直接被继承，并且被子类使用
		AbSubClass abs=new AbSubClass();
		abs.drink();
		abs.eat();
	}

}
