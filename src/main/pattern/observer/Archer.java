package main.pattern.observer;

import java.util.Random;

public class Archer implements IRiftAttacker
{
   private static final int MAX_SHOOTS_FOR_ATTACK = 3;

   IPlayerService service;

   public Archer(IPlayerService playerRiftService)
   {
      service = playerRiftService;
   }

   @Override
   public String getRole()
   {
      return ROLE_NAME + " - archer";
   }

   @Override
   public void performTurnAction()
   {
      attackRift();
   }

   @Override
   public void attackRift()
   {
      for (int i = 0; i < MAX_SHOOTS_FOR_ATTACK; i++)
      {
         if (service.getCurrentHealth() > 0)
         {
            service.attack(new Random().nextInt(5));
         }
      }
   }
}
