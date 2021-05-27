package main.pattern.observer;

public class RiftService implements IPlayerService, IKeeperService
{
   private final static int MAX_HEALTH = 100;

   private enum RiftState
   {
      OPEN,
      CLOSED
   }

   private int health = MAX_HEALTH;

   private RiftState state = RiftState.CLOSED;

   public String getState()
   {
      return state.name();
   }

   public int getCurrentHealth()
   {
      return health;
   }

   public void close()
   {
      if (health <= 0)
      {
         state = RiftState.CLOSED;
         System.out.println("Rift is closed");
      }
      else
      {
         System.out.println("Rift is still to strong to close!");
      }
   }

   public void open()
   {
      if (RiftState.CLOSED.equals(state))
      {
         state = RiftState.OPEN;
         System.out.println("Rift opened!");
      }
      else
      {
         System.out.println("Rift is still open!");
      }
   }

   public void attack(int attackValue)
   {
      health -= attackValue;
      System.out.println("Attack dealt " + attackValue + " point of damage");
   }

   public void healRift(int healValue)
   {
      System.out.println("Healed " + healValue + " points");
   }
}
