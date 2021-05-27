package main.pattern.strategy;

import java.util.Objects;

public class Warrior implements ITeacher
{
   private IProfession profession = new WarriorProfession();

   @Override
   public void teach()
   {
      if (Objects.isNull(profession))
      {
         System.out.println("I don't know my profession!");
      }
      else
      {
         profession.teachProfession();
      }
   }

   @Override
   public String getSkills()
   {
      if (profession == null)
      {
         return null;
      }

      return profession.getSkill().getSkillDescription();
   }

   public IProfession getProfession()
   {
      return profession;
   }

   public void setProfession(IProfession profession)
   {
      this.profession = profession;
   }

   public void introduceYourself()
   {
      System.out.println("I'm a warrior!");
   }

   @Override
   public String identity()
   {
      return "WARRIOR";
   }

}
