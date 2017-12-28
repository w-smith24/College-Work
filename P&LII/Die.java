//Wayne Smith
//Ciss 111
//Die Class

import java.util.*;

public class Die
{
  
  private int dieValue;   
  private int rollCount = 0;
  private ArrayList<Integer> dieValuesArray = new ArrayList<Integer>();//ArrayList to hold die values for replay
  
  //method to roll the die
  public int rollDie() 
  {     
    dieValue = (int)(Math.random() * 6) + 1;//assigns dieValue a random number between 1 and 6
    dieValuesArray.add(dieValue);//add the cuurent dieValue to the Arraylist for replay feature
    rollCount++;//increment roll count
    return dieValue; 
  
  }
  
  //method to retrieve the roll count of the die
  public int getRollCount()
  {
    return rollCount;
  }
  
  //method to replay the die in a certain round
  public int replayDie(int x)
  {
    return dieValuesArray.get(x);
  }
  
  //method to retrieve the number of rolls played
  public int getMaxRounds()
  {
    return dieValuesArray.size();
  }
  
  //method to clear the array after a game has ended
  public void clearDieArray()
  {
    dieValuesArray.clear();
  }
  
}