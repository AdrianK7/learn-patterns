package main.pattern.strategy;

import java.util.Objects;

public class WarriorProfession implements IProfession {

	public static final String SKILL_EXAMPLE = "Slash";

	private ISkill skill = new Slash();

	@Override
	public ISkill getSkill() {
		return skill;
	}
	
	@Override
	public void teachProfession() {
		if (Objects.isNull(skill) || !skill.isTeachable()) {
			System.out.println("Can't teach anything!");
		} else {
			skill.teachSkill();
		}
	}

}
