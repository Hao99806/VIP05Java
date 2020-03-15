package com.testing.classt10;

public class OuheTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DogPet xiaohei=new DogPet();
		xiaohei.eat();
		//由于类之间的耦合，从而会导致修改时产生问题。
		PigPet dudu=new PigPet();
		dudu.eat();
		
	}

}
