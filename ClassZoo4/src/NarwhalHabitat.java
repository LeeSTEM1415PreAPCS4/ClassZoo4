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
		//Body
		g.setColor(new Color(109,141,145));
		g.fillArc(350,200,175,300,180,-135);
		//Head
		//g.setColor(Color.black);
		g.fillArc(410,229,105,105,45,-155);
		//Eyes
		g.setColor(new Color(235,233,223));
		g.fillOval(500,260,10,30);//Right
		g.fillOval(485,260,10,30);//Left
		//Irises
		g.setColor(new Color(0,0,255));
		g.fillOval(502,265,6,23);//Right
		g.fillOval(487,265,6,23);//Left
		//Horn
		g.setColor(new Color(235,247,200));
		Polygon horn = new Polygon();
		horn.addPoint(500,250);
		horn.addPoint(575,190);
		horn.addPoint(515,270);
		g.fillPolygon(horn);
		//Stripes on Horn
		g.setColor(new Color(252,190,88));
		g.drawArc(500,244,27,15,180,-190);
		g.drawArc(512,236,27,15,180,-180);
		g.drawArc(522,226,23,10,180,-180);
		//Smile
		int y=315;
		for(int x=462;x>=430;x-=1)
		{
			g.setColor(Color.black);
			g.drawArc(x,270,50,50,y,-135);
			y-=1;
		}
		//Tongue
		
		
	}
	
	private void drawHabitat(Graphics g)
	{
		g.setColor(Color.black);
		g.drawRect(10,10,800,700);
		g.fillOval(350,300,100,100);
		
	}
}
