package main.lanucher;

import main.pattern.strategy.ITeacher;
import main.pattern.strategy.Mage;
import main.pattern.strategy.Thief;
import main.pattern.strategy.Warrior;

public class StrategyStart {
	public static void main(String[] args) {
		ITeacher warriorTeacher = new Warrior();
		System.out.println(warriorTeacher.identity());
		warriorTeacher.introduceYourself();
		warriorTeacher.teach();
		
		ITeacher mageTeacher = new Mage();
		System.out.println(mageTeacher.identity());
		mageTeacher.introduceYourself();
		mageTeacher.teach();
		
		ITeacher thiefTeacher = new Thief();
		System.out.println(thiefTeacher.identity());
		thiefTeacher.introduceYourself();
		thiefTeacher.setProfession(null);
		thiefTeacher.teach();
		System.out.println("Maybe I steel someone else?");
		thiefTeacher.setProfession(warriorTeacher.getProfession());
		System.out.println(warriorTeacher.identity());
		warriorTeacher.setProfession(null);
		warriorTeacher.teach();
		System.out.println(thiefTeacher.identity());
		System.out.println("Let's try it.");
		thiefTeacher.teach();
	}
}
