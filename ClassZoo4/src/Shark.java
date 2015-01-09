import java.awt.*;
import java.applet.*;

public class Shark extends Applet{
	
	public void paint(Graphics g)
	{
		drawHabitat(g);
		drawAnimal(g);
		
	}

	private void drawAnimal(Graphics g)
	{
		g.setColor(Color.decode("#15415E"));
		g.fillOval(200, 200, 300, 100);
		g.setColor(Color.decode("#15415E"));
		g.fillArc(200, 200, 350, 100, 20, 80);
		g.fillArc(160, 10, 390, 310, -30, -90);
		g.setColor(Color.white);
		g.fillOval(210, 200, 300, 120);
		g.setColor(Color.decode("#15415E"));
		g.fillOval(210, 200, 300, 110);
		g.fillArc(210, 250, 300, 200, 60, 60);
		g.fillOval(170, 180, 80, 150);
		g.setColor(Color.decode("#75C9FC"));
        g.fillArc(-60, 130, 270, 270, 45, -90);
	}
	
	private void drawHabitat(Graphics g)
	{
		
		g.setColor(Color.decode("#75C9FC"));
		g.fillRect(0, 0, 5000, 5000);
		
	
	}
}
