// Chapter 2 Question 15 (a)

/**
 * This program displays a red cross on a white
 * background.
 */



//JORDAN COOPER
 

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class RedCrossReal extends JPanel
{
  public void paintComponent(Graphics g)
  {
    super.paintComponent(g);  // Call JPanel's paintComponent method
                              //   to paint the background
    int xCenter = getWidth() / 2;
    int yCenter = getHeight() / 2;
    g.setColor(Color.RED);
    g.fillRect(92, 84, 10, 50);//sec numn = bot bar  (down)
    g.fillRect(97, 79, 50, 10);//first bumn = right bar (down)
    
    g.fillRect(92, 34, 10, 50);
    g.fillRect(46, 79, 50, 10);
    
   // g.fillRect(xCenter, yCenter, 90, 50);//first
  }
  
  public static void main(String[] args)
  {
    JFrame window = new JFrame("Red Cross");
    window.setBounds(300, 300, 200, 200);
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    RedCrossReal panel = new RedCrossReal();
    
    panel.setBackground(Color.WHITE);
    Container c = window.getContentPane();
    c.add(panel);
    window.setVisible(true);
    
  }
}
