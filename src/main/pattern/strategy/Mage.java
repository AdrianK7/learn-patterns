package main.pattern.strategy;

import java.util.Objects;

public class Mage implements ITeacher
{
   private IProfession profession = new MageProfession();

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
      System.out.println("I'm a master of arcane arts!");
   }

   @Override
   public String identity()
   {
      return "MAGE";
   }

}
