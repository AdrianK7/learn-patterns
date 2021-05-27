package main.pattern.strategy;

import java.util.Objects;

public class Thief implements ITeacher
{
   private IProfession profession = new ThiefProfession();

   @Override
   public void teach()
   {
      if (Objects.isNull(profession))
      {
         System.out.println("Someone stole my profession!");
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
      System.out.println("You wanna die? Then don't ask stupid questions!");
   }

   @Override
   public String identity()
   {
      return "THIEF";
   }
}
