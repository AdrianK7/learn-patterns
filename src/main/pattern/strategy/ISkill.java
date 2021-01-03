package main.pattern.strategy;

public interface ISkill {
	public String getSkillDescription();
	
	public boolean isTeachable();
	
	public void teachSkill();
}
