import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.GradientPaint;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;
//Jose Espinoza 
//Period:4
  public class Penguin {
	  JFrame frame;

	  DrawPanel drawPanel;

	  private int oneX = 1;
      private int oneY = 1;

	  boolean up = false;
	  boolean down = true;
	  boolean left = false;
	  boolean right = true;
	 
	  public static void main(String... arg)
	  {  new Penguin().go();      
	                          }
	  private void go()

	  {
		  frame = new JFrame("Test");
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     
       drawPanel = new DrawPanel();

       frame.getContentPane().add(BorderLayout.CENTER, drawPanel);

       frame.setResizable(false);
       frame.setSize(800, 600);
       frame.setLocationByPlatform(true);

       frame.setVisible(true);

       moveIt(); }
	  
	  class DrawPanel extends JPanel
	  {
	 private static final long serialVersionUID = 1L;
	
	 public void paintComponent(Graphics g)
	  { 	  
		 Graphics2D g2d = (Graphics2D) g;
		 
	//Gradient would be gray and black
		 GradientPaint gp1 = new GradientPaint(10, 5,
                 Color.gray, 30, 20, Color.black, true);
		 
		 //drawing the sky 
		 g.setColor(new Color(130,199,236));    		
	   	g.fillRect(0, 0, 800,220);
		 // drawing body
         g2d.setPaint(gp1);
        g.fillOval(90+oneX, 100+oneY, 120, 125);
         g.setColor(Color.black);
         g.fillOval(100+oneX,50+oneY,100,100);
         g.fillOval(100+oneX,100+oneY,100,125);
         g.fillOval(125+oneX,80+oneY,15,15);
     	g.fillOval(160+oneX,80+oneY,15,15);
         // drawing both eyes and part of the body 
     	g.setColor(Color.white);
          g.fillOval(125+oneX,80+oneY,15,15);
          g.fillOval(112+oneX,114+oneY,75,90);
      	g.fillOval(160+oneX,80+oneY,15,15);
      	//drawing eyeballs
      	  g.setColor(Color.black);
            g.fillOval(130+oneX,85+oneY,5,5);
        	g.fillOval(165+oneX,85+oneY,5,5);
       //drawing Nose and feet
        	g.setColor(Color.orange);
         g.fillArc(125+oneX,88+oneY, 50, 50, 190, 160);
         g.fillOval(90+oneX, 210+oneY, 60, 20);
         g.fillOval(150+oneX, 210+oneY, 60, 20);
	  }
	  }
	  private void moveIt()
	  {
		  while (true)
		  {
		  if (oneX >=500)
		  {
		  right = false;
		  left = true;
		  }
		  if (oneX <= 7)
		 {
		  right = true;
		  left = false;
		  }
		  if (oneY >= 259)
		  {up = true;

          down = false;
          }
         if (oneY <= 7)
       {
         up = false;
         down = true;
         }
      if (up) oneY--;
      if (down) oneY++;
     if (left) oneX--;
      if (right) oneX++;
     try
     {
    	 Thread.sleep(20);
    	 }
    	 catch (Exception e)
    	 {
    	 e.printStackTrace();
    	 }
    	 frame.repaint();
		  }}}