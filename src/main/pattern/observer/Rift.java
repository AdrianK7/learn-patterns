package main.pattern.observer;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Rift implements IRift
{
   private final static int MAX_HEALTH = 100;

   private int health = MAX_HEALTH;

   private RiftState state = RiftState.OPEN;

   private Set<INpc> involved = new HashSet<>();

   private boolean hasKeaper = false;

   public String showRiftState()
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
      else if (RiftState.OPEN.equals(state))
      {
         System.out.println("Rift is still to strong to close!");
      }
   }

   public void open()
   {
      if (RiftState.CLOSED.equals(state) && health < MAX_HEALTH)
      {
         System.out.println("Rift still to week!");
      }
      else if (RiftState.CLOSED.equals(state))
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
      if (RiftState.OPEN.equals(state))
      {
         System.out.println("Attack dealt " + (attackValue > health ? health : attackValue) + " point of damage");
         health -= attackValue;
      }
      else
      {
         System.out.println("Did nothing!");
      }
   }

   public void healRift(int healValue)
   {
      if (health < MAX_HEALTH)
      {
         System.out
               .println("Healed " + (health + healValue > MAX_HEALTH ? MAX_HEALTH - health : healValue) + " points");
         health += healValue;
      }
      else
      {
         System.out.println("Did nothing!");
      }
   }

   @Override
   public void joinTheStruggle(INpc npc)
   {
      if (Objects.isNull(npc))
      {
         throw new IllegalStateException("REVEAL YOURSELF! COWARD!");
      }
      involved.add(npc);
   }

   @Override
   public void leaveTheStruggle(INpc npc)
   {
      if (Objects.isNull(npc))
      {
         throw new IllegalStateException("Why waste my time?");
      }
      involved.remove(npc);
   }

   @Override
   public void startNewTurn()
   {
      involved.forEach(npc -> {
         System.out.println(npc.getRole());
         npc.performTurnAction();
      });
   }

   @Override
   public boolean startKeeperDuty()
   {
      if (hasKeaper)
      {
         return false;
      }
      else
      {
         hasKeaper = true;
         return true;
      }
   }

   @Override
   public boolean stopKeeperDuty()
   {
      if (hasKeaper)
      {
         return false;
      }
      else
      {
         hasKeaper = false;
         return true;
      }
   }

   @Override
   public RiftState getRiftState()
   {
      return state;
   }
}
