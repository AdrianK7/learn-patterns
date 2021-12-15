package main.pattern.observer;

import main.pattern.observer.IRift.RiftState;

public class RiftMasterKeeper implements IRiftKeeper
{
   IKeeperService service;

   @Override
   public String getRole()
   {
      return ROLE_NAME + " - master rift keeper";
   }

   @Override
   public void performTurnAction()
   {
      if (service == null)
      {
         System.out.println("I'm no keeper. Why I received this information?!");
      }
      else if (service.getRiftState().equals(RiftState.CLOSED))
      {
         System.out.println("I'm master keeper of this Rift!");
         service.open();
      }
      else
      {
         System.out.println("I'm master keeper of this Rift!");
         service.close();
      }
   }

   @Override
   public void startKeeperDuty(IKeeperService service)
   {
      if (service.startKeeperDuty())
      {
         this.service = service;
         System.out.println("I became keeper of the Rift!");
      }
      else
      {
         System.out.println("No need for My service here.");
      }
   }

   @Override
   public void stopKeeperDuty(IKeeperService service)
   {
      if (service.stopKeeperDuty())
      {
         System.out.println("My watch end here");
         this.service = null;
      }
      else
      {
         System.out.println("I'm no keeper. Not here anyway.");
      }
   }
}
