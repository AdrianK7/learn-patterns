package test.pattern;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.pattern.strategy.ITeacher;
import main.pattern.strategy.Mage;
import main.pattern.strategy.MageProfession;
import main.pattern.strategy.Thief;
import main.pattern.strategy.ThiefProfession;
import main.pattern.strategy.Warrior;
import main.pattern.strategy.WarriorProfession;

public class StrategyTest {

	@Test
	public void testMage() {
		ITeacher mageTeacher = new Mage();
		assertEquals(mageTeacher.getSkills(), MageProfession.SKILL_EXAMPLE);
	}

	@Test
	public void testWarrior() {
		ITeacher warriorTeacher = new Warrior();
		assertEquals(warriorTeacher.getSkills(), WarriorProfession.SKILL_EXAMPLE);
	}

	@Test
	public void testThief() {
		ITeacher thiefTeacher = new Thief();
		assertEquals(thiefTeacher.getSkills(), ThiefProfession.SKILL_EXAMPLE);
	}

}
