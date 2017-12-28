import java.util.*;
import javax.swing.*;

public class p3 
{
    
  public static void main (String[] arg) 
  {
    
    int diameter, height;
    double radius;
    double circumference, areaOfCircle, cylVolume;
    String name, input, output;
    final double PI = 3.1415926;
    
    name = JOptionPane.showInputDialog("Please enter your name.");
    
    JOptionPane.showMessageDialog(null, 
      "Hey " + name + ", we're going to do some geometry today aren't you excited?", 
      "Greetings", 
      JOptionPane.INFORMATION_MESSAGE);
          
    input = JOptionPane.showInputDialog("Please tell me the diameter of a cylinder as an integer");
    diameter = Integer.parseInt(input);
    
    input = JOptionPane.showInputDialog("Thank you now can you tell me the height of the cylinder as an integer?");
    height = Integer.parseInt(input);
    
    radius = diameter/2.0;    
    circumference = PI * diameter;
    areaOfCircle = PI * Math.pow(radius,2);
    cylVolume = areaOfCircle * height;
    
    output = String.format("The radius is %.1f.%n", radius) 
      + String.format("The diameter is %d.%n", diameter) 
      + String.format("The height is %d.%n", height)
      + String.format("The circumference is %.6f.%n", circumference)
      + String.format("The area of the base is %.8f.%n", areaOfCircle)
      + String.format("The volume of the cylinder is %.5f.%n", cylVolume);
    
    JOptionPane.showMessageDialog(null, 
      output, 
      "Results.", 
      JOptionPane.INFORMATION_MESSAGE);
      
  }
  
}