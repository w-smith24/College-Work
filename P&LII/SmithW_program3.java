//Wayne Smith
//Ciss 111
//Coding Project 3 Demonstrates inheritance using AirTimeLog, SongLog and AdLog

import java.util.*;
import javax.swing.*;

public class SmithW_program3
{
  public static void main (String[] args) 
  {     
    //Generate 3 SongLogs and 3 AdLogs with prefilled data
    SongLog sLog1 = new SongLog("123abc","Another One Bites the Dust","Queen");
    SongLog sLog2 = new SongLog("456def","Stairway to Heaven","Led Zeppelin");
    SongLog sLog3 = new SongLog("789ghi","Freebird","Lynyrd Skynyrd");
    AdLog aLog1 = new AdLog("jkl012","345mno");
    AdLog aLog2 = new AdLog("pqr678","stu901");
    AdLog aLog3 = new AdLog("vwx234","yza567");
        
    //Display SongLog toString()
    JOptionPane.showMessageDialog(null, "               sLog1" + sLog1);
    JOptionPane.showMessageDialog(null, "               sLog2" + sLog2);
    JOptionPane.showMessageDialog(null, "               sLog3" + sLog3);
    //Display AdLog toString()
    JOptionPane.showMessageDialog(null, "               aLog1" + aLog1);
    JOptionPane.showMessageDialog(null, "               aLog2" + aLog2);
    JOptionPane.showMessageDialog(null, "               aLog3" + aLog3);
    
    //Demonstrate instanceof    
    if(sLog1 instanceof AirTimeLog)
      JOptionPane.showMessageDialog(null, "Yes sLog1 is an instance of AirTimeLog");
    if(aLog1 instanceof AirTimeLog)
      JOptionPane.showMessageDialog(null, "Yes aLog1 is an instance of AirTimeLog");
    
  }
}