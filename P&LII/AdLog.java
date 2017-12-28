//Wayne Smith
//Ciss 111
//AdLog subclass

import java.util.*;

public class AdLog extends AirTimeLog
{
  private String adId, advId;
  
  //Constructor for AdLog that sets the adId and advId
  public AdLog(String adId, String advId)
  {    
    this.adId = adId;
    this.advId = advId;
  }
 
  //toString Method for AdLog
  @Override
  public String toString()
  {
    return "\nAdvertisement ID: " + adId + "\nAdvertiser ID: " + advId + "\nTimestamp: " + getTime();
  }
}