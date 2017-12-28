//Wayne Smith
//Ciss 111
//AirTimeLog superclass

import java.util.*;
import java.text.*;

public class AirTimeLog
{    
 
  //Method to get and return the current time in the format of month/day/year hour:minutes:seconds am/pm
  public String getTime() 
  {
    DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss a");
    Date date = new Date();
    
    return dateFormat.format(date);    
  }
  
}

