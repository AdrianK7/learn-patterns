package main.pattern.observer;

import java.util.Random;

public class Healer implements IRiftDefender
{
   IPlayerService service;

   public Healer(IPlayerService service)
   {
      this.service = service;
   }

   @Override
   public String getRole()
   {
      return ROLE_NAME  + " - healer";
   }

   @Override
   public void performTurnAction()
   {
      healRift();
   }

   @Override
   public void healRift()
   {
      service.healRift(new Random().nextInt(10));
   }
}
