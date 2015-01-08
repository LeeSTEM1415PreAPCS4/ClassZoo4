import java.awt.*;
import java.applet.*;

public class NarwhalHabitat extends Applet{
	
	public void paint(Graphics g)
	{
		drawAnimal(g);
	}

	private void drawAnimal(Graphics g)
	{
		
	}
	
	private void drawHabitat(Graphics g)
	{

		g.drawRect(10,10,800,800);
		g.drawOval(300,300,100,100);
		g.setColor(Color.white);

	}
}
