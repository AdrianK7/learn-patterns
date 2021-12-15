package main.pattern.observer;

public interface IRift extends IPlayerService, IKeeperService
{
   public enum RiftState
   {
      OPEN,
      CLOSED
   }

   public RiftState getRiftState();

   public int getCurrentHealth();
}
