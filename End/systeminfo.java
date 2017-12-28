import java.awt.*;
import java.awt.event.*;
public class systeminfo
{
  public static void main(String[] args)
  {
    int i;
    GraphicsEnvironment allfonts =
      GraphicsEnvironment.getLocalGraphicsEnvironment();
// get a GraphicsEnvironment object
    Font[] myfonts = allfonts.getAllFonts();
    /* get all information about fonts - returns an array of Font objects */
    String[] fontnames =
      allfonts.getAvailableFontFamilyNames();
    /* get font family names - returns an array of String objects */
    for (i = 0; i < fontnames.length; i++)
      System.out.println(fontnames[i]);
// print all font family name strings
    System.out.println(myfonts.length + " Total Fonts");
    System.out.println(fontnames.length + " Font Families");
    Toolkit tk = Toolkit.getDefaultToolkit();
// get a Toolkit object
    Dimension sd = tk.getScreenSize(); 
    /* returns Dimension object that has width and height String data fields that tells size */
    System.out.println("Screen Resolution is " +
                       tk.getScreenResolution() + " dots per inch");
    System.out.println("Width is " + sd.width + " pixels");
    System.out.println("Height is " + sd.height + " pixels");
  }
}