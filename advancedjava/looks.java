import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class looks 
{
public static void main(String[] args)
{
UIManager.LookAndFeelInfo[] info =
UIManager.getInstalledLookAndFeels();
// array of LookAndFeelInfo objects
int i;
for (i = 0; i < info.length; i++)
{
System.out.println(info[i].getClassName());
// print just the path and class name
System.out.println(info[i]); // all info
}
}
}