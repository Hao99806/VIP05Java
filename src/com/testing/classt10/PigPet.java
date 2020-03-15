package com.testing.classt10;

public class PigPet extends Pet{

	public void drink() {
		System.out.println("小猪用嘴往槽里砸着喝水");
	}
	
	public void sell() {
		System.out.println("猪肉卖出去很贵");
	}
	
	public String getPetKind() {
		return "小猪猪";
	}
}
