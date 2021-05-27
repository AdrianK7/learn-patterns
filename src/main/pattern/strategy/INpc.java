package main.pattern.strategy;

public interface INpc
{
   public void introduceYourself();

   public void setProfession(IProfession profession);

   public IProfession getProfession();

   public String identity();
}
