package main.pattern.observer;

public interface IKeeperService
{
   public String getState();

   public int getCurrentHealth();

   public void close();

   public void open();
}
