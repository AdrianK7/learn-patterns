package main.pattern.observer;

import main.pattern.observer.IRift.RiftState;

public interface IKeeperService extends IRiftInvolvement
{
   public String showRiftState();

   public RiftState getRiftState();

   public int getCurrentHealth();

   public void close();

   public void open();

   public boolean startKeeperDuty();

   public boolean stopKeeperDuty();
}
