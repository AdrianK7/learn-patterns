package main.pattern.observer;

import java.util.Random;

public class Mage implements IRiftAttacker
{
   IPlayerService service;

   public Mage(IPlayerService playerRiftService)
   {
      service = playerRiftService;
   }

   @Override
   public String getRole()
   {
      return ROLE_NAME  + " - mage";
   }

   @Override
   public void performTurnAction()
   {
      attackRift();
   }

   @Override
   public void attackRift()
   {
      if (service.getCurrentHealth() > 0)
      {
         service.attack(new Random().nextInt(15));
      }
      else
      {
         System.out.println("It's already dead");
      }
   }
}
