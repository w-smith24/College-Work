import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*; // for ChangeListener
public class jsex extends JFrame implements ChangeListener
{
  JSlider js = new JSlider(SwingConstants.HORIZONTAL, 0, 100, 0);
  Container c; // horizontal from 0 - 100 (start @ 0)
  int value = 0;
  public jsex()
  {
    super("Slider");
    js.setMajorTickSpacing(20); // tick marks every 20
    js.setPaintTicks(true); // see tick marks
    js.setPaintLabels(true); // see labels on tick marks
    c = getContentPane();
    c.setLayout(new BorderLayout());
    c.add(js);
    js.addChangeListener(this); // when change slider
  }
  public void stateChanged(ChangeEvent e)
  {
    value = js.getValue(); // get value from slider
    System.out.println("Value is " + value);
  }
  public static void main(String[] args)
  {
    jsex jsf = new jsex();
    jsf.setSize(250, 100);
    jsf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    jsf.setVisible(true);
  } }