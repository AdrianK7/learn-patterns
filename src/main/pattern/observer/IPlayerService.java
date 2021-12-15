package main.pattern.observer;

public interface IPlayerService extends IRiftInvolvement
{
   public String showRiftState();

   public int getCurrentHealth();
   
   public void attack(int attackValue);

   public void healRift(int healValue);
}
