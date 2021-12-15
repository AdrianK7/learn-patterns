package main.pattern.observer;

public interface IRiftInvolvement
{
   public void joinTheStruggle(INpc npc);

   public void leaveTheStruggle(INpc npc);

   public void startNewTurn();
}
