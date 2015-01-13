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
		y=315;
		for(int x=450;x>=430;x-=1)
		{
			g.setColor(Color.pink);
			g.drawArc(x,285,15,15,y,-135);
			y-=1;
		}
		
	}
	
	private void drawHabitat(Graphics g)
	{
		g.setColor(Color.black);
		//Rectangle
		g.drawRect(10,10,800,700);
		//Ice Hole
		g.fillOval(350,300,100,100);
		//Left Igloo
		g.drawArc(20,20,100,150,0,180);//Main
		g.drawLine(20,95,120,95);//Bottom
		//Vertical Lines
		g.drawLine(40,95,40,35);//Left
		g.drawLine(60,95,60,23);//2nd
		g.drawLine(80,95,80,23);//3rd
		g.drawLine(100,95,100,35);//Right
		//Horizontal Lines
		g.drawLine(60,23,80,23);//Top
		g.drawLine(40,35,100,35);//Second
		g.drawLine(33,47,108,47);//Third
		g.drawLine(26,59,114,59);//Fourth
		g.drawLine(23,71,118,71);//Fifth
		g.drawLine(22,83,119,83);//Sixth
		
		
		//Right Igloo
		g.drawArc(320,20,100,150,0,180);//Main
		g.drawLine(320,95,420,95);//Bottom
		//Vertical Lines
		g.drawLine(340,95,340,35);//Left
		g.drawLine(360,95,360,23);//2nd
		g.drawLine(380,95,380,23);//3rd
		g.drawLine(400,95,400,35);//Right
		//Horizontal Lines
		g.drawLine(360,23,380,23);//Top
		g.drawLine(340,35,400,35);//Second
		g.drawLine(333,47,408,47);//Third
		g.drawLine(326,59,414,59);//Fourth
		g.drawLine(323,71,418,71);//Fifth
		g.drawLine(322,83,419,83);//Sixth
	}
}
