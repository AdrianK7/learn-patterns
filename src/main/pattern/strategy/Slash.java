package main.pattern.strategy;

public class Slash implements ISkill {
	@Override
	public String getSkillDescription() {
		return WarriorProfession.SKILL_EXAMPLE;
	}

	@Override
	public boolean isTeachable() {
		return true;
	}

	@Override
	public void teachSkill() {
		System.out.println("Just hit them very hard in the head!");
	}
}
