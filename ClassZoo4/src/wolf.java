//Mr. Poore
//Wolf <howl>
import java.awt.*;
import java.applet.*;

public class wolf extends Applet{
	
	public void paint(Graphics g)
	{
		drawAnimal(g);
		drawHabitat(g);
	}

	private void drawAnimal(Graphics g)
	{
		
	}
	
	private void drawHabitat(Graphics g)
	{
		//draw the sky
		g.setColor(new Color(100, 150, 255));
		g.fillRect(0, 0, getWidth(), (int) (getHeight() * .65));
		
		//draw the ground
		g.setColor(new Color(100, 150, 255));
		g.fillRect(0, (int) (getHeight() * .65), getWidth(), (int)(getHeight() - (getHeight() * .65)));
		
	}
}
