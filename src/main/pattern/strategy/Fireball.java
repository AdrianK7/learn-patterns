package main.pattern.strategy;

public class Fireball implements ISkill
{

   @Override
   public String getSkillDescription()
   {
      return MageProfession.SKILL_EXAMPLE;
   }

   @Override
   public boolean isTeachable()
   {
      return true;
   }

   @Override
   public void teachSkill()
   {
      System.out.println("To cast fireball you need to...");
   }
}
