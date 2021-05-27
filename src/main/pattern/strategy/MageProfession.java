package main.pattern.strategy;

import java.util.Objects;

public class MageProfession implements IProfession
{

   public static final String SKILL_EXAMPLE = "FIREBALL";

   private ISkill skill = new Fireball();

   @Override
   public ISkill getSkill()
   {
      return skill;
   }

   @Override
   public void teachProfession()
   {
      if (Objects.isNull(skill) || !skill.isTeachable())
      {
         System.out.println("Can't teach anything! Find another master.");
      }
      else
      {
         skill.teachSkill();
      }
   }

}
