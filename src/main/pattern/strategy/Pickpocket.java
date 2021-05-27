package main.pattern.strategy;

public class Pickpocket implements ISkill {
	@Override
	public String getSkillDescription() {
		return ThiefProfession.SKILL_EXAMPLE;
	}

	@Override
	public boolean isTeachable() {
		return true;
	}

	@Override
	public void teachSkill() {
		System.out.println("To pickpocket someone you first must...");
	}
}
