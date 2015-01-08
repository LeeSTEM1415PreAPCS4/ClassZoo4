import java.awt.*;
import java.applet.*;

public class NarwhalHabitat extends Applet{
	
	public void paint(Graphics g)
	{
		drawAnimal(g);
		drawHabitat(g);
	}

	private void drawAnimal(Graphics g)
	{
		
		g.setColor(new Color(109,141,145));
		g.fillArc(350,200,175,300,180,-135);
		//g.setColor(Color.black);
		g.fillArc(410,229,105,105,45,-155);
		g.drawPolygon()
	}
	
	private void drawHabitat(Graphics g)
	{
		g.setColor(Color.black);
		g.drawRect(10,10,800,700);
		g.fillOval(350,300,100,100);
		
	}
}
