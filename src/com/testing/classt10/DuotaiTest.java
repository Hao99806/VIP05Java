package com.testing.classt10;

import com.testing.class9.ADog;
import com.testing.class9.Animal;
import com.testing.class9.Human;

public class DuotaiTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//向上转型，子类的对象实例化实现的时候，转为父类类型
		Pet xiaohei=new DogPet();
		DogPet xiaobai=new DogPet();
		Pet dudu=new PigPet();
		xiaohei.drink();
		xiaohei.eat();
		dudu.drink();
		//向上转型之后，子类的扩展方法被隐藏不可以再使用
//		xiaohei.watchdoor();
		//没有向上转型，扩展的方法可以使用
		xiaobai.watchdoor();
		//向上转型时，不需要关注实现子类类型，方法调用时体现多态。
		Slave roy=new Slave();
		roy.feedPet(xiaohei, "骨头");
		roy.feedPet(dudu, "饲料");
		//向下转型
		((DogPet)xiaohei).watchdoor();
		//向下转型，用一个新的子类变量接收。
		PigPet duP=(PigPet)dudu;
		//向下转型之后，子类扩展实现的方法和变量又可以重新使用。
		duP.sell();
		//向下转型只能是原本就是子类对象转来的pet转回去，不能是一个父类对象直接转
//		Pet pp=new Pet();
//		DogPet pd=(DogPet)pp;
//		pd.watchdoor();
		//方法调用要使用子类对象时，不能使用向上转型的类型，要用子类对象
		roy.feedDog((DogPet)xiaohei);
		roy.feedPig(duP);
		//当方法调用时，接收的类型能够自动完成向上转型。
		roy.feedPet(duP, "剩饭剩菜");
		
	}

}
