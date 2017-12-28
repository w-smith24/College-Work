/*Wayne Smith
 *CISS111
 *Program 7 GUI That changes the color of fields based on the mouse movements and clicks*/

import java.util.*;
import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*;
import java.awt.Color;

public class SmithW_program7 extends JFrame 
{ 
  private JPanel fieldPanel, drawingPanel; 
  private JTextField[] mouseStates;
  private String[] text = {"Mouse Pressed", "Mouse Clicked", "Mouse Released", "Mouse Entered", "Mouse Exited", "Mouse Dragged", "Mouse X Position:", "Mouse Y Position:"};
  Color color;
  
  public SmithW_program7()
  {     
    //Create a drawing panel to move the mouse around in
    drawingPanel = new JPanel();
    drawingPanel.setLayout(new FlowLayout());
    drawingPanel.setBackground(Color.white);
    drawingPanel.setPreferredSize(new Dimension(600,600));
    
    setLayout(new FlowLayout());
    //Array of JTextFields to hold all the events
    mouseStates = new JTextField[8];
    //Create the JTextFields with text and a default shading of light gray
    for(int i = 0; i < mouseStates.length; i++)
    {
      mouseStates[i] = new JTextField(text[i], 20);
      mouseStates[i].setEditable(false);
      mouseStates[i].setBackground(Color.lightGray);
      add(mouseStates[i]);
    }
    //Add the drawing panel to the JFrame
    add(drawingPanel);
    setTitle("Mouse Button Tracker"); 
    setSize(500,500); 
    setDefaultCloseOperation(EXIT_ON_CLOSE); 
    //Display the color chooser for the user to select a color before making the frame visible  
    color = JColorChooser.showDialog(null, "Select a color to fill the fields" , new Color(139,69,19));
    setVisible(true); 


    //Add the listeners to the drawing panel
    drawingPanel.addMouseListener(new MyMouseListener());
    drawingPanel.addMouseMotionListener(new MyMouseMotionListener());
  }
  /*Method to reset all the backgrounds of the JTextFields to light gray*/
  public void clearTextFields()
  {
    for(int i = 0; i < 6; i++)
      mouseStates[i].setBackground(Color.lightGray);
  }  
  /*Listener for mouse clicks--will change the background 
   *color of the corresponding mouse event to color chosen by user*/
  private class MyMouseListener implements MouseListener
  {
    public void mousePressed(MouseEvent e)
    {     
      clearTextFields();
      mouseStates[0].setBackground(color);      
    }
    
    public void mouseClicked(MouseEvent e)
    {
      mouseStates[1].setBackground(color);
    }
    
    public void mouseReleased(MouseEvent e)
    {
      clearTextFields();
      mouseStates[2].setBackground(color);
    }
    
    public void mouseEntered(MouseEvent e)
    {
      clearTextFields();
      mouseStates[3].setBackground(color);
    }
    
    public void mouseExited(MouseEvent e)
    {
      clearTextFields();
      mouseStates[4].setBackground(color);
    }
  }
  /*Listener for mouse movements*/
  private class MyMouseMotionListener implements MouseMotionListener
  {
    public void mouseDragged(MouseEvent e)
    {
      clearTextFields();
      mouseStates[5].setBackground(color);
    }
    
    public void mouseMoved(MouseEvent e)
    {
      mouseStates[6].setText("X: " + e.getX());
      mouseStates[7].setText("Y: " + e.getY());
    }
  }
  
  
  /*Main Method*/
  public static void main(String[] args) 
  { 
    SmithW_program7 window = new SmithW_program7(); 
  } 
}