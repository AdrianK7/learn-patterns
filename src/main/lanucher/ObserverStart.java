package main.lanucher;

import main.pattern.observer.Archer;
import main.pattern.observer.Healer;
import main.pattern.observer.IRift;
import main.pattern.observer.IRiftKeeper;
import main.pattern.observer.Mage;
import main.pattern.observer.Rift;
import main.pattern.observer.RiftKeeper;
import main.pattern.observer.RiftMasterKeeper;
import main.pattern.observer.Warrior;

public class ObserverStart
{
   private static final int TURNS = 100;

   public static void main(String[] args)
   {
      IRift rift = new Rift();
      rift.joinTheStruggle(new Warrior(rift));
      rift.joinTheStruggle(new Mage(rift));
      rift.joinTheStruggle(new Archer(rift));
      rift.joinTheStruggle(new Healer(rift));
      IRiftKeeper masterKeeper = new RiftMasterKeeper();
      IRiftKeeper keeper = new RiftKeeper();
      rift.joinTheStruggle(masterKeeper);
      rift.joinTheStruggle(keeper);
      masterKeeper.startKeeperDuty(rift);
      keeper.startKeeperDuty(rift);

      for (int i = 0; i <= TURNS; i++)
      {
         rift.startNewTurn();
      }

   }
}
