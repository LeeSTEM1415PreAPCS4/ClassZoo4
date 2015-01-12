import java.awt.*;
import java.applet.*;
public class koala extends Applet
{
	public void paint (Graphics g)
		{
			Color grass = new Color(128,155,94);
			Color sky = new Color(140,255,255);
			Color sun = new Color(255,255,72);
			Color koala = new Color(160,160,160);
			Color lips = new Color(255,185,220);
			Color trunk = new Color(140,98,0);
			Polygon w = new Polygon ();
			Polygon m = new Polygon ();
			
			
			g.setColor(grass);
			g.fillRect(0, 600, 1500, 200);
			g.setColor(sky);
			g.fillRect(0, 0, 1500, 600);
			g.setColor(sun);
			g.fillOval(1300, 25, 150, 150);
		
			//////TREE//////
			//trunk
			for (int t = 20; t <=1200; t = t+125)
		{
			g.setColor(trunk);
			g.fillRect(t, 0, 25, 700);
		}
			
			//leaves 2
		for (int q = 0; q<= 6000; q++)
		{
			int x = (int)(Math.random()*getWidth()-375);
			int y = (int)(Math.random()*getHeight()-300);
			drawLeaf2(x, y, g);
		}
			
			//////BODY//////
			//body
			g.setColor(koala);
			g.fillOval(440, 340, 80, 135);
			//body outline
			g.setColor(Color.black);
			g.drawOval(440, 340, 80, 135);
			//arm and leg
			g.setColor(koala);
			g.fillRoundRect(500, 380, 50, 25, 20, 20);
			g.fillRoundRect(490, 440, 60, 25, 20, 20);
			//arm and leg outline	
			g.setColor(Color.black);
			g.drawRoundRect(500, 380, 50, 25, 20, 20);
			g.drawRoundRect(490, 440, 60, 25, 20, 20);
						
			//////HEAD//////
			//ears
			g.setColor(koala);
			g.fillOval(490, 280, 45, 55);
			g.fillOval(420, 280, 45, 55);
			//ear outline
			g.setColor(Color.black);
			g.drawOval(490, 280, 45, 55);
			g.drawOval(420, 280, 45, 55);
			//head
			g.setColor(koala);
			g.fillOval(440, 300, 75, 65);
			//head outline
			g.setColor(Color.black);
			g.drawOval(440, 300, 75, 65);
			//face
			g.fillOval(470, 330, 15, 20);
			g.fillOval(455, 325, 7, 7);
			g.fillOval(493, 325, 7, 7);
			//throat
			g.setColor(Color.white);
			w.addPoint(472, 350);
			w.addPoint(483,350);
			w.addPoint(487, 364);
			w.addPoint(469,364);
			g.fillPolygon(w);
			//lips
			g.setColor(lips);
			m.addPoint(472, 350);
			m.addPoint(484, 350);
			m.addPoint(485, 355);
			m.addPoint(471, 355);
			g.fillPolygon(m);
		
		
			//leaves 1
			for (int l = 0; l <= 1000; l++)
			{
				int x = (int)(Math.random()*getWidth()-400);
				int y = (int)(Math.random()*getHeight()-300);
				drawLeaf1(x, y, g);
			}
			
		
		
		
		}
	
	
	private void drawLeaf1(int x, int y, Graphics g)
	{
		Color grass = new Color(128,155,94);
		g.setColor(grass);
		g.fillOval(x,y,20,14);
		g.setColor(Color.black);
		g.drawOval(x,y,20,14);
	}

	private void drawLeaf2(int x, int y, Graphics g)
	{
		Color grass = new Color(128,155,94);
		g.setColor(grass);
		g.fillOval(x,y,20,14);
		g.setColor(Color.black);
		g.drawOval(x,y,20,14);
	}
	
}
