import java.awt.*;
import java.applet.*;


public class JellyZoo {
	public void paint(Graphics g)
	{
		drawAnimal(g);
		drawHabitat(g);
	}

	private void drawAnimal(Graphics g)
	{
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
	    //legs
}
	
	private void drawHabitat(Graphics g)
	{
	//water
		Color ocean = new Color (18, 38, 107);
			setBackground(ocean);
	//bubbles
		g.setColor(Color.WHITE);
			g.fillOval(30, 50, 20, 20);
			g.fillOval(1000, 50, 20, 20);
			g.fillOval(1300, 600, 20, 20);
			g.fillOval(300, 400, 20, 20);
			g.fillOval(100, 300, 20, 20);
			g.fillOval(400, 200, 20, 20);
			g.fillOval(1200, 200, 100, 100);
		
	}
}
