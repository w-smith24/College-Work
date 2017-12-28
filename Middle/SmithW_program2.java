//Wayne Smith
//Ciss 111
//Craps Game with simulation and replay capability. Also includes random output for winning and losing

import java.util.*;
import javax.swing.*;

public class SmithW_program2 
{
  public static void main (String[] arg) 
  {       
    int die1, die2, total, roll2, maxRounds;//variables for die values and roll totals 
    String name, input;//string variables for name and user input    
    
    //Create 2 Die objects for the dice
    Die d1 = new Die();
    Die d2 = new Die();
    
    //prompt user for their name
    name = JOptionPane.showInputDialog("Please enter your name.");
    
    JOptionPane.showMessageDialog(null, 
                                  "Hey " + name + ", we're going to play a game of craps today", 
                                  "Greetings", 
                                  JOptionPane.INFORMATION_MESSAGE);
    do{
      
      //reinitialize the arrays for replaying rounds
      d1.clearDieArray();
      d2.clearDieArray();      
      
      //Ask user if they want to simulate the game
      input = JOptionPane.showInputDialog("Okay " + name + " would you like to simulate the game? Yes or No");    
      
      //Simulate the game////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
      if(input.equals("y") || input.equals("Y") || input.equals("yes") || input.equals("Yes"))
      {
        //prompt user for number of iterations
        input = JOptionPane.showInputDialog("Please enter the number of iterations you would like to do.");
        
        //these variables are only used if the user simulates the game//
        int i = Integer.parseInt(input);//iteration number     
        int w = 0;//variable for longest winning streak
        int l = 0;//variable for longest losing streak
        int losses = 0;//number of losses
        int wins = 0;//number of wins
        int winStreak = 0;//current winning streak
        int loseStreak = 0;//current losing streak
        
        //create 2 ArrayLists to store the winning and losing streaks
        ArrayList<Integer> wStreakArray = new ArrayList<Integer>();
        ArrayList<Integer> lStreakArray = new ArrayList<Integer>();
        
        //simulate the game for the number of iterations the user entered
        for(int x = 0; x < i; x++)
        {        
          die1 = d1.rollDie();
          die2 = d2.rollDie();
          total = die1 + die2;        
          
          if(total == 2 || total == 3 || total == 12)
          {          
            losses++;//increment number of losses
            wStreakArray.add(winStreak);//store the winning streak
            winStreak = 0;//reset the winning streak
            loseStreak++;//add to the current losing streak
            
          }
          else if(total == 7 || total == 11)
          {          
            wins++;//increment number of wins
            lStreakArray.add(loseStreak);//store the losing streak
            loseStreak = 0;//reset the losing streak
            winStreak++;//add to the current winning streak
            
          }       
        }
        
        w = wStreakArray.get(0);//initialize the longest winning streak variable
        l = lStreakArray.get(0);//initialize the longest losing streak variable
        
        //loop to fing the longest winning and losing streaks
        for(int x = 0; x < wStreakArray.size(); x++)
        {
          if(wStreakArray.get(x) > w)
            w = wStreakArray.get(x);
          if(lStreakArray.get(x) > l)
            l = lStreakArray.get(x);        
        }
        
        //output results from simulation
        JOptionPane.showMessageDialog(null,
                                      "You won " + wins + " times and lost " + losses + " times. Your longest winning streak was " + 
                                      w + " and your longest losing streak was " + l,
                                      "Greetings",
                                      JOptionPane.INFORMATION_MESSAGE);      
      }
      //Run game as normal///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
      else
      {
        
        die1 = d1.rollDie();
        die2 = d2.rollDie();
        total = die1 + die2;      
        
        if(total == 2 || total == 3 || total == 12)
        {
          //variable for driving random output
          int i = (int)(Math.random() * 3) + 1;
          
          //Random output for losing
          if(i == 1)
          {
            JOptionPane.showMessageDialog(null,
                                          name + " LOSER!",
                                          "Greetings",
                                          JOptionPane.INFORMATION_MESSAGE);
          }
          else if(i == 2)
          {
            JOptionPane.showMessageDialog(null,
                                          "Sorry " + name + " you've lost.",
                                          "Greetings",           
                                          JOptionPane.INFORMATION_MESSAGE);
          }
          else
          {
            JOptionPane.showMessageDialog(null,
                                          "Well " + name + ", Sometimes you win and sometimes you lose. I win and you LOST!.",
                                          "Greetings",           
                                          JOptionPane.INFORMATION_MESSAGE);
          }
        }
        else if(total == 7 || total == 11)
        {
          //variable for driving random output
          int i = (int)(Math.random() * 3) + 1;
          
          //Random output for winning
          if(i == 1)
          {
            JOptionPane.showMessageDialog(null,
                                          "Hey, " + name + " you're a winner!",
                                          "Greetings",
                                          JOptionPane.INFORMATION_MESSAGE);
          }
          else if(i == 2)
          {
            JOptionPane.showMessageDialog(null,
                                          "Way to go " + name + ", you've won.",
                                          "Greetings",           
                                          JOptionPane.INFORMATION_MESSAGE);
          }
          else
          {
            JOptionPane.showMessageDialog(null,
                                          "Yeah " + name + ", whatever, so you've won",
                                          "Greetings",           
                                          JOptionPane.INFORMATION_MESSAGE);
          }
        }
        else
        {
          //prompt user to roll again
          JOptionPane.showMessageDialog(null,
                                        "You Rolled a " + die1 + " and a " + die2 + " for a total of " + total + " " + name + " Roll Again",
                                        "Greetings",
                                        JOptionPane.INFORMATION_MESSAGE);
          
          die1 = d1.rollDie();
          die2 = d2.rollDie();
          roll2 = die1 + die2;
          
          //loops until the user loses
          while(roll2 != 7)
          {          
            //win
            if(total == roll2)
            {            
              //variable to drive random output
              int i = (int)(Math.random() * 3) + 1;
              //random output for winning
              if(i == 1)
              {
                JOptionPane.showMessageDialog(null,
                                              "Hey, " + name + " you're a winner!",
                                              "Greetings",
                                              JOptionPane.INFORMATION_MESSAGE);
              }
              else if(i == 2)
              {
                JOptionPane.showMessageDialog(null,
                                              "Way to go " + name + ", you've won.",
                                              "Greetings",           
                                              JOptionPane.INFORMATION_MESSAGE);
              }
              else
              {
                JOptionPane.showMessageDialog(null,
                                              "Yeah " + name + ", whatever, so your've won.",
                                              "Greetings",           
                                              JOptionPane.INFORMATION_MESSAGE);
              }
              
              break; 
            }
            //Roll Again
            else
            {
              
              JOptionPane.showMessageDialog(null,
                                            "You rolled a " + roll2 + " so roll again.",
                                            "Greetings",           
                                            JOptionPane.INFORMATION_MESSAGE); 
              
            }
            
            die1 = d1.rollDie();
            die2 = d2.rollDie();
            roll2 = die1 + die2;          
          }
          
          //lose
          if(roll2 == 7)
          {         
            int i = (int)(Math.random() * 3) + 1;
            //random output for losing
            if(i == 1)
            {
              JOptionPane.showMessageDialog(null,
                                            name + " LOSER!",
                                            "Greetings",
                                            JOptionPane.INFORMATION_MESSAGE);
            }
            else if(i == 2)
            {
              JOptionPane.showMessageDialog(null,
                                            "Sorry " + name + " you've lost.",
                                            "Greetings",           
                                            JOptionPane.INFORMATION_MESSAGE);
            }
            else
            {
              JOptionPane.showMessageDialog(null,
                                            "Well " + name + ", Sometimes you win and sometimes you lose. I win and you LOST!.",
                                            "Greetings",           
                                            JOptionPane.INFORMATION_MESSAGE);
            }  
          }                
        }      
      }
      
      //Ask the user if they want to replay any rounds////////////////////////////////////////////////////////////////////////////////////////////
      input = JOptionPane.showInputDialog("Okay " + name + " would you like to replay any rolls of the dice? Yes or No.");
      
      //loop until user doesn't want to replay a round
      while(input.equals("y") || input.equals("Y") || input.equals("yes") || input.equals("Yes"))
      {
        //prompt the user for the die they want replayed
        input = JOptionPane.showInputDialog("Okay " + name + " which die would you like to see? 1 or 2.");
        
        if(input.equals("1"))
        {
          maxRounds = d1.getMaxRounds()-1;//get max rounds
          //prompt the user for the round they want replayed for die 1
          input = JOptionPane.showInputDialog("Sounds Good. Which round would you like to replay? Enter a round from 0 to "+ maxRounds);
                    
          int r = Integer.parseInt(input);//convert user input to an int
          //test to see if the round entered is in the bounds of the array
          if(r <= maxRounds)
          {
            
            //output die value
            JOptionPane.showMessageDialog(null,
                                          "The value of that die was " + d1.replayDie(Integer.parseInt(input)),
                                          "Greetings",
                                          JOptionPane.INFORMATION_MESSAGE);
          }
          else
          {
            //Notify the user of the max number of rounds
            JOptionPane.showMessageDialog(null,
                                          "The max number of rounds is " + maxRounds + " please enter a round from 0 to " + maxRounds,
                                          "Greetings",
                                          JOptionPane.INFORMATION_MESSAGE);
          }
        }
        else if(input.equals("2"))
        {
          maxRounds = d1.getMaxRounds()-1;
          //prompt the user for the round they want replayed for die 2
          input = JOptionPane.showInputDialog("Sounds Good. Which round would you like to replay? Enter a round from 0 to "+ maxRounds);
                   
          int r = Integer.parseInt(input);//convert user inout to an int
          //test to see if the round entered is in the bounds of the array
          if(r <= maxRounds)
          {
            //output die value        
            JOptionPane.showMessageDialog(null,
                                          "The value of that die was " + d2.replayDie(Integer.parseInt(input)),
                                          "Greetings",
                                          JOptionPane.INFORMATION_MESSAGE);
          }
          else
          {
            //Notify the user of the max number of rounds
            JOptionPane.showMessageDialog(null,
                                          "The max number of rounds is " + maxRounds + " please enter a round from 0 to " + maxRounds,
                                          "Greetings",
                                          JOptionPane.INFORMATION_MESSAGE);
          }
        }
        else
        {
          //notify user they enetered an invalid die number
          JOptionPane.showMessageDialog(null,
                                        "Sorry there are only 2 dice in craps. You entered " + Integer.parseInt(input),
                                        "Greetings",
                                        JOptionPane.INFORMATION_MESSAGE);
        }
        //ask user if they want to continue
        input = JOptionPane.showInputDialog("Would you like to replay a different round? Yes or No");
        
      }
     //ask the user if they would like to play again
      input = JOptionPane.showInputDialog("Would you like to play again? Yes or No");
    }while(input.equals("y") || input.equals("Y") || input.equals("yes") || input.equals("Yes"));//test the input for playing again
    
    System.out.println(d1.getRollCount());//get roll count for die 1
    System.out.println(d2.getRollCount());//get roll count for die 2
    System.out.println(d2.getRollCount() + d1.getRollCount());//get the combined roll count for both dice    
  }  
}
