public class Die
{
  private static int instanceCount = 0;
  private final int MAX = 6;
  private int dieValue;   
  private int rollCount = 0;
  
  public int rollDie() 
  {     
    dieValue = (int)(Math.random() * MAX) + 1; 
    rollCount++; 
    return dieValue; 
  
  }
  
  public int getRollCount()
  {
    return rollCount;
  }
  
}