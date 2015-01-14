import java.awt.*;
import java.applet.*;
import java.util.Date;


public class JellyZoo extends Applet{
	public void paint(Graphics g)
	{
		
		drawAnimal(g);
		drawHabitat(g);
		
		doTheThing(g);
		
		
	}

	private void drawAnimal(Graphics g)
	{ 
		int x1 = 500;
		int y1 = 300;
		Color noodle = new Color (173,58,250);
		g.setColor(noodle);
		//making sure people know that i am the best jellyfish of all
		g.drawString("nyoom nyoom im a jelly fish imma sting u because i am king, the king jellyfish, the best of all jelly", 150, 450);
		//legs and or tentacle things those things are weird
		g.drawRect(x1+340, y1+30,  100, 1);
		g.drawRect(x1+440, y1+32,  100, 1);
		g.drawRect(x1+300, y1+50,  100, 1);
		g.drawRect(x1+400, y1+50,  1,  20);
		g.drawRect(x1+400, y1+70,  100, 1);
		g.drawRect(x1+225, y1+90,  100, 1);
		g.drawRect(x1+325, y1+80,  1,  10);
		g.drawRect(x1+325, y1+80,  50,  1);
		g.drawRect(x1+180, y1+111, 100, 1);
		g.drawRect(x1+280, y1+114, 100, 1);
		
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
	    
	    //crown
	    Color crown = new Color (245, 215, 107);
	    g.setColor(crown);
	    g.fillArc(505, 318, 110, 180, 115, 40);
	    g.setColor(Color.red);
	    g.fillRect(520, 358, 20, 10);
	    g.setColor(Color.WHITE);
	    g.fillRect(523,360, 8, 4);
	    
	    
}
	private void run(Graphics g, int x1)
	{
		while (true) {
			//move legs left then right
		       repaint();
		      try { Thread.sleep(400); }
		       catch (InterruptedException e) { }
		     }
	}
	
	public void doTheThing(Graphics g)
	{
		
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
			
	//Jelly Jar
			g.fillRoundRect(650, 600, 100, 150, 20, 15);
			g.setColor(Color.RED);
			g.fillRect(650,625,100,50);
			g.setColor(Color.WHITE);
			g.drawString("Supreme Jelly", 660, 655);
			Color Jelly = new Color (132, 7, 4);
			g.setColor(Jelly);
			g.fillRect(651,680,99,65);
			
			
	
			
			
		
	}
}
