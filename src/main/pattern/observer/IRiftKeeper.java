package main.pattern.observer;

public interface IRiftKeeper extends INpc
{
   public static final String ROLE_NAME = "keeper";

   public void startKeeperDuty(IKeeperService service);
   
   public void stopKeeperDuty(IKeeperService service);
}
