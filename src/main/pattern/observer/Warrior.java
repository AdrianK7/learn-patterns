package main.pattern.observer;

import java.util.Random;

public class Warrior implements IRiftAttacker
{
   IPlayerService service;

   public Warrior(IPlayerService playerRiftService)
   {
      service = playerRiftService;
   }

   @Override
   public String getRole()
   {
      return ROLE_NAME + " - warrior";
   }

   @Override
   public void performTurnAction()
   {
      attackRift();
   }

   @Override
   public void attackRift()
   {
      if (service.getCurrentHealth() < 0)
      {
         System.out.println("*Dumb warrior still attacks*");
      }
      else
      {
         System.out.println("Smash!");
      }

      service.attack(new Random().nextInt(20));

   }
}
