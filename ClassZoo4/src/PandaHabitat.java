import java.awt.*;
import java.applet.*;
public class PandaHabitat extends Applet {

	public void paint (Graphics g)
	{
		drawHabitat(g);
		drawAnimal(g);
	}

	private void drawAnimal(Graphics g)
	{
	//Draws Head, Body, Ears
		
		//Draws Ears 
		g.setColor(new Color(32,32,32));
		
			g.fillOval(525, 275, 50, 50);
			g.fillOval(600, 275, 50, 50);
		
		//Draws Body/Head
		g.setColor(new Color(225,225,225));
		
			g.fillOval(500, 375, 175, 225);
			g.fillOval(525, 275, 125, 125);
		
		
	//Draws Eyes, Appendages, Nose
		
		//Draws Appendages
		g.setColor(new Color(32,32,32));
		
			g.fillOval(475, 525, 75, 75);
			g.fillOval(625, 525, 75, 75);
			g.fillOval(475, 425, 75, 75);
			g.fillOval(625, 425, 75, 75);
		
		//Draws Eyes
		
			g.fillOval(600, 315, 25, 25);
			g.fillOval(550, 315, 25, 25);
		
		//Draws Pupils
		g.setColor(Color.white);	
			
			g.fillOval(600, 315, 10, 10);
			g.fillOval(550, 315, 10, 10);
			
		//Draws Nose	
		g.setColor(new Color(32,32,32));
		
			g.fillOval(580, 350, 15, 15);
		
	}
	
	
	private void drawHabitat(Graphics g)
	{
	//Draws Sky
	g.setColor(new Color(134,207,242));
	
		g.fillRect(0, 0, 1000, 1000);
		
	g.setColor(Color.yellow);
	
		g.fillOval(800, 100, 100, 100);
		g.setColor(new Color(228,153,50));
		g.drawOval(800, 100, 100, 100);
		
	//Draws Earth
	g.setColor(new Color(66,173,50));
		
		g.fillRect(0, 600, 1000, 250);
		
	//Draws Bamboo
	g.setColor(new Color(117,185,49));
	
		g.fillRect(10, 300, 25, 300);
		g.fillRect(135, 300, 25, 300);
		g.fillRect(269, 300, 25, 300);
		g.fillRect(358, 300, 25, 300);
		g.fillRect(399, 300, 25, 300);
		g.fillRect(305, 300, 25, 300);
		g.fillRect(80, 300, 25, 300);
		g.fillRect(190, 300, 25, 300);
	}
	
	
}


