package main.pattern.strategy;

import java.util.Objects;

public class Thief implements ITeacher, INpc {
	private IProfession profession = new ThiefProfession();

	@Override
	public void teach() {
		if (Objects.isNull(profession)) {
			System.out.println("I don't know my profession!");
		} else {
			profession.teachProfession();
		}
	}

	@Override
	public String getSkills() {
		if (profession == null) {
			return null;
		}

		return profession.getSkill().getSkillDescription();
	}

	public void introduceYourself() {
		System.out.println("You wanna die? Then don't ask stupid questions!");
	}
}
