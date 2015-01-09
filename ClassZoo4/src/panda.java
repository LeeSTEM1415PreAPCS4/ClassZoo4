import java.awt.*;
import java.applet.*;

public class panda extends Applet{
	
	public void paint(Graphics g)
	{
		drawAnimal(g);
		drawHabitat(g);
	}

	private void drawAnimal(Graphics g)
	{
	g.drawOval(0,300,235,150);
	g.drawOval(0,200,80,120);
	g.drawOval(150,200,70,120);
	
		
	}
	
	private void drawHabitat(Graphics g)
	{
		g.setColor(new Color(57,145,251));
		g.drawRect(0,0,1800,221);
		g.fillRect(0, 0, 1800, 221);
	
		
		
	}
}
