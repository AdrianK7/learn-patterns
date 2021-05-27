package main.pattern.strategy;

import java.util.Objects;

public class ThiefProfession implements IProfession {

	public static final String SKILL_EXAMPLE = "Pickpocket";

	private ISkill skill = new Pickpocket();

	@Override
	public ISkill getSkill() {
		return skill;
	}

	@Override
	public void teachProfession() {
		if (Objects.isNull(skill) || !skill.isTeachable()) {
			System.out.println("Can't teach anything! Go be thief somewhere else!");
		} else {
			skill.teachSkill();
		}
	}

}
