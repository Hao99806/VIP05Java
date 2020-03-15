package com.testing.class9;

public class ADogTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ADog dog=new ADog();
		dog.drink();
		dog.eat();
		dog.showkind();
		dog.height=80;
		dog.ear="大耳朵";
		dog.bark();
		System.out.println(dog.hashCode());
		System.out.println(Integer.toHexString(dog.hashCode()));
		System.out.println(dog);
		
	}

}
