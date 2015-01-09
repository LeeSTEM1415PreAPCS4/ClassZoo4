import java.awt.*;
import java.applet.*;


public class JellyZoo extends Applet{
	public void paint(Graphics g)
	{
		
		drawAnimal(g);
		drawHabitat(g);
	}

	private void drawAnimal(Graphics g)
	{   //legs and or tentacle things those things are weird
		Color noodle = new Color (173,58,250);
		g.setColor(noodle);
		g.drawString("nyoom nyoom im a jelly fish imma sting u", 290, 450);
		g.drawRect(840, 330, 100, 1);
		g.drawRect(940, 332, 100, 1);
		g.drawRect(800,350,100,1);
		g.drawRect(900,350,1,20);
		g.drawRect(900,370,100,1);
		g.drawRect(725, 390, 100, 1);
		g.drawRect(825, 380, 1, 10);
		g.drawRect(825, 380, 50, 1);
		g.drawRect(680, 411, 100, 1);
		g.drawRect(780, 413, 100, 1);
		
		//body
		Color base = new Color (217, 80, 254);
		Color highlight = new Color (249, 143, 251);
	   	g.setColor(base);
	    g.fillArc(505, 305, 520, 120, 65, 180);
	    g.setColor(highlight);
	    g.fillOval(560, 330, 50, 5);
	    g.fillOval(600, 400, 60, 10);
	    g.fillOval(700, 330, 45, 15);
	    //highlight the highlight
	    g.setColor(Color.WHITE);
	    g.fillOval(560, 330, 40, 3);
	    g.fillOval(600, 400, 50, 5);
	    g.fillOval(700, 330, 35, 6);
	  
	    
}
	
	private void drawHabitat(Graphics g)
	{
	//water
		Color ocean = new Color (18, 38, 107);
		setBackground(ocean);
		
	//bubbles
		g.setColor(Color.WHITE);
			g.fillOval(970, 500, 20, 20);
			g.fillOval(1000, 600, 20, 20);
			g.fillOval(1180, 560, 20, 20);
			g.fillOval(1050, 400, 20, 20);
			g.fillOval(1060, 300, 20, 20);
			g.fillOval(1100, 200, 20, 20);
			g.fillOval(1200, 400, 100, 100);
		
	}
}
