import java.awt.*;
import java.applet.*;
public class penguin extends Applet {

	public void paint(Graphics g)
	{	
		drawHabitat(g);
		drawAnimal(g);
	
	}

	private void drawAnimal(Graphics g)
	{ 	
		
	
		  g.setColor(new Color(59,59,59)); 
		  g.fillOval(90,100,120,125);
		  g.setColor(Color.black);
	g.fillOval(100,50,100,100);
	g.fillOval(100,100,100,125);
	g.setColor(Color.white);
	g.fillOval(112,114,75,90);
	g.fillOval(115,60,70,80);

	g.setColor(Color.black);
	g.fillOval(125,80,15,15);
	g.fillOval(160,80,15,15);

	g.setColor(Color.orange);
	
	g.drawLine (140, 110, 160, 110);
    g.drawLine (140, 110, 150, 140);
    g.drawLine (150, 140, 160, 110);

    g.fillOval(90, 210, 60, 20);
    g.fillOval(150, 210, 60, 20);
   
    
	}
	
	private void drawHabitat(Graphics g)
	{
		g.setColor(new Color(57,145,251)); 
		g.drawRect(0, 0,800,  220);
		  g.fillRect(0, 0, 800, 220);   
	}
}