package com.testing.classt10;

public class Slave {
	
	public void feedPet(Pet pet,String food) {
		System.out.println("人类正在给"+pet.getPetKind()+"喂"+food);
	}
	
	
	public void feedDog(DogPet dog) {
		System.out.println("狗奴正在给主子喂骨头");
	}
	
	public void feedPig(PigPet pig) {
		System.out.println("猪奴正在给主子喂饲料");
	}
	
}
