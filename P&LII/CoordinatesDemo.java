
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Point;
import java.awt.event.MouseEvent;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.event.MouseInputListener;

public class CoordinatesDemo {
  private JLabel label;

  private Point clickPoint, cursorPoint;

  private void buildUI(Container container) {
    container.setLayout(new BoxLayout(container, BoxLayout.PAGE_AXIS));

    CoordinateArea coordinateArea = new CoordinateArea(this);
    container.add(coordinateArea);

    label = new JLabel();
    resetLabel();
    container.add(label);

    coordinateArea.setAlignmentX(Component.LEFT_ALIGNMENT);
    label.setAlignmentX(Component.LEFT_ALIGNMENT); // redundant
  }

  public void updateCursorLocation(int x, int y) {
    if (x < 0 || y < 0) {
      cursorPoint = null;
      updateLabel();
      return;
    }

    if (cursorPoint == null) {
      cursorPoint = new Point();
    }

    cursorPoint.x = x;
    cursorPoint.y = y;
    updateLabel();
  }

  public void updateClickPoint(Point p) {
    clickPoint = p;
    updateLabel();
  }

  public void resetLabel() {
    cursorPoint = null;
    updateLabel();
  }

  protected void updateLabel() {
    String text = "";

    if ((clickPoint == null) && (cursorPoint == null)) {
      text = "Click or move the cursor within the framed area.";
    } else {

      if (clickPoint != null) {
        text += "The last click was at (" + clickPoint.x + ", " + clickPoint.y + "). ";
      }

      if (cursorPoint != null) {
        text += "The cursor is at (" + cursorPoint.x + ", " + cursorPoint.y + "). ";
      }
    }

    label.setText(text);
  }

  public static void main(String[] args) {
    JFrame frame = new JFrame("CoordinatesDemo");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    CoordinatesDemo controller = new CoordinatesDemo();
    controller.buildUI(frame.getContentPane());

    frame.pack();
    frame.setVisible(true);
  }

  public static class CoordinateArea extends JComponent implements MouseInputListener {
    Point point = null;

    CoordinatesDemo controller;

    Dimension preferredSize = new Dimension(400, 75);

    Color gridColor;

    public CoordinateArea(CoordinatesDemo controller) {
      this.controller = controller;

      // Add a border of 5 pixels at the left and bottom,
      // and 1 pixel at the top and right.
      setBorder(BorderFactory.createMatteBorder(1, 5, 5, 1, Color.RED));

      addMouseListener(this);
      addMouseMotionListener(this);
      setBackground(Color.WHITE);
      setOpaque(true);
    }

    public Dimension getPreferredSize() {
      return preferredSize;
    }

    protected void paintComponent(Graphics g) {
      // Paint background if we're opaque.
      if (isOpaque()) {
        g.setColor(getBackground());
        g.fillRect(0, 0, getWidth(), getHeight());
      }

      // Paint 20x20 grid.
      g.setColor(Color.GRAY);
      drawGrid(g, 20);

      // If user has chosen a point, paint a small dot on top.
      if (point != null) {
        g.setColor(getForeground());
        g.fillRect(point.x - 3, point.y - 3, 7, 7);
      }
    }

    // Draws a 20x20 grid using the current color.
    private void drawGrid(Graphics g, int gridSpace) {
      Insets insets = getInsets();
      int firstX = insets.left;
      int firstY = insets.top;
      int lastX = getWidth() - insets.right;
      int lastY = getHeight() - insets.bottom;

      // Draw vertical lines.
      int x = firstX;
      while (x < lastX) {
        g.drawLine(x, firstY, x, lastY);
        x += gridSpace;
      }

      // Draw horizontal lines.
      int y = firstY;
      while (y < lastY) {
        g.drawLine(firstX, y, lastX, y);
        y += gridSpace;
      }
    }

    // Methods required by the MouseInputListener interface.
    public void mouseClicked(MouseEvent e) {
      int x = e.getX();
      int y = e.getY();
      if (point == null) {
        point = new Point(x, y);
      } else {
        point.x = x;
        point.y = y;
      }
      controller.updateClickPoint(point);
      repaint();
    }

    public void mouseMoved(MouseEvent e) {
      controller.updateCursorLocation(e.getX(), e.getY());
    }

    public void mouseExited(MouseEvent e) {
      controller.resetLabel();
    }

    public void mouseReleased(MouseEvent e) {
    }

    public void mouseEntered(MouseEvent e) {
    }

    public void mousePressed(MouseEvent e) {
    }

    public void mouseDragged(MouseEvent e) {
    }
  }
}